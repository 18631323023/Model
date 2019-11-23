package com.wisewin.model.util;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.demo.TransferManagerDemo;
import com.qcloud.cos.exception.CosClientException;
import com.qcloud.cos.exception.CosServiceException;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.model.StorageClass;
import com.qcloud.cos.model.UploadResult;
import com.qcloud.cos.region.Region;
import com.qcloud.cos.transfer.Transfer;
import com.qcloud.cos.transfer.TransferManager;
import com.qcloud.cos.transfer.TransferProgress;
import com.qcloud.cos.transfer.Upload;

import java.io.File;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class COSUtil {
    // 1 初始化用户身份信息（secretId, secretKey）。
    private static final String secretId = "AKIDVotkQrEeO8drpYiJLWbT5RXquiCQK8nD";
    private static final String secretKey = "UjiVCdoeF0VQ5btvlMp9E9sMcgaQ7Vda";
    // 指定要上传到的存储桶- bucket名需包含appid
    private static final String bucketName = "image-1259353315";
    // 指定要上传到 COS 上对象键
    private static String key = "";
    // 2 设置bucket的区域, COS地域的简称请参照 https://www.qcloud.com/document/product/436/6224
    private static String region_name = "ap-beijing";
    // urlName		    替换成自己的
    private static String urlName ="https://image-1259353315.cos.ap-beijing.myqcloud.com/";

    // 上传文件, 根据文件大小自动选择简单上传或者分块上传。
    public static String uploadFile(String filePath) {
        // 1 初始化用户身份信息(secretId, secretKey)
        COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);
        // 2 设置bucket的区域, COS地域的简称请参照 https://www.qcloud.com/document/product/436/6224
        ClientConfig clientConfig = new ClientConfig(new Region(region_name));
        // 3 生成cos客户端
        COSClient cosclient = new COSClient(cred, clientConfig);

        ExecutorService threadPool = Executors.newFixedThreadPool(32);
        // 传入一个threadpool, 若不传入线程池, 默认TransferManager中会生成一个单线程的线程池。
        TransferManager transferManager = new TransferManager(cosclient, threadPool);

        File localFile = new File(filePath);
        String fileName=localFile.getName();
        String fileTyle=fileName.substring(fileName.lastIndexOf("."),fileName.length());
        Random random = new Random();
        String name = random.nextInt(10000) + System.currentTimeMillis() + fileTyle;

        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, name, localFile);
        // 设置存储类型, 默认是标准(Standard), 低频(standard_ia), 近线(nearline)
        putObjectRequest.setStorageClass(StorageClass.Standard_IA);
        try {
            // 返回一个异步结果Upload, 可同步的调用waitForUploadResult等待upload结束, 成功返回UploadResult, 失败抛出异常.
            long startTime = System.currentTimeMillis();
            Upload upload = transferManager.upload(putObjectRequest);
            showTransferProgress(upload);
            UploadResult uploadResult = upload.waitForUploadResult();
            long endTime = System.currentTimeMillis();
            System.out.println("used time: " + (endTime - startTime) / 1000);
            System.out.println(uploadResult.getETag());
        } catch (CosServiceException e) {
            e.printStackTrace();
        } catch (CosClientException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        transferManager.shutdownNow();
        cosclient.shutdown();
        return urlName+name;
    }

    
    public static void main(String[] args) {

        String urlName = uploadFile("C:\\tupian\\ 1573829005945_698.jpg");
        System.out.println(urlName);
    }

    private static void showTransferProgress(Transfer transfer) {
        System.out.println(transfer.getDescription());
        do {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                return;
            }
            TransferProgress progress = transfer.getProgress();
            long so_far = progress.getBytesTransferred();
            long total = progress.getTotalBytesToTransfer();
            double pct = progress.getPercentTransferred();
            System.out.printf("[%d / %d]\n", so_far, total);
        } while (transfer.isDone() == false);
        System.out.println(transfer.getState());
    }


}

//package com.wisewin.model.util;
//
//
//import com.wisewin.model.pop.SystemConfig;
//import com.wisewin.model.service.AuthService;
//import com.wxapi.WxApiCall.WxApiCall;
//import com.wxapi.model.RequestModel;
//
//import java.io.IOException;
//import java.net.URLEncoder;
//import java.util.HashMap;
//import java.util.Map;
//
//public class BodyKeyPointUtil {
//    /**
//     * 百度云
//     * @param filePath
//     * @return
//     * @throws Exception
//     */
//    public static String getBodyKeyPoint(String filePath)throws Exception{
//
//            // 请求url
//            String url = "https://aip.baidubce.com/rest/2.0/image-classify/v1/body_analysis";
//
//            //String imgPath = ImageUtil.reduceImg(SystemConfig.getString("pictureurl")+filePath);
//            byte[] imgData = FileUtil.readFileByBytes(SystemConfig.getString("pictureurl")+filePath);
//            String imgStr = Base64Util.encode(imgData);
//            String imgParam = URLEncoder.encode(imgStr, "UTF-8");
//
//            String param = "image=" + imgParam;
//
//            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
//            String accessToken = AuthService.getAuth();
//
//            String result = HttpUtil.post(url, accessToken, param);
//            return result;
//
//    }
//
//    /**
//     * 京东云
//     * @param
//     * @return
//     * @throws Exception
//     */
//    public static String getBodyKeyPointJd(String filePath){
//
//        // 请求url
//        String url = "https://aiapi.jd.com/jdai/pose_estimation";
//        //AppKey
//        String appkey = "0e39d25ff7f437889e331ca2039a919a";
//        //SecretKey
//        String secretKey = "a16006bca35147ea8b68d71dba83904d";
//        int muti_det = 1;//单人姿态预测或多人姿态预测；当值为1时，实现单人姿态预测；当值为2时，实现多人姿态预测
//
//        RequestModel model = new RequestModel();
//        model.setGwUrl(url);
//        model.setAppkey(appkey);
//        model.setSecretKey(secretKey);
//        model.setFilePath(filePath);
//        Map<String, Object> queryMap = new HashMap();
//        queryMap.put("muti_det", muti_det);
//        model.setQueryParams(queryMap);
//        WxApiCall call = new WxApiCall();
//        call.setModel(model);
//        String string = call.request();
//        System.out.println(string);
//        return string;
//
//    }
//
//    public static void main(String[] args) throws IOException {
//       String str = getBodyKeyPointJd("C:\\Users\\86186\\Desktop\\新建文件夹\\1574301590873.jpg");
//       System.out.println(str);
//    }
//
//
//
//}

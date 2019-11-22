package com.wisewin.model.util;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class Email {


    // 发件人的 邮箱 和 密码（替换为自己的邮箱和密码）
    // PS: 某些邮箱服务器为了增加邮箱本身密码的安全性，给 SMTP 客户端设置了独立密码（有的邮箱称为“授权码”）, 
    //     对于开启了独立密码的邮箱, 这里的邮箱密码必需使用这个独立密码（授权码）。
    public static String myEmailAccount = "18631323023@163.com";
    public static String myEmailPassword = "q492690314";

    // 发件人邮箱的 SMTP 服务器地址, 必须准确, 不同邮件服务器地址不同, 一般(只是一般, 绝非绝对)格式为: smtp.xxx.com
    // 网易163邮箱的 SMTP 服务器地址为: smtp.163.com
    public static String myEmailSMTPHost = "smtp.163.com";


    // 收件人邮箱（替换为自己知道的有效邮箱）
    public static String receiveMailAccount = "492690314@qq.com";

    public static String  send() throws Exception {
        // 1. 创建一封邮件
        Properties props = new Properties(); // 用于连接邮件服务器的参数配置（发送邮件时才需要用到）
        props.setProperty("mail.transport.protocol", "smtp");  // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.smtp.host", myEmailSMTPHost);  // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.auth", "true");// 需要请求认证


        Session session = Session.getInstance(props); // 根据参数配置，创建会话对象（为了发送邮件准备的）
        session.setDebug(true); // 设置为debug模式, 可以查看详细的发送 log
//        MimeMessage message = new MimeMessage(session);     // 创建邮件对象

        // 3. 创建一封邮件
        MimeMessage message = createMimeMessage(session, myEmailAccount, receiveMailAccount);


        // 4. 根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();

        //    PS_03: 仔细看log, 认真看log, 看懂log, 错误原因都在log已说明。
        transport.connect(myEmailAccount, myEmailPassword);

        // 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());


        // 7. 关闭连接
        transport.close();
        return "200";

    }

    /**
     *      * 创建一封只包含文本的简单邮件
     *      *
     *      * @param session 和服务器交互的会话
     *      * @param sendMail 发件人邮箱
     *      * @param receiveMail 收件人邮箱
     *      * @return
     *      * @throws Exception
     *      
     */
    public static MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail) throws Exception {
        // 1. 创建一封邮件
        MimeMessage message = new MimeMessage(session);


        // 2. From: 发件人（昵称有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改昵称）
        message.setFrom(new InternetAddress(sendMail, "酒店管理系统", "UTF-8"));


        // 3. To: 收件人（可以增加多个收件人、抄送、密送）
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "线程", "UTF-8"));


// 4. Subject: 邮件主题（标题有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改标题）
        message.setSubject("szq酒店管理系统邮件", "UTF-8");


// 5. Content: 邮件正文（可以使用html标签）（内容有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改发送内容）
        message.setContent("请速检查后台线程", "text/html;charset=UTF-8");


// 6. 设置发件时间
        message.setSentDate(new Date());


// 7. 保存设置
        message.saveChanges();


        return message;

    }

    /**
     *
     * @param email 接收邮件的
     * @param subject 邮件的主题
     * @param emailMsg 邮件内容
     * @throws AddressException
     * @throws MessagingException
     */
    public static String sendMail(String email, String subject,String emailMsg)
            throws AddressException, MessagingException {
        // 1.创建一个程序与邮件服务器会话对象 Session

        Properties props = new Properties();
        //发邮件协议
        props.setProperty("mail.transport.protocol", "SMTP");
        //发送邮件的服务器地址使用163服务器发送
        props.setProperty("mail.host", "smtp.163.com");
        // 指定验证为true
        props.setProperty("mail.smtp.auth", "true");

        // 创建验证器
        Authenticator auth = new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                /**
                 * 163 的邮箱账号和密码
                 * username : 发邮件的账号
                 * password : 发邮件的密码
                 */
                return new PasswordAuthentication("18631323023@163.com", "q492690314");
            }
        };

        Session session = Session.getInstance(props, auth);

        // 2.创建一个Message，它相当于是邮件内容
        Message message = new MimeMessage(session);
        // 设置发送者
        message.setFrom(new InternetAddress("18631323023@163.com"));
        // 设置发送方式与接收者
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));

        message.setSubject(subject);
        // message.setText("这是一封激活邮件，请<a href='#'>点击</a>");
        message.setContent(emailMsg, "text/html;charset=utf-8");

        // 3.创建 Transport用于将邮件发送

        Transport.send(message);
        return "200";
    }


}

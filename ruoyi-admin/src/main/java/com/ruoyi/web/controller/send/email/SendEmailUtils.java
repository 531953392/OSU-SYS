package com.ruoyi.web.controller.send.email;

import io.github.biezhi.ome.OhMyEmail;
import io.github.biezhi.ome.SendMailException;

import java.util.Properties;

import static io.github.biezhi.ome.OhMyEmail.SMTP_163;

public class SendEmailUtils {

    public static void Send(String emailAddress, String content, String subject) {

        OhMyEmail.config(SMTP_163(false), "18010549761@163.com", "dxs531953392");
        try {
            OhMyEmail.subject(subject)
                    .from("益钱网-欧洲在线退税")
                    .to(emailAddress)
                    .text(content)
                    .send();
        } catch (SendMailException e) {
            e.printStackTrace();
        }
    }

    public static Properties SMTP_ENT_notice(boolean debug) {
        Properties props = OhMyEmail.defaultConfig(debug);
        props.put("mail.smtp.host", "smtpdm.aliyun.com");
        //props.put("mail.smtp.port", "80");
        return props;
    }



    public static void SendHtml(String emailAddress, String content, String subject) {
        Properties properties = new Properties();
        properties = OhMyEmail.defaultConfig(false);
        properties.put("mail.smtp.host","smtphz.qiye.163.com");

        OhMyEmail.config(properties, "order@lizhishun.com", "NUyu31zaGgcvdTSB");

        try {
            OhMyEmail.subject(subject)
                    .from("【光速卡购from】礼品卡密钥")
                    .to(emailAddress)
                    .html(content)
                    .send();
        } catch (SendMailException e) {
            e.printStackTrace();
        }
    }
}

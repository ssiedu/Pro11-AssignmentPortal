package com.ssi.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtil {
	
	
	public static void send(String to, String subject, String text){
		
		Properties prop=System.getProperties();
		prop.setProperty("mail.smtp.host", "smtp.gmail.com");
		prop.setProperty("mail.smtp.auth", "true");
		prop.setProperty("mail.smtp.starttls.enable", "true");
		
		Session session=Session.getDefaultInstance(prop, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("ssiedu123@gmail.com","ssiindore");
            }
		});
		
		try{
		MimeMessage msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress("ssiedu123@gmail.com"));
		msg.addRecipient(RecipientType.TO, new InternetAddress(to));
		msg.setSubject(subject);
		msg.setText(text);
		Transport.send(msg);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}

package com.lcwd;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class App 
{
    public static void main( String[] args ) throws MessagingException
    {
        System.out.println( "Preparing to send message ....!!!" );
        
        String message = "Hello, Dear this message is for security check..... ";
        String subject = "technoD = Confirmation";
        String to = "durgeshganore20@gmail.com";
        String from = "2017durgeshganore@gmail.com";
        
        //sendEmail(message,subject,to,from);
        sendAttach(message,subject,to,from);
    }
    
    //this method is responsible to send the message with attachments
    private static void sendAttach(String message, String subject, String to, String from) {
		
    	//variable for gmail host
    			String host="smtp.gmail.com";
    			
    			//get the system properties
    			Properties properties = System.getProperties();
    			System.out.println("PROPERTIES "+properties);
    			
    			//setting important information to property object 
    			
    			//host set
    			properties.put("mail.smtp.host", host);
    			properties.put("mail.smtp.port","465");
    			properties.put("mail.smtp.ssl.enable","true");
    			properties.put("mail.smtp.auth","true");
    			
    			//Step 1 : to get the session object
    			Session session = Session.getInstance(properties, new Authenticator() {

    				@Override
    				protected PasswordAuthentication getPasswordAuthentication() {
    					return new PasswordAuthentication("2017durgeshganore@gmail.com","ucrt frsu hqat mtyk");
    				}	
    			});
    			
    			session.setDebug(true);
    			
    			//Step 2 : Compose the message[text, multi media]
    			MimeMessage m = new MimeMessage(session);
    			
    			try {
    			
    			//from email id
    			m.setFrom(from);
    			
    			//adding recipient 
    			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    			
    			//adding subject to message
    			m.setSubject(subject);
    			
    			//attachments......
    			//file path
    			String path="C:\\Users\\sai\\Pictures\\logo.jpg";
    			
    			MimeMultipart mimeMultipart =new MimeMultipart();
    			
    			//text
    			//attachment(file)
    			MimeBodyPart textMime = new MimeBodyPart();
    			
    			MimeBodyPart fileMime = new MimeBodyPart();
    			
    			try {
    				
    				textMime.setText(message);
    				
    				File file = new File(path);
    				fileMime.attachFile(file);
    				
    				mimeMultipart.addBodyPart(textMime);
    				mimeMultipart.addBodyPart(fileMime);
    				
    				
    			}catch(Exception e) {
    				e.printStackTrace();
    			}
    			
    			m.setContent(mimeMultipart);

    			//Send the message
    			
    			//Step 3 : send the message by using transport class
    			Transport.send(m);
    			
    			System.out.println("Message send successfully ...................");

    			}
    			catch(Exception e) {
    				e.printStackTrace();
    			}
	}
	//this method is responsible to send email...
	private static void sendEmail(String message, String subject, String to, String from) throws MessagingException {
		
		//variable for gmail host
		String host="smtp.gmail.com";
		
		//get the system properties
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES "+properties);
		
		//setting important information to property object 
		
		//host set
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.ssl.enable","true");
		properties.put("mail.smtp.auth","true");
		
		//Step 1 : to get the session object
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("2017durgeshganore@gmail.com","ucrt frsu hqat mtyk");
			}	
		});
		
		session.setDebug(true);
		
		//Step 2 : Compose the message[text, multi media]
		MimeMessage m = new MimeMessage(session);
		
		try {
		
		//from email id
		m.setFrom(from);
		
		//adding recipient 
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		
		//adding subject to message
		m.setSubject(subject);
		
		//adding text to mesaage
		m.setText(message);

		//Send the message
		
		//Step 3 : send the message by using transport class
		Transport.send(m);
		
		System.out.println("Message send successfully ...................");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

package quizzer;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.util.Properties;
import javax.mail.*;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.*;
import java.io.IOException;
import java.io.InputStream.*;
import java.net.*;
import javax.net.ssl.*;

public class Mathoria_Quizzer extends JFrame {
	static int user_score = 0;
	static double answer;
	private ImageIcon image1;
	private JLabel label1;
	
	Mathoria_Quizzer(String image_1)
	{
		image1 = new ImageIcon(getClass().getResource(image_1));
		label1 = new JLabel(image1);
		add(label1);
	}
	
	public static void sendEmail(String recepient) throws MessagingException, java.lang.NullPointerException, IOException,SSLHandshakeException
	{
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		
		//Declaring variables for email and password
		
		//final String myAccountEmail = "2017durgeshganore@gmail.com";
		//final String Password =  "czklpzkopdvtyzls";
		
		final String myAccountEmail = "testexpertsystem21@gmail.com";
		final String Password = "typrcmlzegddchso";
		
		//Creating a session
		Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(myAccountEmail,Password);
				
			}
			
		});
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myAccountEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setSubject("Congratulations on completing Quiz sucessfully!");
			
			//Attach something to the email
			Multipart emailcontent = new MimeMultipart();
			
			//Text Body Part
			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setText("Hola From Teotihucan Pyramid, Mexico!");
			
			//Attachment Body Part
			MimeBodyPart pdfreward = new MimeBodyPart();
			pdfreward.attachFile("C:\\Users\\dell\\Downloads\\Student+Materials_Various+Topics\\Student Materials For This Lesson\\Reward.pdf");
			
			//Attach Body Parts
			emailcontent.addBodyPart(textBodyPart);
			emailcontent.addBodyPart(pdfreward);
			message.setContent(emailcontent);
			
			//Attach the multipart to a message
			Transport.send(message);
			System.out.println("Heloo");
			System.out.println("Your message is sent sucessfully, Thank you:)!!");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args)throws Exception, MessagingException {
		Scanner text = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		Mathoria_Quizzer gui1 = new Mathoria_Quizzer("image1.jpg");
		Mathoria_Quizzer gui2 = new Mathoria_Quizzer("image2.jpg");
		Mathoria_Quizzer gui3 = new Mathoria_Quizzer("image3.jpg");
		Mathoria_Quizzer gui4 = new Mathoria_Quizzer("image4.jpg");
		
		System.out.println(ANSI.GREEN_BRIGHT);
		System.out.println("**********************************************************************************");
		System.out.println("Welcome to Mathoria Quizzer");
		System.out.println("**********************************************************************************");
		
		System.out.println(ANSI.RED_BRIGHT);
		System.out.println("#     #                  ");                          
		System.out.println("##   ##   ##   ##### #    #  ####  #####  #   ##   ");
		System.out.println("# # # #  #  #    #   #    # #    # #    # #  #  #  ");
		System.out.println("#  #  # #    #   #   ###### #    # #    # # #    #");
		System.out.println("#     # ######   #   #    # #    # #####  # ###### ");
		System.out.println("#     # #    #   #   #    # #    # #   #  # #    # ");
		System.out.println("#     # #    #   #   #    #  ####  #    # # #    # ");
		
		System.out.println(ANSI.RESET);
		
		Thread.sleep(2000);
		System.out.println(ANSI.BLUE_BRIGHT + "You will need to answer three question from different math topic ");
		Thread.sleep(2000);
		System.out.println("You will be starting the quiz in countdown of 5 seconds, get ready!");
		int count_down = 5;
		while(count_down != 0)
		{
			count_down = count_down-1;
			if(count_down == 0)
			{
				System.out.println(ANSI.RED_BOLD_BRIGHT +"Let's begin!");
				System.out.println("**********************************************************************************");
				//Question 1
				System.out.println(ANSI.RESET +"Question 1:- ");
				Thread.sleep(1000);
				System.out.println("The pyramid of the Sun is in the anicient Mexican City of Teotihuacan. The base is a square with sides about 700ft long. ");
				System.out.println("The height of pyramid is about 200ft. Find the angle of elevation of the edge indicated in the figure to two significant digits.");
				Thread.sleep(1000);
				System.out.println(ANSI.CYAN_BOLD_BRIGHT +"Hint:- The base of triangle in the figure has measure half the diagonal of the square base of the pyramid.");
				System.out.println("**********************************************************************************");
				gui1.setVisible(true);
				gui1.pack();
				gui1.setTitle(ANSI.RESET +"Quetion 1");
				System.out.println("You have 8 minutes to solve and answer this question");
				Thread.sleep(2000);
				System.out.println(ANSI.RED_BOLD +"Time is up!");
				//Calculating the answer
				double side_AC =0.5 * (Math.sqrt(Math.pow(700, 2) + Math.pow(700, 2)));
				double tan_theta = Math.toDegrees(Math.atan(200/side_AC));
				double approx_answer = Math.round(tan_theta);
				System.out.println("Please enter your answer rounded to whole number");
				answer = number.nextDouble();
				Thread.sleep(1000);
				if(answer == approx_answer)
				{
					System.out.println(ANSI.GREEN_BRIGHT +"Correct!");
					user_score = user_score + 1;
				}
				else if(answer != approx_answer)
				{
					System.out.println(ANSI.RED_BOLD_BRIGHT + "Incorrect");
					System.out.println("The correct answer is:- " + approx_answer);
				}
				Thread.sleep(1000);
				System.out.println(ANSI.RESET+ "Get ready for Question 2");
				Thread.sleep(2000);
				gui1.setVisible(false);
				gui2.setVisible(true);
				gui1.pack();
				
				//Question 2
				gui1.setTitle(ANSI.RESET +"Quetion 2");
				System.out.println("**********************************************************************************");
				System.out.println("Question 2");
				Thread.sleep(1000);
				System.out.println("Cacti located at the botanical gardens of Teotihuacan are quite tall. \nFind out the height of the cactus(side AB) in the picture here using one of the trigonametric ratio formula(SOH CAH TOA).");
				System.out.println("**********************************************************************************");
				System.out.println("You have 8 minutes to solve and answer this question");
				Thread.sleep(2000);
				System.out.println(ANSI.RED_BOLD +"Time is up!");
				//Calculating the answer for the question 2
				double tria_height = 17.6 * (Math.tan(Math.toRadians(50)));
				System.out.println("Please enter your answer rounded to whole number");
				answer = number.nextDouble();
				Thread.sleep(1000);
				if(answer == Math.round(tria_height))
				{
					System.out.println(ANSI.GREEN_BRIGHT +"Correct!");
					user_score = user_score + 1;
				}
				else if(answer != Math.round(tria_height))
				{
					System.out.println(ANSI.RED_BOLD_BRIGHT + "Incorrect");
					System.out.println("The correct answer is:- " + tria_height);
				}
				Thread.sleep(1000);
				System.out.println(ANSI.RESET + "Get ready for question 3");
				Thread.sleep(2000);
				gui1.setVisible(false);
				gui2.setVisible(false);
				
				//Question 3
				System.out.println("**********************************************************************************");
				System.out.println("Question 3");
				Thread.sleep(1000);
				System.out.println("The instruction for this question is provided in the image display here ");
				System.out.println("Have a look at the image that contains the key to understand what each Egyptian symbol represents ");
				System.out.println("**********************************************************************************");
				gui3.setVisible(true);
				gui1.pack();
				gui1.setTitle(ANSI.RESET +"Quetion 3 key");
				Thread.sleep(2000);
				gui4.setVisible(true);
				gui4.pack();
				gui4.setTitle(ANSI.RESET +"Quetion 3");
				System.out.println("You have 8 minutes to solve and answer this question");
				Thread.sleep(2000);
				System.out.println(ANSI.RED_BOLD +"Time is up!");
				//calculating the answer for question no 3
				int earning = (30*16*20) - (30*200);
				System.out.println("Please enter your answer rounded to whole number");
				answer = number.nextDouble();
				Thread.sleep(1000);
				if(answer == earning)
				{
					System.out.println(ANSI.GREEN_BRIGHT +"Correct!");
					user_score = user_score + 1;
				}
				else if(answer != earning)
				{
					System.out.println(ANSI.RED_BOLD_BRIGHT + "Incorrect");
					System.out.println("The correct answer is:- " + approx_answer);
				}
				
				if(user_score == 3)
				{
					System.out.println(ANSI.BLUE_BOLD_BRIGHT +"Congratulations on completing all the questions correctly! ");
					Thread.sleep(1000);
					System.out.println(ANSI.RED_BRIGHT +"Please enter your email address here to receive an award for your performance");
					String email = text.nextLine();
					Mathoria_Quizzer.sendEmail(email);
					
				}
				else if(user_score != 3)
				{
					System.out.println(ANSI.BLUE_BOLD_BRIGHT +"Your Score is:- " + user_score + "/3 points");
					System.out.println("Thank you for taking the quiz!");
				}
			}
			else
			{
				System.out.println(ANSI.RED_BOLD_BRIGHT + count_down);
				Thread.sleep(1000);
			}
		}

	}

}

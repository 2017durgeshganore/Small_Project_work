package operator;

import java.util.*;
import java.io.File;
import javax.sound.sampled.*;
import java.io.IOException;


public class Linguist_Operator {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Scanner scanner=new Scanner(System.in);
		//Scanner sc1=new Scanner(System.in);
		System.out.println("Welcome to the Linguist Operator, where will learn Arabic language ");
		System.out.printf("%30s %n","------------ Hi, I am your  liguist operator ------------");
		System.out.printf("%30s %n","A.Arabic");
		System.out.printf("%31s %n","B.Spanish");
		System.out.println("What language would you like to learn?");
		String user_response = scanner.nextLine();
		if(user_response.equals("A"))
		{
			System.out.println("Welcome to Arabic Linguist operator, whar would you like to learn first?\n 1.Greeting Phrases\n 2.Small Talk Phrases\n 3.Farewell Phrases");
			String choose = scanner.nextLine();
			switch(choose)
			{
			case("1"):
				System.out.printf("%20s %n", "------------ Written Phrases in Arabic ------------");
				System.out.println("English Greeting Phrases:- Hello, How are you doing? ");
				System.out.println("Arabic Greeting Phrases:- ahlas keef tasir al-amour maake? ");
				System.out.printf("%20s %n", "------------ Pronounciation in Arabic ------------");
				File file = new File("ArabGreet.wav");
				AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
				Clip clip = AudioSystem.getClip();
				clip.open(audioStream);
				System.out.println("Enter P to play the audio");
				String response = scanner.nextLine();
				response = response.toUpperCase();
				if(response.equals("P"))
				{
					clip.start();
					System.out.print("Enter R to play again");
					
					response = scanner.nextLine();
					response = response.toUpperCase();
					
					if(response.equals("R"))
					{
						clip.setMicrosecondPosition(0);
						clip.start();
						
						System.out.println("Enter E to exit");
						
						response = scanner.nextLine();
						response = response.toUpperCase();
						
						System.out.println("Thank you");
					}	
				}
			break;
				
			case("2"):
				System.out.printf("%20s %n", "------------ Written Phrases in Arabic ------------");
				System.out.println("English Small Talk Phrase:- Beautiful day, isn't it? ");
				System.out.println("Arabic Small Talk Phrase:- yom gemil ، alise kezelke? ");
				System.out.printf("%20s %n", "------------ Pronounciation in Arabic ------------");
				File file2 = new File("Arabtalk.wav");
				AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
				Clip clip2 = AudioSystem.getClip();
				clip2.open(audioStream2);
				System.out.println("Enter P to play the audio");
				String response2 = scanner.nextLine();
				response2 = response2.toUpperCase();
				if(response2.equals("P"))
				{
					clip2.start();
					System.out.print("Enter R to play again");
					
					response2 = scanner.nextLine();
					response2 = response2.toUpperCase();
					
					if(response2.equals("R"))
					{
						clip2.setMicrosecondPosition(0);
						clip2.start();
						
						System.out.println("Enter E to exit");
						
						response2 = scanner.nextLine();
						response2 = response2.toUpperCase();
						
						System.out.println("Thank you");
					}	
				}
			break;
			
			case("3"):
				System.out.printf("%20s %n", "------------ Written Phrases in Arabic ------------");
				System.out.println("English Small Farewell Phrase:- See you later ");
				System.out.println("Arabic Farewell Phrase:- arak lahaka ");
				System.out.printf("%20s %n", "------------ Pronounciation in Arabic ------------");
				File file3 = new File("farewell.wav");
				AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(file3);
				Clip clip3 = AudioSystem.getClip();
				clip3.open(audioStream3);
				System.out.println("Enter P to play the audio");
				String response3 = scanner.nextLine();
				response3 = response3.toUpperCase();
				if(response3.equals("P"))
				{
					clip3.start();
					System.out.print("Enter R to play again");
					
					response3 = scanner.nextLine();
					response3 = response3.toUpperCase();
					
					if(response3.equals("R"))
					{
						clip3.setMicrosecondPosition(0);
						clip3.start();
						
						System.out.println("Enter E to exit");
						
						response3 = scanner.nextLine();
						response3 = response3.toUpperCase();
						
						System.out.println("Thank you");
					}	
				}
			break;
				
			}
			
		}
		
		else if(user_response.equals("B"))
		{
			System.out.println("Contact to Someone else ");
		}
		
		//Scanner user_feedback = new Scanner(System.in);
		System.out.printf("%60s %n", "Did you enjoy learning Arabic language?");
		System.out.printf("%30s %n", "YES or NO");
		String user_opinion = scanner.nextLine();
		user_opinion = user_opinion.toUpperCase();
		if(user_opinion.equals("YES"))
		{
			System.out.printf("%50s %n", "We are glad to hear that!");
		}
		else
		{
			System.out.printf("%50s %n", "We are sorry to hear that! ");
		}
		scanner.close();
	

	}

}

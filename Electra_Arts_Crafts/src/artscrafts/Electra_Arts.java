package artscrafts;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Electra_Arts extends JFrame{
	private ImageIcon image1;
	private JLabel label1;
	private ImageIcon image2;
	private JLabel label2;
	
	Electra_Arts(String image_1, String image_2)
	{
		/*
		 * Author Name :- Durgesh Ganore.
		 * Program Name :- Electra Artisans.java
		 * Program Description :- 
		 * Date Created :- 17/01/2023
		 * 
		 */
		setLayout(new FlowLayout());
		image1= new ImageIcon(getClass().getResource(image_1));
		label1 = new JLabel(image1);
		add(label1);
		image2 = new ImageIcon(getClass().getResource(image_2));
		label2 = new JLabel(image2);
		add(label2);
	}

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, java.lang.NullPointerException {
		System.out.println("Hello");
		Scanner object = new Scanner(System.in);
		Scanner object_2 = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		String six_sigma = "";
		Electra_Arts Mexico = new Electra_Arts("photo_1.jpg","photo_2.jpg");
		Electra_Arts Bolivia = new Electra_Arts("photo_3.jpg","photo_4.jpg");
		String authorized_username = "electra";
		String authorized_password = "electra@123";
		System.out.println("*********Welcome to the Electra Artians System *********");
		System.out.println("Please select \nA.Administrator\nB.Customer");
		String selection = object.nextLine();
		switch(selection)
		{
		case("A"):
			System.out.println("********** Please Enter Username:-");
			String username = object.nextLine();
			System.out.println("********** Please Enter Password :-");
			String password = object.nextLine();
			if(username.equals(authorized_username) && password.equals(authorized_password))
			{
				System.out.println("LOgged in Sucessful, Welcome administrator");
				System.out.println("Dear Administrator, Please Select how you would like to analyze the business\n(I) Cost of Goods Computation(COGS)\n(II)Progit Margin\n(III)Six Sigma Value\n");
				String admin_choice = object.nextLine();
				if(admin_choice.equals("I"))
				{
					System.out.println("**********Cost Of Goods Sold(COGS- $) ************");
					System.out.println("********** Enter the beginning inventory price in US Dollars:-");
					int begg_inventprice = object_2.nextInt();
					System.out.println("********* Enter The purchase price :-");
					int purchase_price = object_2.nextInt();
					System.out.println("********** Enter the ending inventory price in US Dollars:-");
					int end_inventprice = object_2.nextInt();
					System.out.println("Calculating..................");
					int COGS = begg_inventprice + purchase_price - end_inventprice;
					System.out.println("The cost of goods sold for your business is" + COGS);
				}
				else if(admin_choice.equals("II"))
				{
					System.out.println("********** Profit Margin($) ************");
					System.out.println("********** Enter the net income in US Dollars:- ");
					double net_income = object_2.nextDouble();
					System.out.println("********** Enter the net revenue in US Dollars:- ");
					double revenue = object_2.nextDouble();
					System.out.println("Calculating..................");
					double profit_margin = (net_income/revenue)*100;
					System.out.println("The profit margin is :- " + profit_margin + "" + ",this means you get to keep " + profit_margin + "%" + " of your business");
					
				}
				else if(admin_choice.equals("III"))
				{
					// Calculating the DPO
					
					System.out.println("********** Six Sigma Value ************");
					System.out.println("********** Calculating the DPO(Defects Per Opportunity) **********");
					System.out.println("********** Defects :- ");
					double defects = object_2.nextDouble();
					System.out.println("********** Opportunity Per Units :- ");
					double opp = object_2.nextDouble();
					System.out.println("********** Units :- ");
					double units = object_2.nextDouble();
					double total_opportunities = units * opp;
					double DPO = defects/total_opportunities;
					
					//Calculating the yield
					
					double yield = (1 - DPO) * 100;
					if(yield>=69.10 && yield<93.33)
					{
						six_sigma = "2";
					}
					else if(yield>=93.33 && yield<93.38)
					{
						six_sigma = "3";
					}
					else if(yield>=99.38 && yield<93.97)
					{
						six_sigma = "4";
					}
					else if(yield>=99.97 && yield<99.99)
					{
						six_sigma = "5";
					}
					else if(yield>=99.99 && yield<100)
					{
						six_sigma = "6";
					}
					
					System.out.println("\nMOst Business run at 3 to 4 sigma values, achieving a 6 sigma means delecering near perfect products or services");
					System.out.println("******************** Six Sigma Results ********************");
					System.out.println("Six Sigma Value:- " +six_sigma);
					System.out.println("******************** Six Sigma Results ********************");
				}
			}
			else if(!username.equals(authorized_username) && !password.equals(authorized_password))
			{
				System.out.println("Authorization is Unscessfull !");
				System.exit(0);
			}
			break;
		case("B"):
			System.out.println("********** Welcome customer, please select the traditional arts and crafts that you would like to view from a latin aAmerican Country\nA.Mexico\nB.Bolivia");
			String selection_2 = object.nextLine();
			if(selection_2.equals("A"))
			{
				System.out.println("******************** Mexican Traditional Arts and Crafts ********************");
				System.out.println("******************** Huichol Arts andd Crafts ********************");
				System.out.println("Find out more by:-\n1.play the Huichal arts and crafts audiotrack\n2.Read About the Huichal Arts and Crafts");
				String user_choice = object.nextLine();
				if(user_choice.equals("1"))
				{
					File file = new File("Huichal.wav");
					AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
					Clip clip =AudioSystem.getClip();
					clip.open(audiostream);
					System.out.println("Enter P to play Audio track");
					String response = object_2.nextLine();
					response = response.toUpperCase();
					if(response.equals("p")) {
						clip.start();
						System.out.println("Enter S to Stop and R to Reset");
						response = object_2.nextLine();
						response = response.toUpperCase();
						if(response.equals("R"))
						{
							clip.setMicrosecondPosition(0);
							clip.start();
						}
						if(response.equals("S"))
						{
							clip.stop();
							System.out.println("Thank You !");
						}
					}
					
				}
				else if(user_choice.equals("2"))
				{
					System.out.println("********** The Huichol art from Nayarit:- Huichol art make use of wide variety of bright colors from the Huichol Indians allowing them to express their Independence ");
					
				}
				System.out.println("***************************************************************************************************************************************************************************");
				
				System.out.println("******************** Talavera from Puebla Arts andd Crafts ********************");
				System.out.println("Find out more by:-\n1.play the Talavera arts and crafts audiotrack\n2.Read About the Talavera Arts and Crafts");
				String user_choice2 = object.nextLine();
				if(user_choice2.equals("1"))
				{
					File file = new File("Talavera.wav");
					AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
					Clip clip =AudioSystem.getClip();
					clip.open(audiostream);
					System.out.println("Enter P to play Audio track");
					String response = object_2.nextLine();
					response = response.toUpperCase();
					if(response.equals("p")) {
						clip.start();
						System.out.println("Enter S to Stop and R to Reset");
						response = object_2.nextLine();
						response = response.toUpperCase();
						if(response.equals("R"))
						{
							clip.setMicrosecondPosition(0);
							clip.start();
						}
						if(response.equals("S"))
						{
							clip.stop();
							System.out.println("Thank You !");
						}
					}
					
				}
				else if(user_choice.equals("2"))
				{
					System.out.println("********** The Talavera Arts from Puebla :-  These pottery artworks are produced and supervised from artisand in a town called Talavera De La Reina \nThe artians are specialized in the style of ceramics that were introduced by arabs in Spain ");
				}
				System.out.println("********************************************************************************************************************************************************************************************************************************************************");
				System.out.println("The Huichol art picture is on the left(costs $550.55),The talavera picture is on the right(costs $780.00)");
				Mexico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Mexico.setVisible(true);
				Mexico.pack();
				Mexico.setTitle("Mexican Arts And Crafts");
			}
			else if(selection_2.equals("B"))
			{
				System.out.println("******************** Bolivian Traditional Arts and Crafts ********************");
				System.out.println("******************** Poncho Arts andd Crafts ********************");
				System.out.println("Find out more by:-\n1.play the Poncho arts and crafts audiotrack\n2.Read About the Poncho Arts and Crafts");
				String user_choice3 = object.nextLine();
				if(user_choice3.equals("1"))
				{
					File file = new File("Poncho.wav");
					AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
					Clip clip =AudioSystem.getClip();
					clip.open(audiostream);
					System.out.println("Enter P to play Audio track");
					String response = object_2.nextLine();
					response = response.toUpperCase();
					if(response.equals("p")) {
						clip.start();
						System.out.println("Enter S to Stop and R to Reset");
						response = object_2.nextLine();
						response = response.toUpperCase();
						if(response.equals("R"))
						{
							clip.setMicrosecondPosition(0);
							clip.start();
						}
						if(response.equals("S"))
						{
							clip.stop();
							System.out.println("Thank You !");
						}
					}
					
				}
				else if(user_choice3.equals("2"))
				{
					System.out.println("********** The Poncho Art :- With a are colonial origin, it a appeared with the name of unku which is a piece of fabric with an opening in the middle of the head");
					
				}
				System.out.println("***************************************************************************************************************************************************************************");
				
				System.out.println("******************** Aguayo Arts andd Crafts ********************");
				System.out.println("Find out more by:-\n1.play the Aguayo arts and crafts audiotrack\n2.Read About the Aguayo Arts and Crafts");
				String user_choice4 = object.nextLine();
				if(user_choice4.equals("1"))
				{
					File file = new File("Aguayo.wav");
					AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
					Clip clip =AudioSystem.getClip();
					clip.open(audiostream);
					System.out.println("Enter P to play Audio track");
					String response = object_2.nextLine();
					response = response.toUpperCase();
					if(response.equals("p")) {
						clip.start();
						System.out.println("Enter S to Stop and R to Reset");
						response = object_2.nextLine();
						response = response.toUpperCase();
						if(response.equals("R"))
						{
							clip.setMicrosecondPosition(0);
							clip.start();
						}
						if(response.equals("S"))
						{
							clip.stop();
							System.out.println("Thank You !");
						}
					}
					
				}
				else if(user_choice4.equals("2"))
				{
					System.out.println("********** The Aguayo Arts from Puebla :- A typing Andean textile of pre-Columbian origin and a huge cultural influence");
				}
				System.out.println("********************************************************************************************************************************************************************************************************************************************************");
				System.out.println("The Poncho art picture is on the left(costs $900.10),The poncho picture is on the right(costs $450.00)");
				Bolivia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Bolivia.setVisible(true);
				Bolivia.pack();
				Bolivia.setTitle("Bolivian Arts And Crafts");
			}
			
		}
		System.out.println("What arts and craft would you like to buy?(Huichol,Talavera,Poncho,Aguayo)");
		String user = object_2.nextLine();
		if(user.equals("Huichol"))
		{
			double price = 550.50;
			System.out.println("How many would you like to buy? ");
			int quantity = number.nextInt();
			double cost = quantity * price;
			System.out.println("Please pick up your order at one of the Electra Artisans Store");
			System.out.println("********************************************************************************************************************************************************************************************************************************************************");
			System.out.println();
			System.out.printf("%50s","Customer Receipt");
			System.out.println();
			System.out.printf("%50s","Huichol Arts and Crafts");
			System.out.println();
			System.out.printf("%40s %.3f","Price($)",cost);
			System.out.println();
			System.out.println("********************************************************************************************************************************************************************************************************************************************************");
		}
		else if(user.equals("Talavera"))
		{
			double price = 780.00;
			System.out.println("How many would you like to buy? ");
			int quantity = number.nextInt();
			double cost = quantity * price;
			System.out.println("Please pick up your order at one of the Electra Artisans Store");
			System.out.println("********************************************************************************************************************************************************************************************************************************************************");
			System.out.println();
			System.out.printf("%50s","Customer Receipt");
			System.out.println();
			System.out.printf("%50s","Huichol Arts and Crafts");
			System.out.println();
			System.out.printf("%40s %.3f","Price($)",cost);
			System.out.println();
			System.out.println("********************************************************************************************************************************************************************************************************************************************************");
		}
		else if(user.equals("Poncho"))
		{
			double price = 900.10;
			System.out.println("How many would you like to buy? ");
			int quantity = number.nextInt();
			double cost = quantity * price;
			System.out.println("Please pick up your order at one of the Electra Artisans Store");
			System.out.println("********************************************************************************************************************************************************************************************************************************************************");
			System.out.println();
			System.out.printf("%50s","Customer Receipt");
			System.out.println();
			System.out.printf("%50s","Poncho Arts and Crafts");
			System.out.println();
			System.out.printf("%40s %.3f","Price($)",cost);
			System.out.println();
			System.out.println("********************************************************************************************************************************************************************************************************************************************************");
		}
		else if(user.equals("Aguayo"))
		{
			double price = 450.00;
			System.out.println("How many would you like to buy? ");
			int quantity = number.nextInt();
			double cost = quantity * price;
			System.out.println("Please pick up your order at one of the Electra Artisans Store");
			System.out.println("********************************************************************************************************************************************************************************************************************************************************");
			System.out.println();
			System.out.printf("%50s","Customer Receipt");
			System.out.println();
			System.out.printf("%50s","Aguayo Arts and Crafts");
			System.out.println();
			System.out.printf("%40s %.3f","Price($)",cost);
			System.out.println();
			System.out.println("********************************************************************************************************************************************************************************************************************************************************");
		}
		
	}

}

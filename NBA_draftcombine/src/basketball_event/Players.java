package basketball_event;

import java.util.*;

public class Players {
	private String name;
	private int age;
	private String players_team;
	private double BMI;
	
	/*
	 * This NBA programmed system is designed and developed to record the physical measurements , personal information
	 * of perspective basketball players. there are two Scanner object has been created to stored the number input and String input. 
	 */

	public static void main(String[] args) {
		Scanner player = new Scanner(System.in);
		Scanner playermeasure = new Scanner(System.in);
		Date date = new Date();
		Measurement_taking NBA_official1 = new Measurement_taking();
		Measurement_taking NBA_official2 = new Measurement_taking();
		Players player_1 = new Players();
		Players player_2 = new Players();
		
		System.out.println("Welcome to the NBA draft measurement taking section");
		
		//Personal Information taking
		player_1.players_team = "Sixers";
		player_2.players_team = "Tigers";
		System.out.println("Could you please tell me your name player 1 ");
		player_1.name = player.nextLine();
		System.out.println("Could you please tell me your name player 2");
		player_2.name = player.nextLine();
		System.out.println("Age :");
		player_1.age = playermeasure.nextInt();
		System.out.println("Age :");
		player_2.age = playermeasure.nextInt();
		
		//MEasurement taking section
		System.out.println("Player 1 Height(feet and inches) : ");
		NBA_official1.player_height = playermeasure.nextDouble();
		System.out.println("Player 2 Height(feet and inches) : ");
		NBA_official2.player_height = playermeasure.nextDouble();
		System.out.println("Player 1 Wingspan(feet and inches) : ");
		NBA_official1.wingspan = playermeasure.nextDouble();
		System.out.println("Player 2 Wingspan(feet and inches) : ");
		NBA_official2.wingspan = playermeasure.nextDouble();
		System.out.println("Player 1 Weight(pounds) : ");
		NBA_official1.weight = playermeasure.nextDouble();
		System.out.println("Player 2 Weight(pounds) : ");
		NBA_official2.weight = playermeasure.nextDouble();
		double convertfeettoinches1 = NBA_official1.player_height *12;
		double convertfeettoinches2 = NBA_official2.player_height *12;
		double BMI_1 = (NBA_official1.weight * 703)/(convertfeettoinches1 * convertfeettoinches1);
		double BMI_2 = (NBA_official2.weight * 703)/(convertfeettoinches2 * convertfeettoinches2);
		System.out.println("---------------- Player's BMI ---------------");
		System.out.printf("%s %.2f\n","Player 1's BMI", BMI_1);
		System.out.printf("%s %.2f\n","Player 2's BMI", BMI_2);
		System.out.println("---------------- Player's BMI ---------------");
		double body_fatpercent1 = (1.20 * BMI_1) + (0.23 * player_1.age) - 16.2;
		double body_fatpercent2 = (1.20 * BMI_2) + (0.23 * player_2.age) - 16.2;
		System.out.println("---------------- Player's Body fat percentage(%) ---------------");
		System.out.printf("%s %.2f\n","Player 1's Body fat percentage", body_fatpercent1);
		System.out.printf("%s %.2f\n","Player 2's Body fat percentage", body_fatpercent2);
		System.out.println("---------------- Player's Body fat percentage(%) ---------------");
		
		NBA_official1.body_fat =  body_fatpercent1;
		NBA_official2.body_fat =  body_fatpercent2;
		
		//Display of information on the NBA drafts combine stats table
		
		System.out.println();
		System.out.println("---------------- NBA Draft Combine Event 2022) ---------------");
		System.out.printf("%s %tB %td %tY %n","----------------", date,date,date);
		System.out.printf("%20s","Player Names");
		System.out.printf("%20s","Player Ages");
		System.out.printf("%20s","Height");
		System.out.printf("%20s","Wingspan");
		System.out.printf("%20s","Weight");
		System.out.printf("%20s","Body Fat(%)");
		System.out.println();
		System.out.printf("%20s",player_1.name);
		System.out.printf("%20s",player_1.age);
		System.out.printf("%20s",NBA_official1.player_height);
		System.out.printf("%20s",NBA_official1.wingspan);
		System.out.printf("%20s",NBA_official1.weight);
		System.out.printf("%20s",NBA_official1.body_fat);
		System.out.println();
		System.out.printf("%20s",player_2.name);
		System.out.printf("%20s",player_2.age);
		System.out.printf("%20s",NBA_official2.player_height);
		System.out.printf("%20s",NBA_official2.wingspan);
		System.out.printf("%20s",NBA_official2.weight);
		System.out.printf("%20s",NBA_official2.body_fat);
		
		

	}

}

package programming;

import java.util.*;
import java.lang.Math;

public class Pythagorian_Calculator {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		System.out.println(ANSII_Colors.RED_BRIGHT);
		System.out.println("|\"");
		System.out.println("| \"");
		System.out.println("|  \"");
		System.out.println("|   \"");
		System.out.println("|    \"");
		System.out.println("|     \"");
		System.out.println("|      \"");
		System.out.println("|       \"");
		System.out.println("|        \"");
		System.out.println("|         \"");
		System.out.println("|          \"");
		System.out.println("|           \"");
		System.out.println("|            \"");
		System.out.println("|             \"");
		System.out.println("|              \"");
		System.out.println("|               \"");
		System.out.println("|________________\"");
		System.out.println("********************************");
		//Program is started
		System.out.println(ANSII_Colors.RESET +"Are you ready to begin(Yes or No)?");
		String response = text.nextLine();
		while(response.equals("Yes"))
		{
			System.out.println(ANSII_Colors.BLUE_BOLD_BRIGHT +"Which side of the right angle triangle would you like to find?\nA.Hypotenus\nB.Perpendicular\nC.Opposite");
			String side_choice = text.nextLine();
			switch(side_choice)
			{
			case "A":
				System.out.println(ANSII_Colors.RESET +"Enter the length of the perprndicular side of the right angle ");
				double perpen_len = number.nextDouble();
				System.out.println("Enter the length of the opposite side of the right angle triangle ");
				double opp_len = number.nextDouble();
				double hypot = Math.hypot(perpen_len, opp_len);
				System.out.println(ANSII_Colors.GREEN_BOLD_BRIGHT +"The lengt of the hypotenus is " + hypot);
				break;
			case "B":
				System.out.println(ANSII_Colors.RESET + "Enter the length of the hypotenus of the right angle triangle");
				double hypo_len = number.nextDouble();
				System.out.println("Enter the length of the Opposite side of the right angle triangle");
				double opp_len2 = number.nextDouble();
				double calculate_perpenlen = Math.sqrt(Math.pow(hypo_len, 2) - Math.pow(opp_len2, 2));
				System.out.println("The length of the perpendicular side is " + calculate_perpenlen);
				break;
			case "C":
				System.out.println(ANSII_Colors.RESET + "Enter the length of the hypotenus of the right angle triangle");
				double hypo_len2 = number.nextDouble();
				System.out.println("Enter the length of the perpendicular side of the right angle ttriangle ");
				double perpen_len2 = number.nextDouble();
				double calculate_opplen = Math.sqrt(Math.pow(hypo_len2, 2) - Math.pow(perpen_len2, 2));
				System.out.println("The length of the opposite side is " + calculate_opplen);
				break;
			default:
				System.out.println(ANSII_Colors.RED_BOLD +"Sorry, ou have entered an incorrect option!");
				
			}
			System.out.println(ANSII_Colors.RESET +"Are you ready to begin(Yes or No)?");
			response = text.nextLine();
			
		}
		if(response.equals("No"))
		{
			System.out.println("Okay, Have a good day!");
		}
				
		


	}

}

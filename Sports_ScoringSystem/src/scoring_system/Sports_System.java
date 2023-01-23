package scoring_system;

import java.util.*;
import java.lang.*;

public class Sports_System {

	public static void main(String[] args)throws Exception {
		Scanner select_text = new Scanner(System.in);
		Scanner select_number = new Scanner(System.in);
		System.out.println(ANSII_Colors.ROSY_PINK + "Welcome to the sports scoring system");
		Thread.sleep(1000);
		System.out.println(ANSII_Colors.RESET + "Would you like to begin calculating your score(Y or N)?");
		String response = select_text.nextLine();
		do
		{
			//Introduction Part
			System.out.println("####################################################################################################");
			System.out.println("Please choose the sport you would like to calculate the score for \nA/Golf\nB.Soccer");
			String user_choice = select_text.nextLine();
			System.out.println("####################################################################################################");
			if(user_choice.equals("A"))
			{
				//Golf Scoring Section
				System.out.println(ANSII_Colors.FOREST_GREEN);
				System.out.println("                .  .                        |>18>>");
				System.out.println("            .          .                    |");
				System.out.println("        .                .o                 |");
				System.out.println("      .                                     |");
				System.out.println("    .                                       |");
				System.out.println("  .'                                        |");
				System.out.println("^^^^^^^`^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				Thread.sleep(2000);
				// Calculating Golf Game Score
				System.out.printf("%50s","Stabelford Golf Scoring System\n");
				System.out.println("####################################################################################################");
				System.out.println("Enter the number of strokes");
				int strokes = select_number.nextInt();
				System.out.println("Enter the par");
				int par = select_number.nextInt();
				int calculate_score = strokes - par;
				if(calculate_score == 2)
				{
					System.out.println(ANSII_Colors.CYAN_BOLD_BRIGHT + "Stabelford Point:- Double Bogey or Wipe\nPoint Value:- 0 point");	
				}
				else if(calculate_score == 1)
				{
					System.out.println(ANSII_Colors.CYAN_BOLD_BRIGHT + "Stabelford Point:- Bogey\nPoint Value:- 1 point");	
				}
				else if(calculate_score == par)
				{
					System.out.println(ANSII_Colors.CYAN_BOLD_BRIGHT + "Stabelford Point:- Par\nPoint Value:- 2 points");	
				}
				else if(calculate_score == -1)
				{
					System.out.println(ANSII_Colors.CYAN_BOLD_BRIGHT + "Stabelford Point:- Birdie\nPoint Value:- 3 points");	
				}
				else if(calculate_score == -2)
				{
					System.out.println(ANSII_Colors.CYAN_BOLD_BRIGHT + "Stabelford Point:- Eagle\nPoint Value:- 4 points");	
				}
				else if(calculate_score == -3)
				{
					System.out.println(ANSII_Colors.CYAN_BOLD_BRIGHT + "Stabelford Point:- Albatross\nPoint Value:- 5 points");	
				}
				else if(calculate_score == -4)
				{
					System.out.println(ANSII_Colors.CYAN_BOLD_BRIGHT + "Stabelford Point:- Condor\nPoint Value:- 6 point");	
				}
			}
			else if(user_choice.equals("B"))
			{
				//Score Scoring System
				System.out.println(ANSII_Colors.GREEN_BRIGHT);
				System.out.println("  ___________________________");
				System.out.println(" |             |             |");
				System.out.println(" |___          |          ___|");
				System.out.println(" |_  |         |         |  _|");
				System.out.println(".| | |.       ,|.       .| | |.");
				System.out.println("|| | | )     ( | )     ( | | ||");
				System.out.println("'|_| |'       `|'       `| |_|'");
				System.out.println(" |___|         |         |___|");
				System.out.println(" |             |             |");
				System.out.println(" |_____________|_____________|");
				System.out.println(ANSII_Colors.RESET +"####################################################################################################");
				System.out.printf("%50s","Soccer Scoring System\n");
				System.out.println("####################################################################################################");
				System.out.println("Let's analyze the performance of the soccer team by calculating the PDO ");
				Thread.sleep(2000);
				System.out.println("####################################################################################################");
				System.out.printf("%50s","Save percentage Calculation\n");
				System.out.println("####################################################################################################");
				System.out.println("Enter the number of saves");
				double saves = select_number.nextInt();
				System.out.println("Enter the number of shots");
				double shots = select_number.nextInt();
				System.out.println("Enter the number of goals");
				double goals = select_number.nextDouble();
				double save_percentage = Math.round((saves/shots) * 100);
				double shooting_percentage = Math.round((goals/shots) * 100);
				double PDO = save_percentage + shooting_percentage;
				System.out.println(ANSII_Colors.LIGHT_PINK +"####################################################################################################");
				System.out.println("Soccer Scoring Results");
				System.out.println("The save percentage(%):- " + save_percentage);
				System.out.println("The shooting percentage(%):- " + shooting_percentage);
				System.out.println("The PDO score is " + PDO + "%");
				System.out.println("####################################################################################################");
				if(PDO > 100)
				{
					System.out.println(ANSII_Colors.RESET + "The soccer team is performing better than they expect and they are due for a bad luck streak! ");
				}
				else if(PDO < 100)
				{
					System.out.println(ANSII_Colors.RESET + "The soccer team is performing worse than they expect and they are due for a lucky streak! ");
				}
				else
				{
					System.out.println(ANSII_Colors.RESET + "The soccer team is at 100% PDO!");
				}
				
				System.out.println(ANSII_Colors.RESET + "Would you like to begin calculating your score(Y or N)?");
				response = select_text.nextLine();
			}
		}while(response.equals("Y"));
		
		if(response.equals("N"))
		{
			System.out.println("Okay, have a nice day!");
		}

	}

}

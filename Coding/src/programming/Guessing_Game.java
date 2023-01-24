package programming;

import java.util.*;

public class Guessing_Game {
	static int user_score = 0;

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		Scanner text = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Would you like to play(Y or N)");
		String response = text.nextLine();
		do
		{
		for(int number = 0;number <= 3;number++)
		{
			if(number ==1)
			{
				int computer_choice = random.nextInt(20);
				System.out.println(computer_choice);
				System.out.println(ANSII_Colors.RED + "Your first guess, guess the number the computer picked from 1 to 20");
				int user_guess = num.nextInt();
				if(user_guess == computer_choice)
				{
					System.out.println(ANSII_Colors.BLUE_BOLD +"You guessed the number correctly!");
					user_score = user_score + 1;
				}
				else if(user_guess != computer_choice)
				{
					System.out.println(ANSII_Colors.RED + "You guessed the number incrrectly!");
				}
			}
			else if(number ==2)
			{
				int computer_choice = random.nextInt(20);
				System.out.println(computer_choice);
				System.out.println(ANSII_Colors.RED + "Your second guess, guess the number the computer picked from 1 to 20");
				int user_guess = num.nextInt();
				if(user_guess == computer_choice)
				{
					System.out.println(ANSII_Colors.BLUE_BOLD +"You guessed the number correctly!");
					user_score = user_score + 1;
				}
				else if(user_guess != computer_choice)
				{
					System.out.println(ANSII_Colors.RED + "You guessed the number incrrectly!");
				}
			}
			else if(number ==3)
			{
				int computer_choice = random.nextInt(20);
				System.out.println(computer_choice);
				System.out.println(ANSII_Colors.RED + "Your third guess, guess the number the computer picked from 1 to 20");
				int user_guess = num.nextInt();
				if(user_guess == computer_choice)
				{
					System.out.println(ANSII_Colors.BLUE_BOLD +"You guessed the number correctly!");
					user_score = user_score + 1;
				}
				else if(user_guess != computer_choice)
				{
					System.out.println(ANSII_Colors.RED + "You guessed the number incrrectly!");
				}
			}
			System.out.println(ANSII_Colors.RED_BOLD_BRIGHT +"You got" + user_score + "out of 3 gursses in total");
		}
		
		System.out.println("Would you like to play(Y or N)");
		response = text.nextLine();
		
		user_score = 0;
		
		}while(response.equals("y"));
		if(response.equals("N"))
		{
			System.out.println(ANSII_Colors.RESET + "Okay, Thank you");
		}
	}

}

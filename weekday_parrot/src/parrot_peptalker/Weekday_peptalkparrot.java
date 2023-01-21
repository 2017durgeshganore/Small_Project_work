package parrot_peptalker;

import java.util.*;

public class Weekday_peptalkparrot {
	
	private String Monday = "Get ready to regain your focus and push for your goals";
	private String Tuesday = "You are going to get productive since your task at work will done";
	private String Wednesday = "A mile will be put on your face as you slide down towards the weekend";
	private String Thursday = "Your week is about to turn arounds and make you happy";
	private String Friday = "Time to reflect on what you have done throughout the week";

	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		Weekday_peptalkparrot user = new Weekday_peptalkparrot();
		System.out.println("Please Enter the day of the week(Monday, Tuesday, Wednesday, Thursday, Friday)");
		String user_response = object.nextLine();
		switch(user_response)
		{
		case("Monday"):
			System.out.println(user.Monday);
		break;
		
		case("Tuesday"):
			System.out.println(user.Tuesday);
		break;
		
		case("Wednesday"):
			System.out.println(user.Wednesday);
		break;
		
		case("Thursday"):
			System.out.println(user.Thursday);
		break;
		
		case("Friday"):
			System.out.println(user.Friday);
		break;
			
		default:
			System.out.println("Sorry, You have entered the incorrect weekday!");
		}

	}

}

package workout;

import java.util.*;

public class Fat_BurnerDiary {
	
	/*
	 * This code is used to record the fat work out entries of the user from Monday to Wednesday 
	 * there are two scanner objects created 
	 * The users entries have been displayed in specific format using various format specifiers like string and decimal ineteger,  
	 * There have been specific character width specing has been implemented to format the position of the information that user has entered.
	 */

	public static void main(String[] args) {
		
		//Creating Scanner Objects.
		Scanner object = new Scanner(System.in);     //This Scanner object for integer input.
		Scanner object1 = new Scanner(System.in);    //This Scanner object for String input.
		
		//This is the Monday Workout entry.
		System.out.println("Monday");
		System.out.println("Day :- ");
		int day_1 = object.nextInt();
		System.out.println("Month(the first three letters) :- ");
		String month_1 = object1.nextLine();
		System.out.println("Year(Four Digit) :- ");
		String year_1 = object1.nextLine();
		System.out.println("How long did you workout for? ");
		int workout_period1 = object.nextInt();
		System.out.println("What is the Worjout name(pushups,jogging,walking,running) ");
		String workout_name1 = object1.nextLine();
		
		
		//This is the Tuesday Workout entry
		System.out.println("Tuesday");
		System.out.println("Day :- ");
		int day_2 = object.nextInt();
		System.out.println("Month(the first three letters) :- ");
		String month_2 = object1.nextLine();
		System.out.println("Year(Four Digit) :- ");
		String year_2 = object1.nextLine();
		System.out.println("How long did you workout for? ");
		int workout_period2 = object.nextInt();
		System.out.println("What is the Worjout name(pushups,jogging,walking,running) ");
		String workout_name2 = object1.nextLine();
		
		
		//This is the Wednesday Workout entry
		System.out.println("Wednesday");
		System.out.println("Day :- ");
		int day_3 = object.nextInt();
		System.out.println("Month(the first three letters) :- ");
		String month_3 = object1.nextLine();
		System.out.println("Year(Four Digit) :- ");
		String year_3 = object1.nextLine();
		System.out.println("How long did you workout for? ");
		int workout_period3 = object.nextInt();
		System.out.println("What is the Worjout name(pushups,jogging,walking,running) ");
		String workout_name3 = object1.nextLine();
		
		
		//This is the Thursday Workout entry
		System.out.println("Thursday");
		System.out.println("Day :- ");
		int day_4 = object.nextInt();
		System.out.println("Month(the first three letters) :- ");
		String month_4 = object1.nextLine();
		System.out.println("Year(Four Digit) :- ");
		String year_4 = object1.nextLine();
		System.out.println("How long did you workout for? ");
		int workout_period4 = object.nextInt();
		System.out.println("What is the Worjout name(pushups,jogging,walking,running) ");
		String workout_name4 = object1.nextLine();
		
		
		//This is the Friday Workout entry
		System.out.println("Friday");
		System.out.println("Day :- ");
		int day_5 = object.nextInt();
		System.out.println("Month(the first three letters) :- ");
		String month_5 = object1.nextLine();
		System.out.println("Year(Four Digit) :- ");
		String year_5 = object1.nextLine();
		System.out.println("How long did you workout for? ");
		int workout_period5 = object.nextInt();
		System.out.println("What is the Worjout name(pushups,jogging,walking,running) ");
		String workout_name5 = object1.nextLine();
				
		System.out.printf("%20s", "Days of the week");
		System.out.printf("%20s", "Date");
		System.out.printf("%20s", "Duration");
		System.out.printf("%20s%n", "Workout name");
		
		System.out.printf("%10s", "Mon");
		System.out.printf("%25d %s %s", day_1,month_1,year_1);
		System.out.printf("%10d",workout_period1);
		System.out.printf("%25s", workout_name1);
		
		System.out.println();
		
		System.out.printf("%10s", "Tue");
		System.out.printf("%25d %s %s", day_2,month_2,year_2);
		System.out.printf("%10d",workout_period2);
		System.out.printf("%25s", workout_name2);
		
		System.out.println();
		
		System.out.printf("%10s", "Wed");
		System.out.printf("%25d %s %s", day_3,month_3,year_3);
		System.out.printf("%10d",workout_period3);
		System.out.printf("%25s", workout_name3);
		
		System.out.println();
		
		System.out.printf("%10s", "Thu");
		System.out.printf("%25d %s %s", day_4,month_4,year_4);
		System.out.printf("%10d",workout_period4);
		System.out.printf("%25s", workout_name4);
		
		System.out.println();
		
		System.out.printf("%10s", "Fri");
		System.out.printf("%25d %s %s", day_5,month_5,year_5);
		System.out.printf("%10d",workout_period5);
		System.out.printf("%25s", workout_name5);
		
		System.out.println();
		
		
		
	}

}

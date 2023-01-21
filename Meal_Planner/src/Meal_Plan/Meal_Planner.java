package Meal_Plan;

import java.util.*;

public class Meal_Planner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Monday");
		System.out.println("Day : ");
		String day_1 = sc.nextLine();
		System.out.println("Month(the first three letters) :- ");
		String month_1 = sc.nextLine();
		System.out.println("Year(Four Digit) :- ");
		String year_1 = sc.nextLine();
		System.out.println("Meal Name : ");
		String meal_name1 = sc.nextLine();
		System.out.println("Cuisine : ");
		String cuisine1 = sc.nextLine();
		
		System.out.println("Tuesday");
		System.out.println("Day : ");
		String day_2 = sc.nextLine();
		System.out.println("Month(the first three letters) :- ");
		String month_2 = sc.nextLine();
		System.out.println("Year(Four Digit) :- ");
		String year_2 = sc.nextLine();
		System.out.println("Meal Name : ");
		String meal_name2 = sc.nextLine();
		System.out.println("Cuisine : ");
		String cuisine2 = sc.nextLine();
		
		System.out.println("Tuesday");
		System.out.println("Day : ");
		String day_3 = sc.nextLine();
		System.out.println("Month(the first three letters) :- ");
		String month_3 = sc.nextLine();
		System.out.println("Year(Four Digit) :- ");
		String year_3 = sc.nextLine();
		System.out.println("Meal Name : ");
		String meal_name3 = sc.nextLine();
		System.out.println("Cuisine : ");
		String cuisine3 = sc.nextLine();
		
		System.out.printf( "%20s","Days of the week : ");
		System.out.printf( "%20s","Date : ");
		System.out.printf( "%30s","Meal Name : ");
		System.out.printf( "%26s","Cuisine : ");
		System.out.println();
		
		System.out.printf( "%10s","Mon");
		System.out.printf( "%25s %s %s",day_1,month_1,year_1);
		System.out.printf( "%25s",meal_name1);
		System.out.printf( "%27s",cuisine1);
		System.out.println();
		
		System.out.printf( "%10s","Tue");
		System.out.printf( "%25s %s %s",day_2,month_2,year_2);
		System.out.printf( "%25s",meal_name2);
		System.out.printf( "%27s",cuisine2);
		System.out.println();
		
		System.out.printf( "%10s","Wed");
		System.out.printf( "%25s %s %s",day_3,month_3,year_2);
		System.out.printf( "%25s",meal_name3);
		System.out.printf( "%27s",cuisine3);
		System.out.println();
		
		sc.close();

	}

}

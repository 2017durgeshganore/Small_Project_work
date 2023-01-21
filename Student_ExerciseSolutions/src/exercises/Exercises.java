package exercises;
import java.util.*;
public class Exercises {

	public static void main(String[] args) {
		Scanner exercise = new Scanner(System.in);
		// Finding the sum of two numbers - do while loop
		System.out.println("Do you want to continue(Yes or No)? ");
		String response = exercise.nextLine();
		
		if(response.equals("No"))
		{
			System.out.println("Bye Bye !!!");
		}
		else if(response.equalsIgnoreCase("Yes"))
		{
			do {
				System.out.println("Enter the first number");
				int num1 = exercise.nextInt();
				System.out.println("Enter the Second number");
				int num2 = exercise.nextInt();
				int sum = num1 + num2;
				System.out.println("The sum of the two number is " +sum);
				
				System.out.println("Do you want to continue(Yes or No)? ");
				response = exercise.nextLine();
			}while(response.equalsIgnoreCase("Yes"));
		}
		else
		{
			System.out.println("Sorry, you need to only enter(Yes or No)");
		}

	}

}

package currency;

import java.util.*;

public class Instructor_StudentExercises {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		//Multiplication Table Program
		System.out.println(ANSII_Colors.PURPLE + "What number would you like to find the multiplication of(1 to 15)?");
		int user_number = number.nextInt();
		for(int num=1;num<=15;num++)
		{
			int multiply = user_number * num;
			System.out.println(ANSII_Colors.RED_BOLD_BRIGHT + user_number + "x" + num + "=" + multiply);
		}
			
		//Armstrong Number program
		int num=1;
		while(num<=500)
		{
			int temp = num;
			int digit1 = temp%10;
			
			temp=temp/10;
			int digit2 = temp%10;
			
			temp=temp/10;
			int digit3 = temp%10;
			
			if(digit1 * digit1 * digit1 + digit2 * digit2 * digit2 + digit3 * digit3 * digit3 == num)
			{
				System.out.println(ANSII_Colors.ORANGE +"The following numbers are Armstrong number:-");
				System.out.println(num);
			}
			num++;
		}

	}

}

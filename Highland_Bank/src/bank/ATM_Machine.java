package bank;

import java.util.*;
import java.lang.Thread;

public class ATM_Machine {
	static double balance = 50;

	public static void main(String[] args)throws Exception {
		Scanner choose_text = new Scanner(System.in);
		Scanner choose_number = new Scanner(System.in);
		System.out.println(Colors.BLUE_BRIGHT +"Welcome to the Highland Bank ATM Machine");
		System.out.println("******************************************************************");
		System.out.println("Please hit your enter key so you can begin");
		String user_input = choose_text.nextLine();
		System.out.println("******************************************************************");
		while(user_input.equals(""))
		{
			System.out.println(Colors.GREEN_BOLD_BRIGHT +"ATM MACHINE ASCII ART");
			Thread.sleep(2000);
			System.out.println(Colors.RESET +"************************** Highland Bank ATM Menu **************************");
			Thread.sleep(1000);
			System.out.println("Please select what operation you would like to do");
			System.out.println("1.Display Balance(Swiss Franc)\n2.Withdraw Funds\n3.Deposit Funds\n4.Return your Card");
			int customer_choice = choose_number.nextInt();
			if(customer_choice == 1)
			{
				System.out.println(Colors.RED_BRIGHT + "Your Balance is:- "+ balance + "swiss franc");
			}
			else if(customer_choice == 2)
			{
				System.out.println(Colors.RESET +"How much would you like to withdraw?(Limit Amount:- 1000 Swiss Franc)");
				double withdraw = choose_number.nextDouble();
				if(withdraw > 1000)
				{
					System.out.println(Colors.PURPLE_BRIGHT + "Sorry, you have passed the withdrawing limit");
				}
				else if(withdraw < 1000)
				{
					Thread.sleep(1000);
					System.out.println(Colors.RESET +"Please wait to collect your money from the cash dispenser");
					balance = balance - withdraw;
					System.out.println("Your new balance is: "+balance);
				}
			}
			else if(customer_choice == 3)
			{
				System.out.println(Colors.CYAN_BOLD_BRIGHT +"How much funds would you like to deposit into your account?");
				double deposit_funds = choose_number.nextDouble();
				Thread.sleep(2000);
				System.out.println("Please enter the bills into the deposit slot");
				balance = balance +deposit_funds;
				System.out.println("Your new balance is: "+balance);
			}
			else if(customer_choice == 4)
			{
				System.out.println(Colors.GREEN_BRIGHT +"Please collect your card reader");
			}
			else
			{
				System.out.println(Colors.RED_BOLD_BRIGHT + "Sorry, you have entered an incorrect option!");
			}
			
			System.out.println(Colors.BLUE_BRIGHT +"******************************************************************");
			System.out.println("Please hit your enter key so you can begin");
			user_input = choose_text.nextLine();
			System.out.println("******************************************************************");
		}
		if(!user_input.equals(""))
		{
			System.out.println(Colors.BLUE +"Okay, have a nice day!");
		}
	}

}


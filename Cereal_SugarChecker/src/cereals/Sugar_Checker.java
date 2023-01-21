package cereals;

import java.util.*;

public class Sugar_Checker {

	public static void main(String[] args) {
		
		String auth_username = "learnjava@22";
		String auth_password = "Ienjoycoding@22";
		Scanner obj = new Scanner(System.in);
		Scanner myobj = new Scanner(System.in);
		System.out.printf("%80s %n","Dear user, Welcome to the cereal percentage sugar checker program");
		System.out.println("This program calculates the sugar percentage in different cereals using information from the nutritional facts");
		System.out.printf("%80s %n", "You can only calculate the sugar percent for two cereals ");
		System.out.printf("%80s %n","-------------------- User Login --------------------");
		System.out.println("Username :- ");
		String username = obj.nextLine();
		System.out.println("Password :- ");
		String password = obj.nextLine();
		System.out.printf("%80s %n","-------------------- User Login --------------------");
		
		if(username.equals(auth_username) && (password.equals(auth_password)))
		{
			System.out.println("Welcome " +username);
			System.out.printf("%80s %n", "How many cereals would you like to calculate the percent sugar for? ");
			System.out.println("Response :-");
			int cereal_number = myobj.nextInt();
			if(cereal_number == 1)
			{
				System.out.printf("%80s %n","-------------------- Cereal % Sugar Checker --------------------");
				System.out.println("Cereal Name :- ");
				String cereal_name = obj.nextLine();
				System.out.println("Sugar Content(g) :- ");
				double sugar_content = obj.nextDouble();
				System.out.println("Total Food Weight(Food Serving Size g) :- ");
				double serving_size = obj.nextDouble();
				double sugar_percent = (sugar_content/serving_size)*100;
				System.out.printf("%80s %n","---------------------------- Thank You ----------------------------");
				
				//Section to displaying the information
				System.out.printf("%20s ","Cereal Name");
				System.out.printf("%20s ","Serving Size(g)");
				System.out.printf("%20s ","Sugar Content");
				System.out.printf("%20s ","Sugar Percentage");
				System.out.println();
				
				System.out.printf("%15s ",cereal_name);
				System.out.printf("%15s ",serving_size);
				System.out.printf("%20s ",sugar_content);
				System.out.printf("%15s %.2f","",sugar_percent);
				
				System.out.println();
			
			}
			else if(cereal_number == 2)
			{
				//First Cereal Entry
				
				System.out.printf("%80s %n","-------------------- Cereal % Sugar Checker --------------------");
				System.out.println("First Cereal Name :- ");
				String cereal_name1 = obj.nextLine();
				System.out.println("Sugar Content(g) :- ");
				double sugar_content1 = obj.nextDouble();
				System.out.println("Total Food Weight(Food Serving Size g) :- ");
				double serving_size1 = obj.nextDouble();
				double sugar_percent1 = (sugar_content1/serving_size1)*100;
				System.out.printf("%80s %n","---------------------------- Thank You ----------------------------");
				
				//Second Cereal Entry
				obj.nextLine();
				System.out.printf("%80s %n","-------------------- Cereal % Sugar Checker --------------------");
				System.out.println("Second Cereal Name :- ");
				String cereal_name2 = obj.nextLine();
				System.out.println("Sugar Content(g) :- ");
				double sugar_content2 = obj.nextDouble();
				System.out.println("Total Food Weight(Food Serving Size g) :- ");
				double serving_size2 = obj.nextDouble();
				double sugar_percent2 = (sugar_content2/serving_size2)*100;
				System.out.printf("%80s %n","---------------------------- Thank You ----------------------------");
				
				//Section to displaying the information
				System.out.printf("%20s ","Cereal Name");
				System.out.printf("%20s ","Serving Size(g)");
				System.out.printf("%20s ","Sugar Content");
				System.out.printf("%20s ","Sugar Percentage");
				System.out.println();
				
				System.out.printf("%15s ",cereal_name1);
				System.out.printf("%15s ",serving_size1);
				System.out.printf("%20s ",sugar_content1);
				System.out.printf("%15s %.2f","",sugar_percent1);
				
				System.out.println();
				
				System.out.printf("%15s ",cereal_name2);
				System.out.printf("%15s ",serving_size2);
				System.out.printf("%20s ",sugar_content2);
				System.out.printf("%15s %.2f","",sugar_percent2);
				
				System.out.println();
				System.out.printf("%80s %n","---------------------------- Sugar Percentage Analytics(%) ----------------------------");
				if(sugar_percent1 > sugar_percent2)
				{
					System.out.println("Cereal " +cereal_name1+ "is much higher in sugar percentage than "+cereal_name2);
				}
				else if(sugar_percent1 < sugar_percent2)
				{
					System.out.println("Cereal " +cereal_name2+ "is much higher in sugar percentage than "+cereal_name1);
				}
				
				System.out.printf("%80s %n","---------------------------- Sugar Percentage Analytics(%) ----------------------------");
			}
		}
		else 
		{
			System.out.println("Sorry, Invalid Credentials!");
		}

	}

}

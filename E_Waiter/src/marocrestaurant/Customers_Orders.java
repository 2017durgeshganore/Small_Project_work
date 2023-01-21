package marocrestaurant;

import java.util.*;

public class Customers_Orders {
	
	private int first_mealportion;
	private int main_mealportion;
	private int dessert_portion;
	private int tea_portion;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		Main_Restaurantt e_waiter = new Main_Restaurantt();
		Customers_Orders cust1 = new Customers_Orders();
		Customers_Orders cust2 = new Customers_Orders();
		
		System.out.println("Welcome to the Maroc Fantasia Restaurant ");
		System.out.println("Please Allow me to take you to your seats ");
		System.out.println();
		System.out.println("---------------- Maroc Fantasia Restaurant Menu ----------------");
		System.out.printf("%52s%n","Here is the menu for today");
		System.out.printf("%40s %5s%n","First Meal Course : ",e_waiter.first_mealcourse);
		System.out.printf("%40s %5s%n","Main Meal Course : ",e_waiter.main_mealcourse);
		System.out.printf("%40s %5s%n","Desset : ",e_waiter.dessert);
		System.out.printf("%40s %5s%n","Tea : ",e_waiter.tea);
		System.out.println("---------------- Maroc Fantasia Restaurant Menu ----------------");
		System.out.println();
		
		//Displaying to Customer the available portion sizes at the restaurant.
		System.out.println("We also offer differnt portion sizes for the first course meal, the main meal course, the dessert and tea ");
		System.out.println("---------------- Maroc Fantasia Restaurant Portion sizes ----------------");
		System.out.printf("%50s%n","Small portion(x1)");
		System.out.printf("%50s%n","Large portion(x2)");
		System.out.printf("%50s%n","X-Large portion(x3)");
		System.out.println("---------------- Maroc Fantasia Restaurant Portion sizes ----------------");
		System.out.println();
		
		//Receiving order from second Customer
		System.out.println("Hello Customer 1, What portion would you like For The first meal course(1 or 2 or 3)");
		cust1.first_mealportion = sc.nextInt();
		System.out.println("and What portion would you like For the main meal course(1 or 2 or 3)");
		cust1.main_mealportion = sc.nextInt();
		System.out.println("the dessert(1 or 2 or 3)?");
		cust1.dessert_portion = sc.nextInt();
		System.out.println("and finally tea portion (1 or 2 or 3)");
		cust1.tea_portion = sc.nextInt();
		System.out.println("Thank you Customer 1");
		
		//Receiving the order from second customer
		System.out.println("Hello Customer 2, What portion would you like For The first meal course(1 or 2 or 3)");
		cust2.first_mealportion = sc.nextInt();
		System.out.println("and What portion would you like For the main meal course(1 or 2 or 3)");
		cust2.main_mealportion = sc.nextInt();
		System.out.println("the dessert(1 or 2 or 3)?");
		cust2.dessert_portion = sc.nextInt();
		System.out.println("and finally tea portion (1 or 2 or 3)");
		cust2.tea_portion = sc.nextInt();
		System.out.println("Thank you Customer 2");
		
		System.out.println("Your meals will be brought right away");
		
		double bill_cust1 = cust1.first_mealportion * e_waiter.first_mealcourseprice + cust1.main_mealportion * e_waiter.main_mealcourseprice + cust1.dessert_portion * e_waiter.dessert_price + cust1.tea_portion * e_waiter.tea_price;
		double bill_cust2 = cust2.first_mealportion * e_waiter.first_mealcourseprice + cust2.main_mealportion * e_waiter.main_mealcourseprice + cust2.dessert_portion * e_waiter.dessert_price + cust2.tea_portion * e_waiter.tea_price;
		double total_bill = bill_cust1 + bill_cust2;
		
		//displaying the final bill to the customer
		System.out.println("\n---------------- Maroc Fantasia Restaurant Bill ----------------");
		System.out.printf("%20s %tH: %tM: %tS:", "Current Time :-",date,date,date);
		System.out.printf("%20s %td - %tm - %ty %n:", "Current Date :-",date,date,date);
		System.out.printf("%50s %10s%n", "Customer 1 Meal Cost :-",bill_cust1);
		System.out.printf("%50s %10s%n", "Customer 2 Meal Cost :-",bill_cust2);
		System.out.printf("%50s %10s%n", "Total Bill :-",total_bill);
		System.out.printf("%50s%n", "Please pay at the Reception");
		System.out.println("---------------- Maroc Fantasia Restaurant Bill ----------------");
		
	
	}

}

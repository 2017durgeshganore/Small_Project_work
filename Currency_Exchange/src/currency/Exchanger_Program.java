package currency;

import java.util.*;

public class Exchanger_Program {
	/*
	 * 1 Pound = 161.20 Yen
	 */

	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		System.out.println(ANSII_Colors.DARK_RED);
		  System.out.println(" #####  #     # ######  ######  ####### #     #  #####  #     #"); 
		  System.out.println("#     # #     # #     # #     # #       ##    # #     #  #   #");  
		  System.out.println("#       #     # #     # #     # #       # #   # #         # # ");   
		  System.out.println("#       #     # ######  ######  #####   #  #  # #          # ");    
		  System.out.println("#       #     # #   #   #   #   #       #   # # #          # ");    
		  System.out.println("#     # #     # #    #  #    #  #       #    ## #     #    # ");    
		  System.out.println(" #####   #####  #     # #     # ####### #     #  #####     # "); 
		  System.out.println(ANSII_Colors.BLUE_UNDERLINED + "Welcome to the currency exchanger system");
		  System.out.println(ANSII_Colors.FOREST_GREEN + "What would you like to convert?\nA.Pounds to Yen\nB.Yen to Pounds");
		  String user_response = object.nextLine();
		  if(user_response.equals("A"))
		  {
			  System.out.println("How much would you like to covert to yen?");
			  double pound_toyen = number.nextDouble();
			  double convert_poundtoyen = pound_toyen * 161.20;
			  System.out.println(ANSII_Colors.RESET + "The conversion from Pound to Yen is:-" + convert_poundtoyen); 
		  }
		  else if(user_response.equals("B"))
		  {
			  System.out.println(ANSII_Colors.CYAN_BRIGHT + "How much would you like to covert to Pounds?");
			  double yen_topounds = number.nextDouble();
			  double convert_yentopound = yen_topounds/161.20;
			  System.out.println(ANSII_Colors.RESET + "The conversion from Yen to Pound is:-" + convert_yentopound); 
		  }
		  else
		  {
			  System.out.println(ANSII_Colors.RED_BRIGHT + "Sorry you have entered an incorrect option!");
		  }

	}

}

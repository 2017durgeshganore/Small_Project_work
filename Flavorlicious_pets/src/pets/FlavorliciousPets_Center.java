package pets;
import java.awt.Desktop;
import java.net.URI;
import java.io.*;
import java.lang.*;
import java.util.*;
public class FlavorliciousPets_Center {
	static double dog_factor;
	static double MER;

	public static void main(String[] args) throws InterruptedException {
		Scanner object = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		System.out.println("Would you like ti initialize the system(yes or No)? ");
		String vet_response = object.nextLine();
		while(vet_response.equals("Yes"))
		{
			System.out.println(Console_Colors.RED_UNDERLINED +"Welcome to the flavorlicious pet center");
			Thread.sleep(1000);
			System.out.println(Console_Colors.ROSY_PINK +"Please play voki message! ");
			Thread.sleep(2000);
			Desktop voki = Desktop.getDesktop();
			
			
			
		}

	}

}

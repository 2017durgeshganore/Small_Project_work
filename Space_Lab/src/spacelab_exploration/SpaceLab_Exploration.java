package spacelab_exploration;

import java.io.File;
import javax.sound.sampled.*;
import java.io.IOException;
import java.util.*;

public class SpaceLab_Exploration {
	/*
	 * Author Name :- Durgesh Ganore
	 * Program Name :- SpaceLab_exploration.java
	 * Program Description :- This program is intended to provide prospect space explorer passenger with information they need to know before travelling on a space journey to other planets. Such information invludes:- Finding their age and weight on other panets.
	 * Date Created :- 16 Jan 2023
	 */

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Scanner number = new Scanner(System.in);
		Scanner text =  new Scanner(System.in);
		Main telescope_1 = new Main();
		Main telescope_2 = new Main();
		Main space_explorer = new Main();
		System.out.println("*******************************************************************************");
		System.out.println("Please take a moment to listen to the welcome audio and replay where necessary ");
		System.out.println("*******************************************************************************");
		
		//Inserting audio
		
		File file = new File("Space_Welcome.wav");
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
		System.out.println("Enter P to play audio ");
		String response = text.nextLine();
		response = response.toUpperCase();
		
		if(response.equals("P"))
		{
			clip.start();
			System.out.println("Enter S to Stop and R to Replay");
			response = response.toUpperCase();
			
			if(response.equals("S"))
			{
				clip.stop();
				System.out.println("Thank You !");
			} 
			else if(response.equals("R"))
			{
				clip.setMicrosecondPosition(0);
				clip.start();
				
				System.out.println("Enter E to Exit");
				response = text.nextLine();
				response = response.toUpperCase();
				clip.stop();
				System.out.println("Thank You !!");
				
			}
		}
		
		System.out.println("*******************************************************************************");
		System.out.println("Import Information About Focal Ratio OF Telescopes ");
		System.out.println("A longer focal ratio means a higher magnification which is great for observing the moon, planets and double stars");
		System.out.println("A lower focal ratio means a lower magnification which is ideal for observing star clusters, galaxies and the milky way");
		System.out.println("*******************************************************************************");
		
		//Focal Ratio  of Telescope 1 Calculation 
		
		telescope_1.focal_length =1000;
		telescope_1.aperture = 102;
		telescope_1.focal_ratio = telescope_1.focal_length/telescope_1.aperture;
		
		//Focal Ratio  of Telescope 2 Calculation 
		
		telescope_2.focal_length =1270;
		telescope_2.aperture = 250;
		telescope_2.focal_ratio = telescope_2.focal_length/telescope_2.aperture;
		
		//Display Focal Ratio for each telescope in tabular format.
		
		System.out.println("-------------------- Focal Ratio For The Telescopes ------------------");
		System.out.printf("%30s ","Telescope Names");
		System.out.printf("%15s ","Focal Ratio");
		System.out.printf("%35s", "Telescope Capacity Description ");
		
		System.out.println();
		
		System.out.printf("%30s ","The Skwatcher Evostar 120(90•)");
		System.out.printf("%15s ",telescope_1.focal_ratio);
		System.out.printf("%5s","" );
		if(telescope_1.focal_ratio > 7)
		{
			System.out.printf("%s","Great for Observing the moon, planets and double stars ");
		}
		else if(telescope_1.focal_ratio >= 1 && telescope_1.focal_ratio <= 7)
		{
			System.out.printf("%s","Great for Observing the Clusters, Galaxies and the Milky way");
		}
		
		System.out.println();
		
		System.out.printf("%30s ","The Celestron Starhopper ");
		System.out.printf("%15s ",telescope_2.focal_ratio);
		System.out.printf("%5s","" );
		if(telescope_2.focal_ratio > 7)
		{
			System.out.printf("%s","Great for Observing the moon, planets and double stars ");
		}
		else if(telescope_2.focal_ratio >= 1 && telescope_2.focal_ratio <= 7)
		{
			System.out.printf("%s","Great for Observing the Clusters, Galaxies and the Milky way");
		}
		
		// choosing the telescope of their choice
		
		System.out.println();
		
		System.out.println("*******************************************************************************");
		System.out.println("Which telescope do you choose? \nA.The Skwatcher Evostar 120 \nB.The Celestron Starhopper ");
		System.out.println("*******************************************************************************");
		String user_choice = text.nextLine();
		if(user_choice.equals("A") || user_choice.equals("B"))
		{
			System.out.println("Great Choice !");
			
			//Age Calculation In Other Planets Section
			
			System.out.println("*******************************************************************************");
			System.out.println("Age calculation In the Other Planets");
			System.out.println("*******************************************************************************");
			System.out.println("Enter your Current age");
			space_explorer.spaceexplorer_age = number.nextDouble();
			double mercury_terrestage = (space_explorer.spaceexplorer_age * 365)/88;
			double venus_terrestage = (space_explorer.spaceexplorer_age * 365)/225;
			double mars_terrestage = (space_explorer.spaceexplorer_age * 365)/687;
			double jupiter_outerage = space_explorer.spaceexplorer_age/12;
			double saturn_outerage = space_explorer.spaceexplorer_age/30;
			double uranus_outerage = space_explorer.spaceexplorer_age/84;
			double neptune_outerage = space_explorer.spaceexplorer_age/165;
			
			//Weight Calculation In Other Planets Section
			
			System.out.println("*******************************************************************************");
			System.out.println("Weight(kg) calculation In the Other Planets");
			System.out.println("*******************************************************************************");
			
			System.out.println("Enter your weight in kilograms ");
			space_explorer.spaceexplorer_weight = number.nextDouble();
			
			double mercury_terrestweight = space_explorer.spaceexplorer_weight * 0.38;
			double venus_terrestweight = space_explorer.spaceexplorer_weight * 0.91;
			double mars_terrestweight = space_explorer.spaceexplorer_weight * 0.38;
			double jupiter_gasgiantweight = space_explorer.spaceexplorer_weight * 2.34;
			double saturn_gasgiantweight = space_explorer.spaceexplorer_weight * 1.06;
			double uranus_icegiantweight = space_explorer.spaceexplorer_weight * 0.92;
			double neptune_icegiantweight = space_explorer.spaceexplorer_weight * 1.19;
			
			//Display the age and the weight in other planets
			
			System.out.println("-------------------- Space Exploration Data Results ------------------");
			System.out.printf("%20s", "Planet Names");
			System.out.printf("%20s", "Planet Type");
			System.out.printf("%20s", "Age");
			System.out.printf("%20s", "Weight(kg)");
			
			System.out.println();
			System.out.printf("%20s", "Mercury");
			System.out.printf("%20s", "Terrestial");
			System.out.printf("%20s", mercury_terrestage);
			System.out.printf("%20s", mercury_terrestweight);
			
			System.out.println();
			System.out.printf("%20s", "Venus");
			System.out.printf("%20s", "Terrestial");
			System.out.printf("%20s", venus_terrestage);
			System.out.printf("%20s", venus_terrestweight);
			
			System.out.println();
			System.out.printf("%20s", "Mars");
			System.out.printf("%20s", "Terrestial");
			System.out.printf("%20s", mars_terrestage);
			System.out.printf("%20s", mars_terrestweight);
			
			System.out.println();
			System.out.printf("%20s", "Jupiter");
			System.out.printf("%20s", "Gas Giants");
			System.out.printf("%20s", jupiter_outerage);
			System.out.printf("%20s", jupiter_gasgiantweight);
			
			System.out.println();
			System.out.printf("%20s", "Saturn");
			System.out.printf("%20s", "Gas Giants");
			System.out.printf("%20s", saturn_outerage);
			System.out.printf("%20s", saturn_gasgiantweight);
			
			System.out.println();
			System.out.printf("%20s", "Uranus");
			System.out.printf("%20s", "Ice Giants");
			System.out.printf("%20s", uranus_outerage);
			System.out.printf("%20s", uranus_icegiantweight);
			
			System.out.println();
			System.out.printf("%20s", "Neptune");
			System.out.printf("%20s", "Ice Giants");
			System.out.printf("%20s", neptune_outerage);
			System.out.printf("%20s", neptune_icegiantweight);
			
			//Conclusion Message to Space Explorers
			
			System.out.println();
			
			System.out.println("Thank You For Using Spacelab programmed System, have wonderful space journey! ");
			
			
		
		}
		else
		{
			System.out.println("You have entered incorrect option ! Please restart the program");
			
		}
		
	}

}

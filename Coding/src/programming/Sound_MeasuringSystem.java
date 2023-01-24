package programming;

import java.util.*;
import java.lang.Thread;

public class Sound_MeasuringSystem {
	static double obs_freq;
	static double sound_velocity;

	public static void main(String[] args) throws InterruptedException {
		Scanner res = new Scanner(System.in);
		Scanner res_number = new Scanner(System.in);
		
		System.out.println("Are you ready to begin(Yes or No)?");
		String ready = res.nextLine();
		while(ready.equals("Yes"))
		{
			System.out.println(ANSII_Colors.CYAN_BOLD_BRIGHT);
			System.out.println("		  .==============.");
			System.out.println("__________||_{########}_||__________");
			System.out.println("|(O)____ : [FM 103.7] ooooo : ____(O)|      Deep down in L'usiana");
			System.out.println("|  {::::}:  _________  +|+  :{::::}  | -=<  close to New Orleans");
			System.out.println("|  {;;;;}: |    |    | |+|  :{;;;;}  |      Way Back up in the woods");
			System.out.println("|________:_ooooo+ooooo______:________|nad   Among the evergreens...");
			System.out.println(ANSII_Colors.RED_BOLD_BRIGHT + "Welcome to the sound frequency, measuring system");
			Thread.sleep(2000);
			System.out.println(ANSII_Colors.RED_BOLD_BRIGHT + "Please enter the information below:- ");
			Thread.sleep(1000);
			System.out.println("Source Sound Frequency(Hz):- ");
			double source_sound = res_number.nextDouble();
			Thread.sleep(1000);
			System.out.println("Velocity of the source(m/s), write 0 if the position of the source stationary");
			double source_velocity = res_number.nextDouble();
			System.out.println("Velocity of the observer(m/s), write 0 if the position of the observer is stationary");
			double observer_velocity = res_number.nextDouble();
			Thread.sleep(1000);
			System.out.println(ANSII_Colors.RESET + "Do you know the velocity of the sound waves(Y or N)?");
			String sound_waves = res.nextLine();
			switch(sound_waves)
			{
			case "Y":
				System.out.println("Please enter the velocity of the sound in m/s");
				sound_velocity = res_number.nextDouble();
				break;
			case "N":
				System.out.println("Calculating the velocity of the sound waves........");
				Thread.sleep(1000);
				System.out.println("Enter the temperature in degree celsius");
				double temperature = res_number.nextDouble();
				sound_velocity = 331 + (6/10 * temperature);
				break;
			default:
				System.out.println(ANSII_Colors.RED_BRIGHT +"You have entered an incorrect value!");
				break;
			}
			System.out.println(ANSII_Colors.BLUE_BOLD_BRIGHT +"To begin calculating the observed sound frequency(F'),please select the situation that applies to you\nA. The source is moving towards the observer at rest\nB.The source is moving away from the observer at rest\nC.The observer moving towards the stationary source\nD.The observer is moving away from a stationary source.\nE.The source and observer are moving towards each other\nF.The source and the observer are moving away from each other\n");
			String user_response = res.nextLine();
			if(user_response.equals("A"))
			{
				obs_freq = source_sound * ((sound_velocity)/(sound_velocity - source_velocity));
			}
			else if(user_response.equals("B"))
			{
				obs_freq = source_sound * ((sound_velocity)/(sound_velocity + source_velocity));
			}
			else if(user_response.equals("C"))
			{
				obs_freq = source_sound * ((sound_velocity + observer_velocity)/(sound_velocity));
			}
			else if(user_response.equals("D"))
			{
				obs_freq = source_sound * ((sound_velocity - observer_velocity)/(sound_velocity));
			}	
			else if(user_response.equals("E"))
			{
				obs_freq = source_sound * ((sound_velocity + observer_velocity)/(sound_velocity - source_velocity));
			}
			else if(user_response.equals("F"))
			{
				obs_freq = (source_sound * (sound_velocity + source_velocity))/(sound_velocity - observer_velocity);
			}
			else
			{
				System.out.println(ANSII_Colors.RED_BOLD_BRIGHT +"Sorry you have entered an incorrect option!");
			}
			
			System.out.println(ANSII_Colors.RESET +"The observe sound frequency in Hertz(F') is" + Math.ceil(obs_freq));
			
			System.out.println("Are you ready to begin(Yes or No)?");
			ready = res.nextLine();
		}
		if(ready.equals("No"))
		{
			System.out.println("Okay, have a nice day!");
			res.close();
			res_number.close();
		}

	}

}

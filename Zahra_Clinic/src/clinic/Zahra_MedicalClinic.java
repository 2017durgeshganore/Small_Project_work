package clinic;

import java.util.*;
import java.lang.Math;

public class Zahra_MedicalClinic {

	public static void main(String[] args) {
		String BMI_status = "";
		Scanner user = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		String clinical_staffusername = "zahra123";
		String clinical_staffpassword = "zahraeportal@123";
		
		//Medical Staff Login Section
		
		System.out.printf("%80s","Welcome to the Zahra Medical clinic Patient's Registration E-portal");
		System.out.println();
		System.out.printf("%70s %n", "************************* Medical Staff Login ************************");
		System.out.printf("%50s","Username :- ");
		String username = user.nextLine();
		System.out.printf("%50s","Password :- ");
		String password = user.nextLine();
		System.out.printf("%70s %n", "************************* Medical Staff Login ************************");
		
		//Medical Staff Authentication Section
		
		if(username.equals(clinical_staffusername) && password.equals(clinical_staffpassword))
		{
			System.out.printf("%50s %n","Login is Sucessful !");
			System.out.println();
			System.out.printf("%70s %n", "We are now going to calculate the BMI of the patient");
			System.out.printf("%50s","Patient's Name :- ");
			String patient_name = user.nextLine();
			
			//BMI Calculation Section
			
			System.out.printf("%70s %n", "************************* BMI Calculation ************************");
			System.out.printf("%50s","Patient's Weight(kg) :- ");
			double patient_weight = number.nextDouble();
			System.out.printf("%50s","Patient's Height(m) :- ");
			double patient_height = number.nextDouble();
			if(patient_weight <= 0 || patient_height <=0 )
			{
				System.out.println("Sorry, you have entered inavalid values for the weight and/or the height of the patient ");
			}
			else
			{
				System.out.printf("%70s %n", "************************* BMI Calculation in Progress ************************");
				double BMI_calc = patient_weight/(patient_height*patient_height);
				if(BMI_calc < 18.5)
				{
					BMI_status = "underweight";
				}
				else if(BMI_calc >= 18.5 && BMI_calc <= 24.9)
				{
					BMI_status = "Normal Weight";
				}
				else if(BMI_calc >= 25.0 && BMI_calc <= 29.9)
				{
					BMI_status = "Overweight";
				}
				else if(BMI_calc >= 30)
				{
					BMI_status = "Obesity";
				}
				
				System.out.printf("%40s %.2f %s","Patient's BMI Results :- ",BMI_calc,"Kg/m^2");
				System.out.println();
				System.out.printf("%41s %10s","Patient's BMI Category :- ",BMI_status );
				System.out.println();
				System.out.printf("%70s %n", "************************* BMI Calculation in Progress ************************");
				
				//BSA Calculation Section
				
				System.out.println();
				System.out.printf("%70s %n", "************************* BSA Calculation ************************");
				double convert_metertocenti = patient_height * 100;
				double BSA =Math.sqrt((convert_metertocenti * patient_weight)/3600);
				System.out.printf("%40s %.2f %s","Patient's BSA Results :- ",BSA,"m^2");
				System.out.println();
				System.out.printf("%70s %n", "************************* BSA Calculation ************************");
			
				//Cardiac Index Calculation Section
				
				System.out.println();
				System.out.printf("%70s %n", "************************* Cardiac Index ************************");
				System.out.printf("%60s", "Patient's Cardiac Output(L/Minute) :- ");
				double patient_cardiacoutput = number.nextDouble();
				double cardiac_index = patient_cardiacoutput/BSA;
				System.out.printf("%60s %.2f %s","Patient's Cardiac Index REsults :- ",cardiac_index,"L/minute/m^2");
				System.out.println();
				System.out.printf("%70s %n", "************************* Cardiac Index ************************");
				
				System.out.println();
				
				//Child Patient Medication Dosage Calculation
				
				System.out.printf("%70s %n", "************************* Medical Dosage Calculation For Children ************************");
				System.out.printf("%50s", "Enter the Drug Name :-");
				String drug_name = user.nextLine();
				System.out.printf("%50s", "Enter the Adult dosage(mg) :-");
				int adult_dose = number.nextInt();
				double medication_dose = (BSA/1.73)*adult_dose;
				System.out.printf("%50s %s %n", "Drug Name :-",drug_name);
				System.out.printf("%50s %.2f %s ","Child Patient's Medical Dosage :- ",medication_dose,"mg");
				System.out.println();
				System.out.printf("%70s %n", "************************* Medical Dosage Calculation For Children ************************");
			}
			user.close();
			number.close();
			
		}
		else
		{
			System.out.println("Invalid Credentials !");
		}

	}

}

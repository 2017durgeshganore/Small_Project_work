package dna_analysis;

import java.util.*;

public class DNA_XLLAB {
	static char DNA1;
	static char DNA2;
	static int hamming_distance = 0;

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		System.out.println("Do you want ti initiate the system(Yes or No)? ");
		String response = text.nextLine();
		while(response.equals("Yes"))
		{
		System.out.println(Colors.PURPLE_BOLD +"Welcome to the XL lab DNA analysis program");
		System.out.println(Colors.RED);
		System.out.println("O       o O       o O       o");
		System.out.println("| O   o | | O   o | | O   o |");
		System.out.println("| | O | | | | O | | | | O | |");
		System.out.println("| o   O | | o   O | | o   O |");
		System.out.println("o       O o       O o       O");
		System.out.println(Colors.RESET + "Enter the first DNA strand");
		String DNA_1 = text.nextLine();
		System.out.println("Enter the Second DNA strand");
		String DNA_2 = text.nextLine();
		int DNA1_length = DNA_1.length();
		int DNA2_length = DNA_2.length();
		if(DNA1_length == DNA2_length)
		{
			System.out.println(Colors.RED +"DNA Strands Match!");
			for(int m=0;m<DNA_1.length();m++)
			{
				DNA1 = DNA_1.charAt(m);
				DNA2 = DNA_2.charAt(m);
				if(DNA1 == DNA2)
				{
					continue;
				}
				else if(DNA1!=DNA2)
				{
					hamming_distance = hamming_distance + 1;
				}
			}
			System.out.println(Colors.RESET +"The hamming distance of the DNA strands" +hamming_distance);
			hamming_distance = 0;
		}
		else if(DNA1_length != DNA2_length)
		{
			System.out.println(Colors.RED +"DNA Strands do not Match!");
		}
		System.out.println("Do you want ti initiate the system(Yes or No)? ");
		response = text.nextLine();
		}
		if(response.equals("No"))
		{
			System.out.println("Okay, have a great day!");
		}
	}

}

/* 012345
 * ACTGAT
 * AGTACG
 * */

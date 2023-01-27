
package logbook;
import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Accessment_logbbok {
	static String new_string;
	static String code1;
	static String code2;
	static String Course_keysubject1;
	static String Course_keysubject2;
	static String Course_name;
	static String Course_name2;
	static String status;
	static String status2;
	static String assign_type;
	static String assign_type2;
	
	
	
	public static void main(String[] args) throws IOException,AWTException,InterruptedException 
	{
		Scanner begin =new Scanner(System.in);
		System.out.println("Are you Ready To Begin(Y or N)?");
		String answer = begin.nextLine();
		while(answer.equals("Y"))
		{
			System.out.println(Colors.RED_BOLD_BRIGHT + "Welcome To Your Assessment Logbook ");
			Thread.sleep(2000);
			// Inserting ASCII Art
			System.out.println(Colors.BLUE_BOLD);
			
			System.out.println("Study LogBook ASCII ART");
			
			
			System.out.println("  _____________");
			System.out.println(" ||           ||");
			System.out.println(" ||    Study  ||");
			System.out.println(" ||           ||");
			System.out.println(" ||           ||");
			System.out.println(" ||___________||");
			System.out.println(" |_____________|");
			System.out.println(" //############//");
			System.out.println("//############//");
			System.out.println("/     ___     /");
			System.out.println("/____{___}___/");
			
			// Inserting Gif Image
			Scanner object = new Scanner(System.in);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon icon = new ImageIcon("C:\\Users\\technOrbit\\Documents\\workspace-spring-tool-suite-4-4.17.0.RELEASE\\student_logbook\\src\\logbook\\study.gif");
			Image normalImage = icon.getImage();
			Icon warningIcon = new ImageIcon(normalImage);
			JLabel warningLabel = new JLabel(warningIcon);
			frame.add(warningLabel,"Center");
			frame.setSize(600,600);
			frame.setVisible(true);
			frame.setResizable(false);
			
			// Generating the random course codes
			
			
			for(int x = 0;x<2;x++)
			{
				String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#";
				// Create A String Builder
				StringBuilder sb =new StringBuilder();
				// Creating An object Of the random Class
				Random random = new Random();
				int length = 7;
				for(int i = 0;i<length;i++)
				{
					int index = random.nextInt(alphabet.length());
					// getting The Character from specialized index position of the string
					char randomChar = alphabet.charAt(index);
					// append the character to the Stringbuilder
					sb.append(randomChar);
					new_string = sb.toString();
				}
				if(x == 0)
				{
					code1 = new_string;
				}
				else if(x == 1) {
					code2 = new_string;
				
			}
				
			}
			
			
			System.out.println(Colors.RED_BOLD_BRIGHT + "Enter The two lettered first course key like:- MA -Mathematics");
			String course_key1 = object.nextLine();
			
			System.out.println("Enter The two lettered second course key like:- GE -Geography");
			String course_key2 = object.nextLine();
			
			while(course_key1.length() != 2) {
				System.out.println(Colors.RESET + "Enter The two lettered first course key like:- MA -Mathematics ");
				course_key1 = object.nextLine();
				}
			while(course_key2.length() != 2) {
				System.out.println("Enter The two lettered first course key like:- MA -Mathematics ");
				course_key2 = object.nextLine();
				}
			if(course_key1.length() ==2) {
				System.out.println("Enter The Subject Name For The First Key");
				Course_keysubject1 = object.nextLine();
			}
			
			if(course_key2.length() ==2) {
				System.out.println("Enter The Subject Name For The Second Key");
				Course_keysubject2 = object.nextLine();
			}
			
			System.out.println( Colors.PURPLE_BOLD+"Course Code"+ code1);
			System.out.println(" Enter The Course Key For Your First Subject");
			Course_name = object.nextLine();
			while(Course_name.length() !=2) {
				System.out.println(Colors.RESET + "Enter The Two Lettered Course Key Like:- MA - Mathematics");
				Course_name = object.nextLine();
			}
			if(Course_name.length() == 2) {
				System.out.println("Enter The Assignment Type(Enter t-Test or h-Homework or p-Project)");
				assign_type = object.nextLine();
				System.out.println("Enter The Completion Status Of The Assignment(D -Done Or ND- Not Done)");
				status = object.nextLine();
				
			}
			
			System.out.println( Colors.RED_BOLD+"Course Code"+ code1);
			System.out.println(" Enter The Course Key For Your First Subject");
			Course_name2 = object.nextLine();
			while(Course_name2.length() !=2) {
				System.out.println(Colors.RESET + "Enter The Two Lettered Course Key Like:- MA - Mathematics");
				Course_name2 = object.nextLine();
			}
			if(Course_name2.length() == 2) {
				System.out.println(Colors.PURPLE_BOLD+"Enter The Assignment Type(Enter t-Test or h-Homework or p-Project)");
				assign_type2 = object.nextLine();
				System.out.println("Enter The Completion Status Of The Assignment(D -Done Or ND- Not Done) ");
				status2 = object.nextLine();
				
			}
			System.out.println(Colors.RED_BOLD+"Would You Like To Change To The Assignment Status Of Any of the Two Asignment You Have Included(Yes or No)");
			String user = object.nextLine();
			while(user.equals("Yes")) {
				System.out.println("Would You Like To Replace The Subject 1 Assignment Status(Yes Or No)");
				String user_newchoise = object.nextLine();
				if(user_newchoise.equals("Yes"))
				{
					System.out.println("Enter The New Completion Status Of The Assignment(D -Done Or ND- Not Done) for subject 1 ");
					status = object.nextLine();	
				}
				else if(user_newchoise.equals("No")){
					System.out.println(Colors.PURPLE_BOLD+"Would You Like To replace the subject 2 assignment status(Yes or No)");
				    user_newchoise = object.nextLine();
					if(user_newchoise.equals("Yes"))
					{
						System.out.println("Enter The New Completion Status Of The Assignment(D -Done Or ND- Not Done) for subject 2  ");
						status2 = object.nextLine();	
					}
					else if(user_newchoise.equals("No")) {
						System.out.println("okay,Thank You!!");
					}
				}
				System.out.println(Colors.RED_BOLD+"Would You Like To Change To The Assignment Status Of Any of the Two Asignment You Have Included(Yes or No)");
				user = object.nextLine();
				
						
				}
				if(user.equals("No")) {
					String cmd = "";
					String os = System.getProperty("os.name").toString();
					if(os.startsWith("Mac OS X")) {
						cmd = "TextEdit";
						
					}
					else if(os.startsWith("Windows")) {
						cmd = "notepad";
						
					}
					Runtime runtime = Runtime.getRuntime();
					runtime.exec(cmd);
					Thread.sleep(2000);
					Robot rb = new Robot();
					String title = "\t\t\t Assignment Logbook\n";
					String keys = " Subject keys\n " + course_key1 + "-" + Course_keysubject1 + "\n" + course_key2 + "-" + Course_keysubject2 + "\n";
					String assignment_keys = "Assignment keys\t" + "t- for test   h- for homework   p- for project  " + "\n";		
					StringBuilder str = new StringBuilder("course_Code" + "\t" + "Course Name" + "\t" + "Assignment Type " + "\t\t" + "Status" + "\n" + code1 + "\t\t" + Course_name + "\t\t" + assign_type +"\t\t\t" + status + "\n" + code2 + "\t\t" + Course_name2+ "\t\t" + assign_type2 +"\t\t\t" + status2 );
					String s = title + keys + assignment_keys + str.toString();
					StringSelection StringSelection = new StringSelection(s);
					Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
					clip.setContents(StringSelection, StringSelection);
					rb.keyPress(KeyEvent.VK_CONTROL);
					rb.keyPress(KeyEvent.VK_V);
					rb.keyRelease(KeyEvent.VK_V);
					rb.keyRelease(KeyEvent.VK_CONTROL);
							
				}
			System.out.println(Colors.RESET + "Are you Ready To Begin(Y or N)?");
			answer = begin.nextLine();
			
		}
		if(answer.equals("N")) {
			System.out.println("Okay, Have A Nice Day!!");
			
		}
		
	}

}


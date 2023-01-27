package trig;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.*;
import java.lang.Math.*;

import com.lowagie.text.Document;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Font;


public class Trigonometry_Calc extends JFrame {
	private MyCanvas canvas = new MyCanvas();
	static JFrame j = new JFrame();
	static Scanner text = new Scanner(System.in);
	static Scanner number = new Scanner(System.in);
	static String user_choice;
	static String name;
	static double result;
	static String side_given;
	static String side_tobefound;
	static String angle;
	static double theta;
	static String first_side;
	static String second_side;
	static String status;
	static String path;
	static String q_num;
	static Document document;
	static PdfWriter writer;
	static String user_response;
	
	public Trigonometry_Calc()
	{
		canvas.setBackground(Color.WHITE);
		j.add(canvas);
		j.setLayout(new BorderLayout());
		j.setSize(900,450);
		j.setTitle("Trigonometric Calculator");
		j.add("Center",canvas);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setResizable(false);
	}
	
	private class MyCanvas extends Canvas
	{
		public void paint(Graphics g)
		{
			g.setColor(Color.MAGENTA);
			g.setFont(new java.awt.Font("Comic Sans MS",Font.BOLD, 20));
			g.drawString(name + ", the result is:-",250,25);
			java.awt.Image img2 = new ImageIcon("C:\\Users\\dell\\Downloads\\Programming_Mathematics\\Lesson 19 Materials\\triangle.png").getImage();
			g.drawImage(img2,200,30,this);
			g.setColor(Color.RED);
			g.setFont(new java.awt.Font("Comic Sans MS",Font.BOLD, 20));
			
			//The Section Below Is For finding Missing Side Of Right Angle Triangle 
			if(status.equals("first"))
			{
				//sin(SOH) Sin theta = Opposite/Hypotenuse to find the missing other side of the right triangle
				
				if(side_given.equals("H") && side_tobefound.equals("O"))
				{//sin theta = 0/H = sin theta * hypotenuse
					System.out.println("Enter the hypotenuse side value");
					double hypoth = number.nextDouble();
					String hyp = Double.toString(hypoth);
					System.out.println("Below is the picture of the right angle triangle");
					g.drawString(hyp,480,200);      //this value will be placed hypotenuse
					g.drawString(angle,520,300);    //this angle value will be placed on the down corner of the right angle
					g.drawString("The Solution is:- Opposite side " + " = " + "theta"  + " = " + "Sin theta" + "x" + hypoth,200,380);
					result = Math.sin(Math.toRadians(theta))*hypoth;
					DecimalFormat df = new DecimalFormat("#.#");
					String res = df.format(result);
					System.out.println(COLORS.RED +"********************************************************************************");
					System.out.println("The opposite side of value of the right angle triangle is:- " +res);
					System.out.println("********************************************************************************");
					g.drawString(res,170,200);      //this places the opposite side value on he opposite side of the right angle triangle
				}
				else if(side_given.equals("O") && side_tobefound.equals("H"))
				{
					System.out.println(COLORS.RESET +"Enter the opposite side value");
					double opps = number.nextDouble();
					String opp = Double.toString(opps);
					System.out.println("Below is the picture of the right angle triangle");
					g.drawString(opp,170,200);      //this value will be placed opposite side
					g.drawString(angle,520,300);    //this angle value will be placed on the down corner of the right angle
					g.drawString("The Solution is:- Sin " + theta + "= " + opps + "/" + side_tobefound,200,380);
					result = opps/Math.sin(Math.toRadians(theta));     //SOH = 0/H
					DecimalFormat df = new DecimalFormat("#.#");
					String res = df.format(result);
					System.out.println(COLORS.RED +"********************************************************************************");
					System.out.println("The hypotenuse side of value of the right angle triangle is:- " +res);
					System.out.println("********************************************************************************");
					g.drawString(res,480,200);      //this places the hypotenuse side value on he hypotenuse side of the right angle triangle
				}
				//Using cosine trigonometric ratio Cos theta =A/H = H = cos theta/A
				
				else if(side_given.equals("A") && side_tobefound.equals("H"))
				{
					System.out.println(COLORS.RESET +"Enter the adjacent side value");
					double adja = number.nextDouble();
					String adjace = Double.toString(adja);
					System.out.println("Below is the picture of the right angle triangle");
					g.drawString(adjace,400,350);      //this value will be placed adjacent side
					g.drawString(angle,520,300);    //this angle value will be placed on the down corner of the right angle
					g.drawString("The Solution is:- Cos " + theta + "= " + adja + "/" + side_tobefound,200,380);
					result = adja/Math.cos(Math.toRadians(theta));     //SOH = 0/H
					DecimalFormat df = new DecimalFormat("#.#");
					String res = df.format(result);
					System.out.println(COLORS.RED +"********************************************************************************");
					System.out.println("The hypotenuse side of value of the right angle triangle is:- " +res);
					System.out.println("********************************************************************************");
					g.drawString(res,480,200);      //this places the hypotenuse side value on he hypotenuse side of the right angle triangle
					
				}
				//cos theta = A/H = cos theta * hypotenuse
				else if(side_given.equals("H") && side_tobefound.equals("A"))
				
				{
					
					System.out.println(COLORS.RESET +"Enter the hypotenuse side value");
					double hypoth = number.nextDouble();
					String hypo = Double.toString(hypoth);
					System.out.println("Below is the picture of the right angle triangle");
					g.drawString(hypo,480,200);      //this value will be placed hypotenuse
					g.drawString(angle,520,300);    //this angle value will be placed on the down corner of the right angle
					g.drawString("The Solution is:- Adjacent side " +  "= " + "Cos theta " + "x" + hypoth,200,380);
					result = Math.cos(Math.toRadians(theta))*hypoth;     //SOH = 0/H
					DecimalFormat df = new DecimalFormat("#.#");
					String res = df.format(result);
					System.out.println(COLORS.RED +"********************************************************************************");
					System.out.println("The adjacent side of value of the right angle triangle is:- " +res);
					System.out.println("********************************************************************************");
					g.drawString(res,400,350);      //this places the adjacent side value on he adjacent side of the right angle triangle
					
				}
				
				//Using The TOA trigonometric Ratio-----Tan theta = 0/A
				else if(side_given.equals("o") && side_tobefound.equals("A"))
				{
					
					//System.out.println(COLORS.RESET +"Enter the Opposite side value");
					double opps = number.nextDouble();
					String opp = Double.toString(opps);
					System.out.println("Below is the picture of the right angle triangle");
					g.drawString(opp,170,200);      //this value will be placed opposite Side
					g.drawString(angle,520,300);    //this angle value will be placed on the down corner of the right angle
					g.drawString("The Solution is:- Tan " + theta + "= " + opps+ "/" + side_tobefound,200,380);
					result = opps/Math.tan(Math.toRadians(theta));     //SOH = 0/H
					DecimalFormat df = new DecimalFormat("#.#");
					String res = df.format(result);
					System.out.println(COLORS.RED +"********************************************************************************");
					System.out.println("The adjacent side of value of the right angle triangle is:- " +res);
					System.out.println("********************************************************************************");
					g.drawString(res,400,350);      //this places the adjacent side value on he adjacent side of the right angle triangle
					
				}
				
				else if(side_given.equals("A") && side_tobefound.equals("o"))
				{
					//Tan theta = O/A
					//System.out.println(COLORS.RESET +"Enter the Opposite side value");
					double adjace = number.nextDouble();
					String adj = Double.toString(adjace);
					System.out.println("Below is the picture of the right angle triangle");
					g.drawString(adj,400,3500);      //this value will be placed adjacent Side
					g.drawString(angle,520,300);    //this angle value will be placed on the down corner of the right angle
					g.drawString("The Solution is:- Opposite side " +  "= " + "Tan theta " + "x" + adjace,200,380);
					result = Math.tan(Math.toRadians(theta))*adjace;     //SOH = 0/H
					DecimalFormat df = new DecimalFormat("#.#");
					String res = df.format(result);
					System.out.println(COLORS.RED +"********************************************************************************");
					System.out.println("The Opposite side of value of the right angle triangle is:- " +res);
					System.out.println("********************************************************************************");
					g.drawString(res,170,200);      //this places the Opposite side value on the Opposite side of the right angle triangle
					
				}
				else {
					System.out.println(COLORS.RED + "You have entered incorrect options!!,Please Try Again!!");
				}
					
			}
			
			else if(status.equals("second")) {
				//Sin inverse trigonometric ratio
				if((first_side.equals("O") && second_side.equals("H")) || (first_side.equals("H") && second_side.equals("O")))
				{
					System.out.println(COLORS.BLACK_BOLD + "Enter The Opposite Side Value");
					double opp_side = number.nextDouble();
					String change_opp = Double.toString(opp_side);
					System.out.println("Enter The Hypotenuse Side Value");
					double hypo_side = number.nextDouble();
					String change_hypo = Double.toString(hypo_side);
					result= Math.toDegrees(Math.asin(opp_side/hypo_side));
					DecimalFormat df = new DecimalFormat("#.#");
					String res = df.format(result);
					System.out.println(COLORS.RED +"********************************************************************************");
					System.out.println("The angle value  of the right angle triangle is:- " +res);
					System.out.println("********************************************************************************");
					g.drawString(change_opp,170,200);   //this is placed on the opposite side
					g.drawString(change_hypo,480,200);    //this is placed on the hypotenuse side
					g.drawString(res,520,300);
					g.drawString("The solution is:- asin theta " + "=" + change_opp + "/" + change_hypo,200,380);
				
				}
				
				//cosine inverse trigonometric ratio
				else if((first_side.equals("A") && second_side.equals("H")) || (first_side.equals("H") && second_side.equals("A")))
				{
					System.out.println(COLORS.BLACK_BOLD + "Enter The Adjacent Side Value");
					double adjacent_side = number.nextDouble();
					String change_adj = Double.toString(adjacent_side);
					System.out.println("Enter The Hypotenuse Side Value");
					double hypo_side = number.nextDouble();
					String change_hypo = Double.toString(hypo_side);
					result= Math.toDegrees(Math.acos(adjacent_side/hypo_side));
					DecimalFormat df = new DecimalFormat("#.#");
					String res = df.format(result);
					System.out.println(COLORS.RED +"********************************************************************************");
					System.out.println("The angle value  of the right angle triangle is:- " +res);
					System.out.println("********************************************************************************");
					g.drawString(change_adj,400,350);   //this is placed on the adjacent side
					g.drawString(change_hypo,480,200);    //this is placed on the hypotenuse side
					g.drawString(res,520,300);
					g.drawString("The solution is:- acos theta " + "=" + change_adj + "/" + change_hypo,200,380);
				
				}
				
				//Tangent inverse trigonometric ratio Tan theta = O/A
				else if((first_side.equals("O") && second_side.equals("A")) || (first_side.equals("A") && second_side.equals("O")))
				{
					System.out.println(COLORS.BLACK_BOLD + "Enter The Opposite Side Value");
					double opp_side = number.nextDouble();
					String change_opp = Double.toString(opp_side);
					System.out.println("Enter The Adjacent Side Value");
					double adjacent_side = number.nextDouble();
					String change_adj = Double.toString(adjacent_side);
					result= Math.toDegrees(Math.atan(opp_side/adjacent_side));
					DecimalFormat df = new DecimalFormat("#.#");
					String res = df.format(result);
					System.out.println(COLORS.RED +"********************************************************************************");
					System.out.println("The angle value  of the right angle triangle is:- " +res);
					System.out.println("********************************************************************************");
					g.drawString(change_opp,170,200);   //this is placed on the opposite side
					g.drawString(change_adj,400,350);    //this is placed on the adjacent side
					g.drawString(res,520,300);
					g.drawString("The solution is:- atan theta " + "=" + change_opp + "/" + change_adj,200,380);
				
				}
				
				else {
					System.out.println(COLORS.RED + "You have entered incorrect options!!,Please Try Again!!");
				}
			}
			System.out.println("Wait for 30 second before the program proceeds to the next steps ");	
		}	
	}

	public static void main(String[] args)throws Exception {
		System.out.println("Please Enter your name ");
		name = text.nextLine();
		System.out.println("Please enter the location where you would like to store the pdf document \nExample:- C:\\Users\\dell\\Downloads\\Programming_Mathematics\\Lesson 19 Materials\\alisia2.pdf");
		String pdffilepath = text.nextLine();
		OutputStream fos = new FileOutputStream(new File(pdffilepath));
		document = new Document(PageSize.A4.rotate());
		writer = PdfWriter.getInstance(document, fos);
		document.open();
		Trigonometry_Calc t = new Trigonometry_Calc();
		System.out.println("##########################################################################################################");
		System.out.println(COLORS.PURPLE_BOLD_BRIGHT + "Welcome to the SOH CAH TOA calculator");
		System.out.println("##########################################################################################################");
		System.out.println(COLORS.RESET +"Would you like to use the SOH CAH TOA calculator(Y or N)? ");
		user_choice = text.nextLine();
		while(user_choice.equals("Y"))
		{
			System.out.println(COLORS.GREEN_BOLD_BRIGHT + "##########################################################################################################");
			System.out.println("\t\t\t\tTrigonometry calculator Menu\nA.Calculate a side of the right angle triangle\nB.Calculate the angle of the right angle triangle\n");
			user_response = text.nextLine();
			if(user_response.equals("A"))
			{
				status = "first";
				System.out.println(COLORS.RED +"*********************************************************************************************************************************************");
				System.out.println("What side are you given?\nH - Hypotenuse O = Opposite A = Adjacent ");
				side_given = text.nextLine();
				System.out.println(COLORS.GREEN_BOLD_BRIGHT  +"*********************************************************************************************************************************************");
				System.out.println("What side are you looking for?\nH - Hypotenuse O = Opposite A = Adjacent ");
				side_tobefound = text.nextLine();
				System.out.println(COLORS.RESET + "*********************************************************************************************************************************************");
				System.out.println("what is the value of the angle theta(<)");
				theta = number.nextDouble();
				System.out.println(COLORS.RED +"*********************************************************************************************************************************************");
				System.out.println("What side are you given\nH - Hypotenuse O = Opposite A = Adjacent ");
				side_given = text.nextLine();
				System.out.println("*********************************************************************************************************************************************");
				angle = Double.toString(theta);
				j.setVisible(true);
			}
			
			else if(user_response.equals("B"))
			{
				status = "second";
				System.out.println(COLORS.RED_BOLD_BRIGHT +"*********************************************************************************************************************************************");
				System.out.println("What is the first side given?\nH =Hypotenuse O = Opposite A = Adjacent");
				first_side = text.nextLine();
				System.out.println("*********************************************************************************************************************************************");
				System.out.println(COLORS.BLACK_BOLD_BRIGHT+"What is the second side given?\nH =Hypotenuse O = Opposite A = Adjacent");
				second_side = text.nextLine();
				System.out.println("*********************************************************************************************************************************************");
				j.setVisible(true);
				
			}
			Thread.sleep(30000);
			// Taking Screenshot of the result
			try{
				Robot r = new Robot();
				System.out.println(COLORS.RED_BOLD + "Enter the file path where you wpuld like to store the image in");
				path = text.nextLine();
				System.out.println("NOtification:- Please keep the image open for the 5 second so the screnshot is taken");
				Thread.sleep(5000);
				Dimension dimension = new Dimension(900,450);
				Rectangle capture = new Rectangle(dimension);
				BufferedImage Image = r.createScreenCapture(capture) ;
				ImageIO.write(Image, "png", new File(path));
				System.out.println("The image has been sucessfully taken! ");
				System.out.println("Please enter a question number for this question");
				q_num = text.nextLine();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			Image img = Image.getInstance(path);
			try {
				Font fontsize_18 = FontFactory.getFont(FontFactory.TIMES,18f);
				document.add(new Paragraph("\nQuestion " + q_num + "\n",fontsize_18));
				document.add(img);
				document.add(new Paragraph("\n"));
				
			}catch(Exception e1){
				e1.printStackTrace();
			}
			
			System.out.println("Your question has been saved and please now wait for 30 seconds to use the calculator again");
			Thread.sleep(30000);
			j.dispose();
			
			System.out.println(COLORS.RESET +"Would you like to use the SOH CAH TOA calculator(Y or N)? ");
			user_choice = text.nextLine();
			
		}
		
		if(user_choice.equals("N"))
		{
			System.out.println(COLORS.RED +"Okay, Thank you!");
			document.close();
			writer.close();
		}
		
	}

}

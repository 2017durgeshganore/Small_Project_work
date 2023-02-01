package water_analyzer;

import java.util.*;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;

import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class WaterHealth_Analyzer {
	static String TSI_status = "";
	static double total_specimen = 0;
	static double total_product = 0;
	static double HBI;
	static String HBI_status;
	static Date current_DateTime;
	static String secchi;
	static String TSI_new;
	static String HBI_new;
	static DecimalFormat dc;
	static String water_bodyname;
	static StringBuilder qr_result;
	
	@SuppressWarnings("deprecation")
	private static void generateQRCode(String text, int width, int height) throws Exception
	{
		QRCodeWriter qcwobj = new QRCodeWriter();
		BitMatrix bmobj = qcwobj.encode(text, BarcodeFormat.QR_CODE, width, height);
		String path = "C:\\Users\\dell\\Downloads\\Materials_Programming+++Mathematics+++Water+Science+++Education+++Health\\Lesson 20 Materials\\result.png";
		MatrixToImageWriter.writeToFile(bmobj, "PNG", new File(path));
			
	}
	
	public static void main(String[] args) throws Exception {
		Scanner string = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		
		//insert local date and time
		current_DateTime = new Date();
		//keep the answers to two decimal places
		dc = new DecimalFormat("#.##");
		
		//Starting the main body from program
		
		System.out.println(Colors.RESET);
		System.out.println(Colors.CYAN_BOLD_BRIGHT +"****************************************************************************************************************************************************************************");
		System.out.printf("%20s", "Welcome to the water body health analyzer program");
		System.out.println("\n****************************************************************************************************************************************************************************");
		
		System.out.println(Colors.GREEN_BOLD_BRIGHT +"****************************************************************************************************************************************************************************");
		System.out.println("Question:- A grandfather, two fathers and two sons went to went to the movie theater/nand everyone bought one ticket each.\nHow many tickets did they buy in total ?(type your answer in letters)");
		System.out.println("****************************************************************************************************************************************************************************");
		System.out.println(Colors.HIDDEN );
		String user_answer = string.nextLine();
		while(user_answer.equals("three"))
		{
			System.out.println(Colors.RESET);
			System.out.println(Colors.GREEN_BOLD_BRIGHT +"****************************************************************************************************************************************************************************");
			System.out.println("Question:- A grandfather, two fathers and two sons went to went to the movie theater/nand everyone bought one ticket each.\nHow many tickets did they buy in total ?(type your answer in letters)");
			System.out.println("****************************************************************************************************************************************************************************");
			System.out.println(Colors.HIDDEN );
			user_answer = string.nextLine();
		}
		if(user_answer.equals("two"))
		{
			System.out.println(Colors.RESET + "\uD83D\uDE03 Yepp!, you got it. So, you can now use this program");
		    System.out.println("How Many water body Areas Would you like to Analayze");
		    int water_bodies =number.nextInt();
		    System.out.println("Please Enter The location Of where you like to store the results");
		    String pdfFilePath = string.nextLine();
		    OutputStream fos = new FileOutputStream(new File(pdfFilePath));
		    Document document = new Document(PageSize.A4.rotate());
		    PdfWriter writer = PdfWriter.getInstance(document, fos);
		    PdfPTable table = new PdfPTable(5);
		    float widths[]= {3,3,3,3,3};
		    table.setWidths(widths);
		    PdfPCell cell = new PdfPCell(new Phrase("water BOdy Name"));
		    cell.setBackgroundColor(Color.CYAN);
		    table.addCell(cell);
		    cell = new PdfPCell(new Phrase("water BOdy Type"));
		    cell.setBackgroundColor(Color.CYAN);
		    table.addCell(cell);
		    cell = new PdfPCell(new Phrase("Secchi Depth(Meters)"));
		    cell.setBackgroundColor(Color.CYAN);
		    table.addCell(cell);
		    cell = new PdfPCell(new Phrase("TSI(Secchi Depth)"));
		    cell.setBackgroundColor(Color.CYAN);
		    table.addCell(cell);
		    cell = new PdfPCell(new Phrase("Hilsenhoff Biotic Index(HBI)"));
		    cell.setBackgroundColor(Color.CYAN);
		    table.addCell(cell);
		    Phrase ph;
		    qr_result = new StringBuilder();
		    document.open();
		    Font font_setting = FontFactory.getFont(FontFactory.TIMES,18f);
		    document.add(new Paragraph("The Water Body Health Analyzer Results",font_setting));
		    document.add(new Paragraph("\n"));
		    document.add(new Paragraph(current_DateTime.toString(),font_setting));
		    document.add(new Paragraph("\n"));
		    document.add(new Paragraph("Deatiled Results:-"));
		    document.add(new Paragraph("\n"));
		    for(int x =1;x<=water_bodies;x++) {
		    	System.out.println("Enter The Name Of The Water Body");
		    	water_bodyname = string.nextLine();
		    	System.out.println("Enter The Water Body type(rivers,sea,stream,lake,etc)");
		    	String water_type = string.nextLine();
		    	System.out.println("Enter The Extinction Depth(Meters)");
		    	double extinct_depth = number.nextDouble();
		    	System.out.println("Enter the Eruption depth(meters)");
		    	double erupt_depth = number.nextDouble();
		    	double secchi_depth = (extinct_depth + erupt_depth)/2;
		    	secchi = dc.format(secchi_depth);
		    	double TSI = 60 - 14.41 * Math.log(secchi_depth);
		    	TSI_new = dc.format(TSI);
		    	if(TSI >= 0 && TSI <= 40)
		    	{
		    		TSI_status = "Oligotrophic";
		    	}
		    	else if(TSI > 40 && TSI <= 50)
		    	{
		    		TSI_status = "Mesotrophic";
		    	}
		    	else if(TSI >50)
		    	{
		    		TSI_status = "Eutrophic";
		    	}
		    	
		    	//Calculating the Hilsenhoff Biotic Index(HBI)
		    	
		    	System.out.println(Colors.BLUE_BOLD_BRIGHT +"****************************************************************************************");
		    	System.out.println("Hilsenhoff Biotic Index calculation(HBI)");
		    	System.out.println("****************************************************************************************");
		    	
		    	System.out.println(Colors.RESET + "How many species did you sample in this area?");
		    	int species = number.nextInt();
		    	
		    	for(int y=1;y<=species;y++)
		    	{
		    		System.out.println(Colors.RED_BOLD_BRIGHT +"Enter the tolerance value of species" + y);
		    		double tolerance = number.nextDouble();
		    		System.out.println("Enter the number of specimens sampled for species " + y);
		    		double specimen = number.nextInt();
		    		double product = tolerance * specimen;
		    		total_specimen = total_specimen + specimen;
		    		total_product = total_product + product;
		    		HBI = total_product/total_specimen;
		    	}
		    	
		    	HBI_new = dc.format(HBI);
		    	
		    	if(HBI >= 0 && HBI<= 3.75)
		    	{
		    		HBI_status = "The water quality is excellent, organic pollution is unlikely";
		    	}
		    	else if(HBI >= 3.76 && HBI <= 4.25)
		    	{
		    		HBI_status = "The water quality is very good, possible silent organic pollution";
		    	}
		    	else if(HBI >= 4.26 && HBI<= 5.00)
		    	{
		    		HBI_status = "The water quality is very good, some organic pollution is probable";
		    	}
		    	else if(HBI >= 5.01 && HBI<= 5.75)
		    	{
		    		HBI_status = "The water quality is fair, fairly substantial pollution is likely";
		    	}
		    	else if(HBI >= 5.76 && HBI<= 6.50)
		    	{
		    		HBI_status = "The water quality is fairly poor, substantial pollution is likely";
		    	}
		    	else if(HBI >= 6.51 && HBI<= 7.25)
		    	{
		    		HBI_status = "The water quality is poor, very substantial pollution is likely";
		    	}
		    	else if(HBI >= 7.26 && HBI<= 10.0)
		    	{
		    		HBI_status = "The water quality is very poor, severe organic pollution is likely";
		    	}
		    	
		    	cell = new PdfPCell();
		    	ph = new Phrase(water_bodyname);
		    	cell.addElement(ph);
		    	table.addCell(cell);
		    	
		    	cell = new PdfPCell();
		    	ph = new Phrase(water_type);
		    	cell.addElement(ph);
		    	table.addCell(cell);
		    	
		    	cell = new PdfPCell();
		    	ph = new Phrase(secchi);
		    	cell.addElement(ph);
		    	table.addCell(cell);
		    	
		    	cell = new PdfPCell();
		    	ph = new Phrase(TSI_new);
		    	cell.addElement(ph);
		    	table.addCell(cell);
		    	
		    	cell = new PdfPCell();
		    	ph = new Phrase(HBI_new);
		    	cell.addElement(ph);
		    	table.addCell(cell);
		    	
		    	document.add(new Paragraph("Trophic State Index Result For Area "+ x + " is:- " + TSI_status));
		    	document.add(new Paragraph("\n"));
		    	document.add(new Paragraph("Hilsenhoff Biotic Index Result For Area "+ x + " is:- " + HBI_status));
		    	document.add(new Paragraph("\n"));
		    	if(x==water_bodies)
		    	{
		    		document.add(table);
		    	}
		    	
		    	String results = "Water body name is:- " + water_bodyname + 
		    			"\nThe secchi depth in meters is:- " + secchi + 
		    			"\nThe trophic state index is:- " + TSI_new +
		    			"\nThe Hilsenoff biotic index is:- " + HBI_new +
		    			"\n";
		    	
		    	qr_result.append(results);
		    }
		    
		    System.out.println("Thank you!");
		    generateQRCode(qr_result.toString(),1250, 1250);
		    document.close();
		    writer.close();
		}
		
		
	}

}

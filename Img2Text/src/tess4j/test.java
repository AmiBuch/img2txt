package tess4j;
import java.io.File;
import java.io.*;
import net.sourceforge.tess4j.*;


public class test {


	public static void main(String[] args) throws IOException{
		File imageFile = new File("C:\\Users\\megha\\eclipse-workspace\\Img2Text\\Images\\eurotext.tif");
		ITesseract instance = new Tesseract();
		instance.setDatapath("C:\\Users\\megha\\eclipse-workspace\\Img2Text\\tessdata");
		try {
			String result = instance.doOCR(imageFile);
			System.out.println(result);
		}
		catch (TesseractException e){ 
			System.err.println(e.getMessage());
			
		
		}
		
			
	}
}
		
	
		
		
	





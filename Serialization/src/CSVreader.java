import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;


public class CSVreader {
	
	public static void main(String[] args) throws IOException{

		CSVReader reader = new CSVReader(new FileReader("yourfile.csv"));
	  
		String [] nextLine;
	    Account acc;
	    
	    while ((nextLine = reader.readNext()) != null) {
	        // nextLine[] is an array of values from the line
	    	acc = new Account(nextLine);
	    	System.out.println("Name is: "+acc.mName + " with $"+acc.mMoney);
	        
	    }
	}

}

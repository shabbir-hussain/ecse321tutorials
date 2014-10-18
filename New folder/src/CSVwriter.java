import java.io.FileWriter;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVWriter;


public class CSVwriter {
	
	public static void main(String[] args) throws IOException{
		
		CSVWriter writer = new CSVWriter(new FileWriter("yourfile.csv"), ',');
		
		Account bill = new Account("Bill Murray", 10000000);
		Account MC = new Account("MCHammer", 0);
		
		writer.writeNext(bill.toCSVEntry());
		writer.writeNext(MC.toCSVEntry());
		
		writer.close();
		
	}

}

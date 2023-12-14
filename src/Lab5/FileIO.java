package Lab5;

import java.io.*;

public class FileIO {

	public static void main(String[] args) {

		String inFile = "lab5_input.txt";
		String outFile = "lab5_output.txt";
		
        try {
        	// prepare read
			FileReader fReader = new FileReader(inFile);
			BufferedReader bReader = new BufferedReader(fReader);
			
			//prepare write
			FileWriter fWriter = new FileWriter(outFile);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			
			//do read 
			String line;
			while ((line = bReader.readLine()) != null) {
				System.out.println(line);
				bWriter.write(line);
			}

			bReader.close();
			fReader.close();
			
			bWriter.close();
			fWriter.close();
			
		} catch (IOException  e) {
			System.out.println(e.getMessage());
		}
	}
}

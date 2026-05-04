package q25;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("ash.txt");
			fileWriter.write("Hello Baigan");
			fileWriter.close();
			System.out.println("Done!!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
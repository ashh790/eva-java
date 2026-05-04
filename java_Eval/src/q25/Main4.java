package q25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
	 File file = new File("ash.txt");
	 try {
		 Scanner scanner = new Scanner(file);
		 while(scanner.hasNextLine()) {
			 String string =(String) scanner.nextLine();
			 System.out.println(string);
		}
	 }catch(FileNotFoundException e) {
		 e.printStackTrace();
	 }

	}
		 }
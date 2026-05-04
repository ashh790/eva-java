package q25;

import java.io.File;

public class Main{
	public static void main(String[] args) {
		try {
			File file = new File("ash.txt");
			file.createNewFile();
			System.out.println("File created");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
package q25;

import java.io.File;

public class Main3 {

	public static void main(String[] args) {
		File  file = new File("ash.txt");
		
		if(file.delete()) {
			System.out.println("File Deleted:"+file.getName());
		}else {
			System.out.println("Not deleted");
		}
	}

}

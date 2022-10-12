package Java11Assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VarDeclaration {

	public static void main(String[] args) {
		String path="C:\\Users\\vk51\\Documents\\var.text";
		try {
			String s=Files.readString(Path.of(path));
			System.out.println(s);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}

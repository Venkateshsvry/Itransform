package BasiDataStructure;

import java.util.Scanner;

public class LoginPage {
	static int count=0;
	public static void main(String[] args) {
		System.out.println("enter the values");
		Scanner sc=new Scanner(System.in);
		String username=sc.next();
		String password=sc.next();
		login(username,password);
		
		
}
	public static void login(String username,String password) {
		if(username.equals("venkatesh") && password.equals("venkatesh") ) {
			System.out.println("login succesfull");
		}
		else {
			count++;
			if(count==3) {System.out.println("contact admin");}
			else {
			main(null);}
		}
	}

}
package BasiDataStructure;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		double tax=0;
		System.out.println("enter the amount");
		Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		if(amount>0 && amount<=180000) {
		tax=0;	
		}
		else if(amount>180000&& amount<=300000) {
			tax=(amount*10)/100;
		}
		else if(amount>300000&& amount<=500000) {
			tax=(amount*20)/100;
		}
		else if(amount>500000&& amount<=1000000) {
			tax=(amount*30)/100;
		}
		System.out.println(tax);
	}

}

package Java11Assignments;

public class SimpleInterest {

	public static void main(String[] args) {
		SimpleInterestInterface si=(a,b,c)->{
			return (double) (a*b*c)/100;
			// a-principle amount,b-period in months,c-intrest per year
		};
System.out.println(si.SI(10000l, 10, 2));
	}

}

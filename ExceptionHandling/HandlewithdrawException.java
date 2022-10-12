package ExceptionHandling;

import java.util.Scanner;

public class HandlewithdrawException {

	public static void main(String[] args) {

		System.out.println("enter the values");
		Scanner sc = new Scanner(System.in);
		double balance = sc.nextDouble();
		try {
			double withdraw = sc.nextDouble();
			if (withdraw < 0) {
				throw new IllegalBankTranscationException("enter the valid amount");
			} else if (withdraw > balance) {
				throw new InsuffiecientBalanceException("Insuffiecient balance");
			}

			else {
				System.out.println("withdrawn succesful");
				double remainingamount = balance - withdraw;
				System.out.println("balance is " + remainingamount);
			}

		} catch (InsuffiecientBalanceException e) {
			System.out.println("insuffient balance");
		} catch (IllegalBankTranscationException e) {
			System.out.println("enter the valid amount");
		}

	}

}

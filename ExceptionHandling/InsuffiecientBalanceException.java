package ExceptionHandling;



public class InsuffiecientBalanceException extends Exception{
	public InsuffiecientBalanceException() {
		super();
	}

	String s;

	public InsuffiecientBalanceException(String s) {
		super(s);
		
	}

	
	

}

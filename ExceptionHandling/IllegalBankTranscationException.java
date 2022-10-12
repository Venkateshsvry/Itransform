package ExceptionHandling;

public class IllegalBankTranscationException extends Exception {
	String s;

	public IllegalBankTranscationException(String s) {
		super(s);
		
	}

	public IllegalBankTranscationException() {
		super();
	}
	

}

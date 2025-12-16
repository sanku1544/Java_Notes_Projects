package all.Exceptions;

public class InvalidEmailException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public InvalidEmailException() {
		super();
	}
	public InvalidEmailException(String  msg) {
		super(msg);
	}

}

package all.Exceptions;

public class InvalidSalaryException extends  RuntimeException {

	private static final long serialVersionUID = 1L;
		
	public InvalidSalaryException() {
		super();
	}
	public InvalidSalaryException(String msg) {
		super(msg);
	}
	
}

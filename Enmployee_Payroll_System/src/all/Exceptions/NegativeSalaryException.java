package all.Exceptions;

public class NegativeSalaryException extends RuntimeException {


	private static final long serialVersionUID = 1L;
	public NegativeSalaryException() {
		super();
	}
	public NegativeSalaryException(String msg) {
		super(msg);
	}
	

}

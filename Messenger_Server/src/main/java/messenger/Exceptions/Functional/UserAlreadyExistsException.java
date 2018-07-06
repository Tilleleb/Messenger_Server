package messenger.Exceptions.Functional;


/**
 * 
 * If a user already exists, this exception is used.
 * 
 * @author Thilo
 *
 */
public class UserAlreadyExistsException extends Exception{
	static final long serialVersionUID = 1L;

	
	public UserAlreadyExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

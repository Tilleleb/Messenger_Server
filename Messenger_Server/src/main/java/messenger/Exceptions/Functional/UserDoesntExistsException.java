package messenger.Exceptions.Functional;


/**
 * 
 * If a user doesen't exists, this exception is used.
 * 
 * @author Thilo
 *
 */
public class UserDoesntExistsException extends Exception{
	private static final long serialVersionUID = 1L;

	public UserDoesntExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

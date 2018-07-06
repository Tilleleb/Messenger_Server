package messenger.Exceptions.Functional;


/**
 * 
 * If a contact doesen't exists, this exception is used.
 * 
 * @author Thilo
 *
 */
public class ContactDoesntExistsException extends Exception{
	private static final long serialVersionUID = 1L;

	public ContactDoesntExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

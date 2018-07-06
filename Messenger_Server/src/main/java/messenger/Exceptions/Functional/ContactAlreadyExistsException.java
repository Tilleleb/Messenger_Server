package messenger.Exceptions.Functional;


/**
 * 
 * If a contact already exists, this exception is used.
 * 
 * @author Thilo
 *
 */
public class ContactAlreadyExistsException extends Exception{
	static final long serialVersionUID = 1L;

	
	public ContactAlreadyExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

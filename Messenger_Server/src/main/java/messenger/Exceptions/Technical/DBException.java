package messenger.Exceptions.Technical;


/**
 * 
 * This Exception wraps all exceptions that are relevant to 
 * database-errors and persistance-errors.
 * 
 * @author Thilo Lebski
 *
 */
public class DBException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DBException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}

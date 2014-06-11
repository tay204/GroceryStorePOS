package finalProj;

public class PasswordException extends RuntimeException
{
	/**
	 * Throw exception for wrong password
	 * @author yeotaJMU
	 */
	public PasswordException ()
	{
		super();
	}
	
	public PasswordException (String message)
	{
		super(message);
	}
}

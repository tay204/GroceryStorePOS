package finalProj;

public class MoneyException extends RuntimeException
{
	/**
	 * Throw exception for money issues
	 * @author yeotaJMU
	 */

	public MoneyException ()
	{
		super ();
	}
	
	public MoneyException (String message)
	{
		super (message);
	}	

}
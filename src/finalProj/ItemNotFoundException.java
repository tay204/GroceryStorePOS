package finalProj;

public class ItemNotFoundException extends RuntimeException 
{
	/**
	 * Handles item not found exception during search
	 * @author yeotaJMU
	 */
	public ItemNotFoundException ()
	{
		super();
	}
	
	public ItemNotFoundException (String message)
	{
		super(message);
	}
}

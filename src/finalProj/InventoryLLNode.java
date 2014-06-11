package finalProj;

public class InventoryLLNode<T> extends Inventory<T>
{
	/**
	 * Class to create Inventory nodes to fill the doubly linked list
	 * @author yeotaJMU
	 */
	
	private InventoryLLNode next;
	
	//constructor
	public InventoryLLNode ()
	{
		super();
		next = null;
	}

	//to string method
	public String toString ()
	{
		return (super.toString());
	}
	
	
	//getter and setters
	public InventoryLLNode getNext() {
		return next;
	}

	public void setNext(InventoryLLNode next) {
		this.next = next;
	}
}

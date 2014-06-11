package finalProj;
import java.util.Scanner;


public class GroceryLinkedListNode<T> extends Inventory<T>
{
	/**
	 * One node for the Linked List
	 * Used for GUI category search 
	 * @author yeotaJMU
	 */
	
	private String categoryName;
	private InventoryLLNode list;
	
	//constructor
	public GroceryLinkedListNode ()
	{
		super();
		categoryName = "";
		list = null;
	}
	
	//read categories from file
	public void readCategories (Scanner read)
	{
		setCategoryName(read.nextLine());
	}

	public String toString()
	{
		return ("Category: " + categoryName);
	}
	
	//getters and setters
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public InventoryLLNode getList() {
		return list;
	}

	public void setList(InventoryLLNode list) {
		this.list = list;
	}
}

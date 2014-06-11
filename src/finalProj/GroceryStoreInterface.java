package finalProj;
import java.util.LinkedList;


public interface GroceryStoreInterface <T>
{
	/**
	 * Interface for the Grocery Store
	 * Some classes linked within not included
	 * @author yeotaJMU
	 */
	public boolean adminAccess (String password) throws PasswordException;
	//checks password accuracy
	//throws exception if password is wrong
	
	public void fillInventory(TheGroceryStore g);
	//fills the binary tree inventory from file
	
	public GroceryBSTNode inventoryAdd (TheGroceryStore g);
	//add method to add a new item to inventory
	//returns added node
	
	public Inventory inventoryDelete (TheGroceryStore g, LinkedList<Inventory> deleter) throws ItemNotFoundException;
	//delete method to delete item from inventory
	//throws exception if item not found
	//returns deleted Inventory item
	
	public Inventory inventoryUpdate (TheGroceryStore g, LinkedList<Inventory> updater) throws ItemNotFoundException;
	//update method to update an item from inventory
	//throws exception if item not found
	//returns updated Inventory item
	
	public Inventory inventorySearch (TheGroceryStore g, String searchKey);
	//search method to serarch for item in inventory
	//item added if not found
	//returns searched Inventory item
	
	public LinkedList<Inventory> inventoryTraversal (TheGroceryStore g);
	//GUI friendly method to traverse inventory
	//returns ordered linked list to print to text area
	
	public int inventorySize (TheGroceryStore g);
	//method to get the size of the inventory
	//returns Int size
	
	public Inventory searchForItem (TheGroceryStore g, Inventory i, String key);
	//method used in GUI for purchasing item
	//returns searched Inventory item
	
	public LinkedList<String> printReceipts (TheGroceryStore g);
	//method used by GUI to print receipts to JTextArea
	//returns linked list of receipt
	
	public LinkedList<Inventory> inventoryLL (TheGroceryStore g);
	//method used by GUI to get the updated linked list from file
	//returns linked list of updated Inventory items	
	
}

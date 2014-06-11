package finalProj;
import java.util.LinkedList;
import java.util.Scanner;


public class GroceryLLNode <T>
{
	/**
	 * One node for the Grocery LL
	 * @author yeotaJMU
	 */
	protected LinkedList <Inventory> inventoryList = new LinkedList<Inventory> ();
	protected int numItemEntries;
	
	//constructor
	public GroceryLLNode ()
	{
		new Inventory();
	}
	
	//will read individual items into one linked list
	public void readFileForLL(Scanner read)
	{
		Scanner scanFile = TextFileIO.createTextRead("inventory.txt");
		while (scanFile.hasNextLine())
		{
			Inventory i = new Inventory();
			i.readItem(scanFile);
			inventoryList.add(i);	
		}
	}

	
	//getters and setters
	public LinkedList<Inventory> getInventoryList() {
		return inventoryList;
	}

	public void setInventoryList(LinkedList<Inventory> inventoryList) {
		this.inventoryList = inventoryList;
	}

	public int getNumItemEntries() {
		return numItemEntries;
	}

	public void setNumItemEntries(int numItemEntries) {
		this.numItemEntries = numItemEntries;
	}
	
}

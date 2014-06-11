package finalProj;
import java.util.LinkedList;
import java.util.Scanner;


public class GroceryLinkedList<T> extends GroceryLinkedListNode<T>
{
	/**
	 * Creates a doubly linked list of categories and inventory items
	 * @author yeotaJMU
	 */
	
	private LinkedList<GroceryLinkedListNode> groceries = new LinkedList<GroceryLinkedListNode>();
	private static LinkedList<InventoryLLNode> forConsole = new LinkedList<InventoryLLNode>();
	
	//constructor
	public GroceryLinkedList ()
	{
		super();
	}
	
	//fill the first linked list with categories
	public void fillLinkedList (TheGroceryStore g, GroceryLinkedList ll)
	{
		groceries.clear();
		Scanner scanFile = TextFileIO.createTextRead("categories.txt");
		while (scanFile.hasNextLine())
		{
			GroceryLinkedListNode gLL = new GroceryLinkedListNode();
			gLL.readCategories(scanFile);
			groceries.add(gLL);
		}
		for (InventoryLLNode i :inventoryForLL(g))
		{
			//find the matching category
			//check to see if listnode is empty
			//if not use recursive method to find null next and add 
			switch (i.getCategory().toLowerCase())
			{
			case "fruits":
				if (groceries.get(0).getList() == null)
				{
					groceries.get(0).setList(i);
				}
				else
				{
					findNextNode(groceries.get(0).getList(), i);
				}
				break;
			case "vegetables":
				if (groceries.get(1).getList() == null)
				{
					groceries.get(1).setList(i);
				}
				else
				{
					findNextNode(groceries.get(1).getList(), i);
				}
				break;
			case "proteins":
				if (groceries.get(2).getList() == null)
				{
					groceries.get(2).setList(i);
				}
				else
				{
					findNextNode(groceries.get(2).getList(), i);
				}
				break;
			case "snacks":
				if (groceries.get(3).getList() == null)
				{
					groceries.get(3).setList(i);
				}
				else
				{
					findNextNode(groceries.get(3).getList(), i);
				}
				break;
			case "drinks":
				if (groceries.get(4).getList() == null)
				{
					groceries.get(4).setList(i);
				}
				else
				{
					findNextNode(groceries.get(4).getList(), i);
				}
				break;
			default:
				throw new ItemNotFoundException("Item Not Found");
			}
		}
	}
	
	//get the inventory from file
	private static LinkedList<InventoryLLNode> inventoryForLL (TheGroceryStore g)
	{
		LinkedList<InventoryLLNode> inventory = new LinkedList<InventoryLLNode>();
		Scanner scanFile = TextFileIO.createTextRead("inventory.txt");
		while (scanFile.hasNextLine())
		{
			InventoryLLNode i = new InventoryLLNode();
			i.readItem(scanFile);
			inventory.add(i);
		}
		return inventory;
	}
	
	//helper for finding the next node to add to the list
	private static InventoryLLNode findNextNode (InventoryLLNode next, InventoryLLNode toAdd)
	{
		if (next.getNext() == null)
		{
			next.setNext(toAdd);
			return next;
		}
		else
			return findNextNode(next.getNext(), toAdd);
	}

	//print the LL
	public LinkedList<InventoryLLNode> printTheLL (TheGroceryStore g, GroceryLinkedList ll, String search)
	{
		for (GroceryLinkedListNode gLLN: groceries)
		{
			if (gLLN.getCategoryName().equalsIgnoreCase(search))
			{
				printTheList(gLLN.getList());
			}
		}
		return forConsole;
	}
	
	private static LinkedList<InventoryLLNode> printTheList(InventoryLLNode iLL)
	{
		if (iLL == null)
		{
			return forConsole;
		}
		else
		{
			forConsole.add(iLL);
			return printTheList(iLL.getNext());//recursive call to print out
		}
	}
	
	//getters and setters
	public LinkedList<GroceryLinkedListNode> getGroceries() {
		return groceries;
	}

	public void setGroceries(LinkedList<GroceryLinkedListNode> groceries) {
		this.groceries = groceries;
	}

	public static LinkedList<InventoryLLNode> getForConsole() {
		return forConsole;
	}

	public static void setForConsole(LinkedList<InventoryLLNode> forConsole) {
		GroceryLinkedList.forConsole = forConsole;
	}
}

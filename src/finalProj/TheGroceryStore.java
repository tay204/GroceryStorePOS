package finalProj;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class TheGroceryStore<T> extends GroceryBST<T> implements GroceryStoreInterface<T>
{
	/**
	 * Implements the Grocery Interface
	 * Handles methods for use of the GUI
	 * @author yeotaJMU
	 */
	public TheGroceryStore()
	{
		super();
	}
	
	@Override
	//for use of admin button
	public boolean adminAccess (String password)
	{
		Scanner scanFile = TextFileIO.createTextRead("adminpw.txt");
		String pw = scanFile.nextLine();
		if (pw.equalsIgnoreCase(password))
		{
			return true;
		}
		else
			throw new PasswordException("Wrong Password!");
	}
	
	@Override
	//fill the inventory into the BST upon start of purchase
	public synchronized void fillInventory(TheGroceryStore g)
	{
		Scanner scanFile = TextFileIO.createTextRead("inventory.txt");
		while (scanFile.hasNextLine())
		{
			GroceryBSTNode gn = new GroceryBSTNode();
			gn.readItem(scanFile);
			gn.setKey(gn.getFoodName());//set the key, used for other methods
			g.add(gn);		
		}
	}
	
	@Override
	//add method for GUI
	public GroceryBSTNode inventoryAdd (TheGroceryStore g)
	{
		String [] options = {"Fruits", "Vegetables", "Proteins", "Snacks", "Drinks"};
		String catChoice = (String) JOptionPane.showInputDialog(null, "Choose a Category for the New Item",
		        "Category Options", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		String key = JOptionPane.showInputDialog("Enter a Name for the Item:");
		double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the Price for " + key + ":"));
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity of " + key + ":"));
		String description = JOptionPane.showInputDialog("Enter a Description for " + key  + ":");
		GroceryBSTNode gn = new GroceryBSTNode(key, null, null);
		gn.setCategory(catChoice);
		gn.setFoodName(key);
		gn.setPrice(price);
		gn.setQuantity(quantity);
		gn.setDescription(description);
		g.add(gn);
		append(g,gn);//reference to helper method
		return gn;
	}

	@Override
	//delete method for GUI
	public Inventory inventoryDelete (TheGroceryStore g, LinkedList<Inventory> deleter)
	{
		String name = JOptionPane.showInputDialog("Enter the name of the item to remove:");
		int index = 0;
		boolean match = false;
		for (Inventory i : deleter)
		{
			if (name.equalsIgnoreCase(i.getFoodName()))//find appropriate item to delete
			{
				int a = JOptionPane.showConfirmDialog(null, "This will permanently delete item " + name.toUpperCase() + ". Continue?");
				if (a == 0)
				{
					deleter.remove(index);
					match = true;
					rewriteUpdate(deleter);
					return i;
				}
				if (a != 0)
				{
					JOptionPane.showMessageDialog(null, "Delete Cancelled!");
					match = true;
					return null;
				}
			}
			index++;
		}
		if (match == false)
		{
			throw new ItemNotFoundException("Item not found in inventory.");
		}
		return null;
	}

	@Override
	//update method for GUI
	public Inventory inventoryUpdate (TheGroceryStore g, LinkedList<Inventory> updater)
	{
		String update = JOptionPane.showInputDialog("Enter the name of the item you wish to update:");
		boolean match = false;
		for (Inventory i: updater)
		{
			if (update.equalsIgnoreCase(i.getFoodName()))
			{
				String [] options = {"Name", "Price", "Quantity", "Description"};
				String changeChoice = (String) JOptionPane.showInputDialog(null, "Choose a Category to Update",
				        "Category Options", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				switch (changeChoice.toLowerCase())//category to change
				{
				case "name":
					String newName = JOptionPane.showInputDialog("Enter the new name:");
					i.setFoodName(newName);
					rewriteUpdate(updater);
					return i;
				case "price":
					double newPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the new price:"));
					i.setPrice(newPrice);
					rewriteUpdate(updater);
					return i;
				case "quantity":
					int newQuant = Integer.parseInt(JOptionPane.showInputDialog("Enter the new quantity:"));
					i.setQuantity(newQuant);
					rewriteUpdate(updater);
					return i;
				case "description":
					String newDes = JOptionPane.showInputDialog("Enter a new description:");
					i.setDescription(newDes);
					rewriteUpdate(updater);
					return i;
				default:
					new ItemNotFoundException("Information category does not exist.");
				}
				match = true;
				break;
			}
		}
		if (match == false)//to catch if not found
		{
			throw new ItemNotFoundException("Item not found in inventory.");
		}
		return null;
	}
	
	//helper method to change file after admin changes from GUI
	private static void rewriteUpdate (LinkedList<Inventory> update)
	{
		PrintWriter rewrite = TextFileIO.createTextWrite("inventory.txt");
		for (Inventory in: update)
		{
			in.writeFile(rewrite);
		}
		rewrite.close();
	}
	
	@Override
	//search method for GUI
	public Inventory inventorySearch (TheGroceryStore g, String searchKey)
	{
		if (g.search(searchKey) == null)
		{
			//if item is not found, prompt to add
			GroceryBSTNode gn = new GroceryBSTNode(searchKey, null, null);
			String [] options = {"Fruits", "Vegetables", "Proteins", "Snacks", "Drinks"};
			String catChoice = (String) JOptionPane.showInputDialog(null, searchKey + " not found.\n" +
					"Select a Category to Add " + searchKey + " to.","Category Options", JOptionPane.QUESTION_MESSAGE, 
					null, options, options[0]);
			gn.setCategory(catChoice);
			gn.setFoodName(searchKey);
			double newPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Price for "+ searchKey + ":"));
			gn.setPrice(newPrice);
			int newQuan = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity for " + searchKey + ":"));
			gn.setQuantity(newQuan);
			String des = JOptionPane.showInputDialog("Enter the Description for " + searchKey +":");
			gn.setDescription(des);
			append(g, gn);//add new item to file
			return gn;
		}
		else 
			return g.search(searchKey);
	}

	@Override
	//traverse for GUI
	public LinkedList<Inventory> inventoryTraversal (TheGroceryStore g)
	{
		GroceryBSTNode r = g.getRoot();//start from root
		return g.inOrderTraversal(r);
	}

	@Override
	//size for GUI
	public int inventorySize (TheGroceryStore g)
	{
		g.setCount(0);
		GroceryBSTNode r = g.getRoot();//start from root
		return g.size(r);
	}

	@Override
	//use for GUI and purchases
	public Inventory searchForItem (TheGroceryStore g, Inventory i, String key)
	{
		if (g.getRoot().getFoodName().equalsIgnoreCase(key))
		{
			i.setCategory(getRoot().getCategory());
			i.setFoodName(getRoot().getFoodName());
			i.setPrice(getRoot().getPrice());
			i.setQuantity(getRoot().getQuantity());
			i.setDescription(getRoot().getDescription());
			return i;
		}
		else
			return itemToPurchase(g.getRoot(),i, key);
	}
	
	//helper method for inventory search for item
	private static Inventory itemToPurchase (GroceryBSTNode gn, Inventory i, String key)
	{
		if (gn == null)
			throw new ItemNotFoundException("Item not Found!");
		if (gn.getFoodName().equalsIgnoreCase(key))
		{
			i.setCategory(gn.getCategory());
			i.setFoodName(gn.getFoodName());
			i.setPrice(gn.getPrice());
			i.setQuantity(gn.getQuantity());
			i.setDescription(gn.getDescription());
			return i;
		}
		else if (key.compareTo(gn.getFoodName()) < 0)
		{
			return itemToPurchase(gn.getLeft(), i, key);//recursive method to start search with linked node
		}
		else
		{
			return itemToPurchase(gn.getRight(), i, key);//recursive method to start search with linked node
		}
	}
	
	@Override
	//print receipt from the file
	public LinkedList<String> printReceipts (TheGroceryStore g)
	{
		LinkedList<String> sales = new LinkedList<String>();
		Scanner scanFile = TextFileIO.createTextRead("dailySales.txt");
		while (scanFile.hasNextLine())
		{
			String oneLine = scanFile.nextLine();
			sales.add(oneLine);
		}
		return sales;
	}
	
	@Override
	//update the inventory from file 
	public LinkedList<Inventory> inventoryLL (TheGroceryStore g)
	{
		LinkedList<Inventory> updated = new LinkedList<Inventory>();
		updated.clear();
		Scanner scanFile = TextFileIO.createTextRead("inventory.txt");
		while (scanFile.hasNextLine())
		{
			Inventory i = new Inventory();
			i.readItem(scanFile);
			updated.add(i);
		}
		return updated;
	}
	
	//static helper append method to append to file
	private static void append(TheGroceryStore g, GroceryBSTNode gn)
	{
		try {
			PrintWriter outStream = new PrintWriter(new FileWriter("inventory.txt", true));
			outStream.println(gn.getCategory());
			outStream.println(gn.getFoodName());
			outStream.println(gn.getPrice());
			outStream.println(gn.getQuantity());
			outStream.println(gn.getDescription());
			outStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package finalProj;
import java.util.LinkedList;

public class GroceryBST <T> extends GroceryBSTNode <T>
{
	/**
	 * Handles the BST for the Grocery store
	 * @author yeotaJMU
	 */
	
	protected GroceryBSTNode<T> root;
	private int count = 0;
	private static LinkedList<Inventory> traversed = new LinkedList<Inventory>();
	
	//constructor
	public GroceryBST ()
	{
		root = null;
	}
	
	//@Override
	//add a node to the BST
	public void add(GroceryBSTNode<T> key) throws BSTDuplicateException 
	{
		if (root == null)
		{
			root = key;//if empty, key is root
		}
		else 
			add(root, key);
	}
		
	//static helping method for adding nodes
	//bring in root, then recursively call
	private static void add(GroceryBSTNode gn, GroceryBSTNode key) throws BSTDuplicateException
	{
		if (gn.getFoodName().equalsIgnoreCase(key.getFoodName()))
		{
			throw new BSTDuplicateException ("Cannot add duplicate item!");
		}
		if (key.getFoodName().compareTo(gn.getFoodName()) < 0)//decide whether left or right
		{
			if (gn.getLeft() == null)//if null, key becomes the leaf
			{
				gn.setLeft(key);
			}
			else//otherwise recursive call with new node
				add(gn.getLeft(), key);
		}
		else
		{
			if (gn.getRight() == null)//if null, key becomes leaf
			{
				gn.setRight(key);
			}
			else//otherwise recursive call with new node
				add(gn.getRight(), key);
		}
	}

	//@Override
	//check if BST is empty
	public boolean isEmpty() 
	{
		if (root == null)
			return true;
		else
			return false;
	}

	//@Override
	//search method
	public GroceryBSTNode search (String key)
	{
		if (root == null)//if empty
			return null;
		else
			return search(root, key);
	}
	//recursive searching method
	private GroceryBSTNode search(GroceryBSTNode gn, String key) 
	{
		if (gn == null)//item not found
		{
			return null;
		}
		if (gn.getFoodName().equalsIgnoreCase(key))
		{
			return gn;
		}
		else if (key.compareTo(gn.getFoodName()) < 0)
		{
			return search(gn.getLeft(), key);//recursive method to start search with linked node
		}
		else
		{
			return search (gn.getRight(), key);//recursive method to start search with linked node
		}
	}
	
	//@Override
	//method for in-order Traversal
    public LinkedList<Inventory> inOrderTraversal(GroceryBSTNode gn)
    {
        if(gn != null)
        {
            inOrderTraversal(gn.getLeft());//get the left as far as it isn't null
            traversed.add(gn);
            inOrderTraversal(gn.getRight());//get the right as far as it isn't null
        }
        return traversed;
    }

	//@Override
	//method to get BST size
	//basically the same as a traversal
	public int size(GroceryBSTNode gn) 
	{
		if(gn != null)
        {
            size(gn.getLeft());
            size(gn.getRight());
            count++;
        }
		return count;
	}

	
	//getters and setters
	public GroceryBSTNode<T> getRoot() {
		return root;
	}

	public void setRoot(GroceryBSTNode<T> root) {
		this.root = root;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}

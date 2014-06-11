package finalProj;

public class GroceryBSTNode <T> extends Inventory <T>
{
	/**
	 * One node for the BST
	 * @author yeotaJMU
	 */
	private String key;
	private GroceryBSTNode<T> left, right;
	
	//base constructor
	public GroceryBSTNode ()
	{
		super();
		key = null;
		left = null;
		right = null;
	}
	
	//second constructor to use with adding nodes to BST
	public GroceryBSTNode (String k, GroceryBSTNode<T> l, GroceryBSTNode<T> r)
	{
		super();
		key = k;
		left = l;
		right = r;
	}

	
	//getters and setters
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public GroceryBSTNode getLeft() {
		return left;
	}

	public void setLeft(GroceryBSTNode left) {
		this.left = left;
	}

	public GroceryBSTNode getRight() {
		return right;
	}

	public void setRight(GroceryBSTNode right) {
		this.right = right;
	}

	
}

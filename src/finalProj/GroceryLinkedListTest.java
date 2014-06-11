package finalProj;

import static org.junit.Assert.*;

import org.junit.Test;

public class GroceryLinkedListTest {

	GroceryLinkedList g = new GroceryLinkedList();
	TheGroceryStore t = new TheGroceryStore();
	@Test
	public void test() 
	{
		g.fillLinkedList(t, g);
		g.printTheLL(t, g, "Drinks");
	}

}

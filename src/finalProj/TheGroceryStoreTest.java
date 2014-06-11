package finalProj;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheGroceryStoreTest {

	TheGroceryStore t = new TheGroceryStore();
	@Test
	public void test() {
		t.fillInventory(t);
		t.inOrderTraversal(t.getRoot());
		t.inventorySearch(t, "Beer");
		t.size(t.getRoot());
		
	}

}

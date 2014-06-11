package finalProj;

import static org.junit.Assert.*;

import org.junit.Test;

public class GroceryBSTTest {

	GroceryBST g = new GroceryBST();
	@Test
	public void test() {
		g.setCategory("Fruits");
		g.setFoodName("Peach");
		g.setPrice(1);
		g.setQuantity(10);
		g.setDescription("1 Peach");
		
		g.add(g);
	}

}

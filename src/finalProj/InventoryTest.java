package finalProj;
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;



public class InventoryTest {

	Inventory testI = new Inventory();
	Scanner read = TextFileIO.createTextRead("inventory.txt");
	@Test
	public void test() {
		testI.readItem(read);
		
		testI.toString();
	}

}

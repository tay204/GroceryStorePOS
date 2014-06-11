package finalProj;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Inventory <T>
{
	/**
	 * Defines one Inventory Item
	 * @author yeotaJMU
	 */
	
	private String category;
	private String foodName;
	private double price;
	private int quantity;
	private String description;
	
	DecimalFormat m = new DecimalFormat("##.00");//for money
	
	//constructor
	public Inventory ()
	{
		category = "";
		foodName = "";
		price = 0.0;
		quantity = 0;
		description = "";
	}
	
	//read an item from binary file
	public void readItem (Scanner read)
	{
		category = read.nextLine();
		foodName = read.nextLine();
		price = read.nextDouble();
		read.nextLine();
		quantity = read.nextInt();
		read.nextLine();
		description = read.nextLine();
	}
	
	//write to the file
	public void writeFile (PrintWriter textStream)
	{
		textStream.println(getCategory());
		textStream.println(getFoodName());
		textStream.println(getPrice());
		textStream.println(getQuantity());
		textStream.println(getDescription());
	}

	//to string method
	public String toString()
	{
		return ("Name: " + foodName +
				"\nPrice: $" + m.format(price) +
				"\nQuantity: " + quantity +
				"\nDescription: " + description +
				"\n");
				
	}
	
	//getters and setters
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String name) {
		this.foodName = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}

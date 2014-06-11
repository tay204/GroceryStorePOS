package finalProj;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


public class Purchase 
{
	/**
	 * Handles purchases and money for the Grocery Store
	 * Will write daily receipts to file
	 * @author yeotaJMU
	 */
	
	private double moneyPaid, change;
	private double subTotal;
	private static int salesCount;
	private ArrayList<Inventory> shoppingCart = new ArrayList<Inventory>();
	private static ArrayList<Inventory> prePurchase = new ArrayList<Inventory>();//array list of items pre-purchase
	private ArrayList<Double> compSubTotal = new ArrayList<Double>();
	
	//constructor
	public Purchase()
	{
		moneyPaid = 0;
		change = 0;
		subTotal = 0;
		salesCount = 0;
	}
	
	//computes subTotal as purchase is made
	//items added to cart during purchase
	//will get updated as items are added
	public double computeSubTotal (TheGroceryStore g, Purchase p, Inventory i, int quantity)
	{
		subTotal = 0;
		double prices = i.getPrice() * quantity;//get price of chosen item
		compSubTotal.add(prices);
		for (Double d: compSubTotal)
		{
			subTotal = subTotal + d;
		}
		return subTotal;
	}
	
	//compute the amount of change returned
	public double computeChange (Double m, double st, Purchase p)
	{
		moneyPaid = m;
		
		if (moneyPaid < 0)
		{
			throw new MoneyException("Can't enter negative money!");
		}
		if (moneyPaid < st)
		{
			throw new MoneyException("Not enough money!");
		}
		change = moneyPaid - st;
		return change;
	}
	
	//purchase 1 item
	public void addItemToCart(TheGroceryStore g, Inventory i, Purchase p, int quantity)
	{
		shoppingCart.add(i);
		int updateQuan = i.getQuantity() - quantity;
		i.setQuantity(updateQuan);
	}
	
	//finish checkout process
	public void checkout (TheGroceryStore g, Purchase p, String receipt)
	{
		purchaseFileUpdate(g,p);
		//dailySales(g, p, receipt);
		p.getShoppingCart().clear();
		p.getPrePurchase().clear();
		p.getComputeSubTotal().clear();
		p.setChange(0);
		p.setMoneyPaid(0);
		p.setSubTotal(0);
		g.setRoot(null);
	}
	
	//update the file after purchases
	private static void purchaseFileUpdate(TheGroceryStore g, Purchase p)
	{
		quantityUpdate(g,p);//helper method which updates quantity
		for (Inventory cart: p.getShoppingCart())
		{
			for(Inventory pre: p.getPrePurchase())//compare cart items to total inventory
			{
				if(cart.getFoodName().equalsIgnoreCase(pre.getFoodName()))//change quantity of affected items
				{
					pre.setQuantity(cart.getQuantity());
				}
			}
		}
		PrintWriter outStream = TextFileIO.createTextWrite("inventory.txt");
		for (Inventory pre: p.getPrePurchase())
		{
			outStream.println(pre.getCategory());
			outStream.println(pre.getFoodName());
			outStream.println(pre.getPrice());
			outStream.println(pre.getQuantity());
			outStream.println(pre.getDescription());
		}
		outStream.close();
	}
	
	//helper to create list to modify
	private static ArrayList<Inventory> quantityUpdate(TheGroceryStore g, Purchase p)
	{
		Scanner read = TextFileIO.createTextRead("inventory.txt");
		while (read.hasNextLine())
		{
			Inventory i = new Inventory();
			i.readItem(read);
			prePurchase.add(i);
		}
		return prePurchase;
	}
	
	
	//getters and setters
	public double getMoneyPaid() {
		return moneyPaid;
	}
	public void setMoneyPaid(double moneyPaid) {
		this.moneyPaid = moneyPaid;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public ArrayList<Inventory> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ArrayList<Inventory> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public ArrayList<Inventory> getPrePurchase() {
		return prePurchase;
	}

	public void setPrePurchase(ArrayList<Inventory> prePurchase) {
		this.prePurchase = prePurchase;
	}

	public ArrayList<Double> getComputeSubTotal() {
		return compSubTotal;
	}

	public void setComputeSubTotal(ArrayList<Double> computeSubTotal) {
		this.compSubTotal = computeSubTotal;
	}

	public int getSalesCount() {
		return salesCount;
	}

	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
}

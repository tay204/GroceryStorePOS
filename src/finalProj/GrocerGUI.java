package finalProj;
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.LinkedList;

import javax.swing.*;


public class GrocerGUI extends JPanel
{
	/**
	 * GUI for Grocer
	 * @author yeotaJMU
	 */
	
	//intialize JPanel
	JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	JSplitPane adminPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	
	JPanel titlePanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JPanel buttonPanel1 = new JPanel();
	JPanel receiptPanel = new JPanel();
	JPanel subTotalPanel = new JPanel();
	JPanel startPanel = new JPanel();
	JPanel startButtonPanel = new JPanel();
	JPanel pwInput = new JPanel();
	JPanel bottomPanel = new JPanel();
	
	JPanel adminTitle = new JPanel();
	JPanel adminSearch = new JPanel();
	JPanel adminButton = new JPanel();
	JPanel adminButton1 = new JPanel();
	JPanel adminConsole = new JPanel();
	
	JScrollPane consoleScroll = new JScrollPane(adminConsole);
	
	//initialize JLabel
	JLabel titleLabel = new JLabel();
	JLabel startLabel = new JLabel();
	JLabel pwLabel = new JLabel();
	JLabel adminLabel = new JLabel();
	
	//get images for buttons
	ImageIcon banana = new ImageIcon("banana.jpg");
	ImageIcon apple = new ImageIcon("apple.jpg");
	ImageIcon orange = new ImageIcon("orange.jpg");
	ImageIcon pineapple = new ImageIcon("pineapple.jpg");
	ImageIcon grape = new ImageIcon("grape.jpg");
	ImageIcon coconut = new ImageIcon("coconut.jpg");
	
	ImageIcon greenbean = new ImageIcon("greenbean.jpg");
	ImageIcon carrot = new ImageIcon("carrot.jpg");
	ImageIcon onion = new ImageIcon("onion.jpg");
	ImageIcon asparagus = new ImageIcon("asparagus.jpg");
	ImageIcon potato = new ImageIcon("potato.jpg");
	ImageIcon corn = new ImageIcon("corn.jpg");
			
	ImageIcon chick = new ImageIcon("chicken.jpg");
	ImageIcon beef = new ImageIcon("steak.jpg");
	ImageIcon pig = new ImageIcon("pork.jpg");
	ImageIcon rack =  new ImageIcon("lamb.jpg");
	ImageIcon fish = new ImageIcon("fish.jpg");
	ImageIcon shrimp = new ImageIcon("shrimp.jpg");
	
	ImageIcon cracker = new ImageIcon("cracker.jpg");
	ImageIcon chip = new ImageIcon("chip.jpg");
	ImageIcon cookie = new ImageIcon("cookie.jpg");
	ImageIcon donut = new ImageIcon("donut.jpg");
	ImageIcon candy = new ImageIcon("candy.jpg");
	ImageIcon popsicle = new ImageIcon("popsicle.jpg");
	
	ImageIcon cocaCola = new ImageIcon("coke.jpg");
	ImageIcon pepsiCola =new ImageIcon("pepsi.jpg");
	ImageIcon gallon = new ImageIcon("milk.jpg");
	ImageIcon oj = new ImageIcon("juice.jpg");
	ImageIcon redWine = new ImageIcon("wine.jpg");
	ImageIcon cl = new ImageIcon("beer.jpg");
	
	ImageIcon fruit = new ImageIcon("fruit.jpg");
	ImageIcon veg = new ImageIcon("veg.jpg");
	ImageIcon protein = new ImageIcon("protein.jpg");
	ImageIcon snack = new ImageIcon("snack.jpg");
	ImageIcon drink = new ImageIcon("drink.jpg");
	
	
	//intialize JButtons
	JButton bananas = new JButton("Bananas", banana);
	JButton apples = new JButton("Apples", apple);
	JButton oranges = new JButton("Oranges", orange);
	JButton pineapples = new JButton("Pineapple", pineapple);
	JButton grapes = new JButton("Grapes", grape);
	JButton coconuts = new JButton("Coconuts", coconut);
	
	JButton greenbeans = new JButton("Green Beans", greenbean);
	JButton carrots = new JButton("Carrots", carrot);
	JButton onions = new JButton("Onions", onion);
	JButton asparagi = new JButton("Asparagus", asparagus);
	JButton potatoes = new JButton("Potatoes", potato);
	JButton corns = new JButton("Corn", corn);
	
	JButton chicken = new JButton("Chicken", chick);
	JButton steak = new JButton("Steak", beef);
	JButton pork = new JButton("Pork", pig);
	JButton lamb = new JButton("Lamb", rack);
	JButton salmon = new JButton("Salmon",fish);
	JButton shrimps = new JButton("Shrimp", shrimp);
	
	JButton crackers = new JButton("Crackers", cracker);
	JButton chips = new JButton("Chips", chip);
	JButton cookies = new JButton("Cookies", cookie);
	JButton donuts = new JButton("Donuts", donut);
	JButton candies = new JButton("Candy", candy);
	JButton popsicles = new JButton("Popsicles", popsicle);
	
	JButton coke = new JButton("Coke", cocaCola);
	JButton pepsi = new JButton("Pepsi", pepsiCola);
	JButton milk = new JButton("Milk", gallon);
	JButton juice = new JButton("Juice", oj);
	JButton wine = new JButton("Wine", redWine);
	JButton beer = new JButton("Beer", cl);
	
	JButton fruits = new JButton("Fruits", fruit);
	JButton veggies = new JButton("Vegetables", veg);
	JButton proteins = new JButton("Proteins", protein);
	JButton snacks = new JButton("Snacks", snack);
	JButton drinks = new JButton("Drinks", drink);
	
	JButton admin = new JButton(" Admin Access ");
	JButton purchase = new JButton( " Make Purchase ");
	
	JButton enterPw = new JButton(" Enter ");
	
	JButton finish = new JButton(" Finish & Pay ");
	JButton backToCat = new JButton(" Back to Categories ");
	JButton searchButton = new JButton(" Search ");
	
	JButton addItem = new JButton (" Add Item ");
	JButton updateItem = new JButton (" Update Item ");
	JButton deleteItem = new JButton (" Delete Item ");
	JButton traverse = new JButton (" Traverse Inventory ");
	JButton invenSize = new JButton (" Inventory Size ");
	JButton printReceipts = new JButton (" Print Receipts ");
	JButton searchInventory = new JButton (" Search Inventory ");
	JButton searchCategories = new JButton (" Search Categories ");
	
	JTextArea receipt = new JTextArea(25,20);
	JTextArea subTotal = new JTextArea(5, 13);
	JTextArea console = new JTextArea(35, 20);
	
	JTextField qty1 = new JTextField(11);
	JTextField qty2 = new JTextField(11);
	JTextField qty3 = new JTextField(11);
	JTextField qty4 = new JTextField(11);
	JTextField qty5 = new JTextField(11);
	JTextField qty6 = new JTextField(11);
	JTextField password = new JTextField(15);
	JTextField search = new JTextField(15);
	
	JTextField adminSearchIn  = new JTextField(15);
	JTextField adminSearchCat = new JTextField(15);
	
	public GrocerGUI ()
	{
		//multiple split panes for layout
		
		JSplitPane splitPaneButtons = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		JSplitPane splitPaneReceipt = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		JSplitPane adminButtonPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		splitPaneButtons.setDividerLocation(250);
		adminButtonPane.setDividerLocation(250);
		//splitPaneReceipt.setDividerLocation(515);
		splitPane.setDividerLocation(428);
		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		adminTitle.setLayout(new FlowLayout(FlowLayout.CENTER));
		startPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		adminButton.setLayout(new FlowLayout(FlowLayout.CENTER));
		adminButton1.setLayout(new FlowLayout(FlowLayout.CENTER));
		console.setLayout(new FlowLayout(FlowLayout.LEFT));
		receiptPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		subTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		buttonPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		startButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		pwInput.setLayout(new FlowLayout(FlowLayout.CENTER));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		//set components of split panes
		splitPane.setLeftComponent(splitPaneButtons);
		splitPane.setRightComponent(splitPaneReceipt);
		adminPane.setLeftComponent(adminButtonPane);
		adminPane.setRightComponent(consoleScroll);
		splitPaneReceipt.setTopComponent(receiptPanel);
		splitPaneReceipt.setBottomComponent(subTotalPanel);
		splitPaneButtons.setTopComponent(buttonPanel);
		splitPaneButtons.setBottomComponent(buttonPanel1);
		adminButtonPane.setTopComponent(adminButton);
		adminButtonPane.setBottomComponent(adminButton1);
		
		//set font for title label
		Font quizBigFont = new Font("Helvetica Bold", Font.BOLD, 30);
		Font quizMedFont = new Font("Helvetica Bold", Font.BOLD, 20);
		Font quizSmallFont = new Font("Helvetica Bold", Font.BOLD, 15);
		titleLabel.setFont(quizBigFont);
		adminLabel.setFont(quizBigFont);
		startLabel.setFont(quizMedFont);
		pwLabel.setFont(quizMedFont);
		subTotal.setFont(quizMedFont);
		password.setFont(quizMedFont);
		
		titleLabel.setText("Grocery Purchase");
		adminLabel.setText("Administrator Interface");
		startLabel.setText("<html>Select Admin for Administrative Access,<br>" +
				"or select \"Make a Purchase\" to begin a purchase.<html>");
		pwLabel.setText("Enter Access Code:");
		
		//add text to buttons
		bananas.setVerticalTextPosition(JButton.BOTTOM);
		bananas.setHorizontalTextPosition(SwingConstants.CENTER);
		apples.setVerticalTextPosition(JButton.BOTTOM);
		apples.setHorizontalTextPosition(SwingConstants.CENTER);
		grapes.setVerticalTextPosition(JButton.BOTTOM);
		grapes.setHorizontalTextPosition(SwingConstants.CENTER);
		coconuts.setVerticalTextPosition(JButton.BOTTOM);
		coconuts.setHorizontalTextPosition(SwingConstants.CENTER);
		oranges.setVerticalTextPosition(JButton.BOTTOM);
		oranges.setHorizontalTextPosition(SwingConstants.CENTER);
		pineapples.setVerticalTextPosition(JButton.BOTTOM);
		pineapples.setHorizontalTextPosition(SwingConstants.CENTER);
		
		greenbeans.setVerticalTextPosition(JButton.BOTTOM);
		greenbeans.setHorizontalTextPosition(SwingConstants.CENTER);
		carrots.setVerticalTextPosition(JButton.BOTTOM);
		carrots.setHorizontalTextPosition(SwingConstants.CENTER);
		onions.setVerticalTextPosition(JButton.BOTTOM);
		onions.setHorizontalTextPosition(SwingConstants.CENTER);
		asparagi.setVerticalTextPosition(JButton.BOTTOM);
		asparagi.setHorizontalTextPosition(SwingConstants.CENTER);
		potatoes.setVerticalTextPosition(JButton.BOTTOM);
		potatoes.setHorizontalTextPosition(SwingConstants.CENTER);
		corns.setVerticalTextPosition(JButton.BOTTOM);
		corns.setHorizontalTextPosition(SwingConstants.CENTER);
		
		chicken.setVerticalTextPosition(JButton.BOTTOM);
		chicken.setHorizontalTextPosition(SwingConstants.CENTER);
		steak.setVerticalTextPosition(JButton.BOTTOM);
		steak.setHorizontalTextPosition(SwingConstants.CENTER);
		pork.setVerticalTextPosition(JButton.BOTTOM);
		pork.setHorizontalTextPosition(SwingConstants.CENTER);
		lamb.setVerticalTextPosition(JButton.BOTTOM);
		lamb.setHorizontalTextPosition(SwingConstants.CENTER);
		salmon.setVerticalTextPosition(JButton.BOTTOM);
		salmon.setHorizontalTextPosition(SwingConstants.CENTER);
		shrimps.setVerticalTextPosition(JButton.BOTTOM);
		shrimps.setHorizontalTextPosition(SwingConstants.CENTER);
		
		crackers.setVerticalTextPosition(JButton.BOTTOM);
		crackers.setHorizontalTextPosition(SwingConstants.CENTER);
		chips.setVerticalTextPosition(JButton.BOTTOM);
		chips.setHorizontalTextPosition(SwingConstants.CENTER);
		cookies.setVerticalTextPosition(JButton.BOTTOM);
		cookies.setHorizontalTextPosition(SwingConstants.CENTER);
		donuts.setVerticalTextPosition(JButton.BOTTOM);
		donuts.setHorizontalTextPosition(SwingConstants.CENTER);
		candies.setVerticalTextPosition(JButton.BOTTOM);
		candies.setHorizontalTextPosition(SwingConstants.CENTER);
		popsicles.setVerticalTextPosition(JButton.BOTTOM);
		popsicles.setHorizontalTextPosition(SwingConstants.CENTER);
		
		coke.setVerticalTextPosition(JButton.BOTTOM);
		coke.setHorizontalTextPosition(SwingConstants.CENTER);
		pepsi.setVerticalTextPosition(JButton.BOTTOM);
		pepsi.setHorizontalTextPosition(SwingConstants.CENTER);
		milk.setVerticalTextPosition(JButton.BOTTOM);
		milk.setHorizontalTextPosition(SwingConstants.CENTER);
		juice.setVerticalTextPosition(JButton.BOTTOM);
		juice.setHorizontalTextPosition(SwingConstants.CENTER);
		wine.setVerticalTextPosition(JButton.BOTTOM);
		wine.setHorizontalTextPosition(SwingConstants.CENTER);
		beer.setVerticalTextPosition(JButton.BOTTOM);
		beer.setHorizontalTextPosition(SwingConstants.CENTER);
		
		fruits.setVerticalTextPosition(JButton.BOTTOM);
		fruits.setHorizontalTextPosition(SwingConstants.CENTER);
		veggies.setVerticalTextPosition(JButton.BOTTOM);
		veggies.setHorizontalTextPosition(SwingConstants.CENTER);
		proteins.setVerticalTextPosition(JButton.BOTTOM);
		proteins.setHorizontalTextPosition(SwingConstants.CENTER);
		snacks.setVerticalTextPosition(JButton.BOTTOM);
		snacks.setHorizontalTextPosition(SwingConstants.CENTER);
		drinks.setVerticalTextPosition(JButton.BOTTOM);
		drinks.setHorizontalTextPosition(SwingConstants.CENTER);
		
		admin.setBackground(Color.RED);
		purchase.setBackground(Color.GREEN);
		admin.setFont(quizMedFont);
		purchase.setFont(quizMedFont);
		admin.setPreferredSize(new Dimension(250, 150));
		purchase.setPreferredSize(new Dimension(250, 150));
		
		finish.setBackground(Color.GREEN);
		finish.setFont(quizMedFont);
		finish.setPreferredSize(new Dimension(200, 75));
		
		backToCat.setBackground(Color.RED);
		backToCat.setFont(quizSmallFont);
		backToCat.setPreferredSize(new Dimension(200, 75));
		
		addItem.setBackground(Color.GREEN);
		addItem.setFont(quizSmallFont);
		addItem.setPreferredSize(new Dimension(150, 100));
		deleteItem.setBackground(Color.RED);
		deleteItem.setFont(quizSmallFont);
		deleteItem.setPreferredSize(new Dimension(150, 100));
		updateItem.setBackground(Color.YELLOW);
		updateItem.setFont(quizSmallFont);
		updateItem.setPreferredSize(new Dimension(150, 100));
		traverse.setPreferredSize(new Dimension(150, 100));
		invenSize.setFont(quizSmallFont);
		invenSize.setPreferredSize(new Dimension(150, 100));
		printReceipts.setFont(quizSmallFont);
		printReceipts.setPreferredSize(new Dimension(150, 100));
		
		
		//set up textfields
		qty1.setHorizontalAlignment(JTextField.CENTER);
		qty1.setText("Enter Quantity");
		qty1.setFont(quizSmallFont);
		qty2.setHorizontalAlignment(JTextField.CENTER);
		qty2.setText("Enter Quantity");
		qty2.setFont(quizSmallFont);
		qty3.setHorizontalAlignment(JTextField.CENTER);
		qty3.setText("Enter Quantity");
		qty3.setFont(quizSmallFont);
		qty4.setHorizontalAlignment(JTextField.CENTER);
		qty4.setText("Enter Quantity");
		qty4.setFont(quizSmallFont);
		qty5.setHorizontalAlignment(JTextField.CENTER);
		qty5.setText("Enter Quantity");
		qty5.setFont(quizSmallFont);
		qty6.setHorizontalAlignment(JTextField.CENTER);
		qty6.setText("Enter Quantity");		
		qty6.setFont(quizSmallFont);
		
		search.setText("Search for an Item Here");
		search.setFont(quizSmallFont);
		
		adminSearchIn.setText("Search Inventory Here");
		adminSearchIn.setFont(quizSmallFont);
		adminSearchCat.setText("Search Categories Here");
		adminSearchCat.setFont(quizSmallFont);
		
		//initialize action listener
		bananas.addActionListener(new bananasButton());
		apples.addActionListener(new applesButton());
		grapes.addActionListener(new grapesButton());
		coconuts.addActionListener(new coconutsButton());
		oranges.addActionListener(new orangesButton());
		pineapples.addActionListener(new pineapplesButton());
		
		asparagi.addActionListener(new asparagiButton());
		carrots.addActionListener(new carrotsButton());
		greenbeans.addActionListener(new greenbeansButton());
		corns.addActionListener(new cornsButton());
		potatoes.addActionListener(new potatoesButton());
		onions.addActionListener(new onionsButton());
		
		chicken.addActionListener(new chickenButton());
		steak.addActionListener(new steakButton());
		pork.addActionListener(new porkButton());
		lamb.addActionListener(new lambButton());
		salmon.addActionListener(new salmonButton());
		shrimps.addActionListener(new shrimpsButton());
		
		crackers.addActionListener(new crackersButton());
		chips.addActionListener(new chipsButton());
		cookies.addActionListener(new cookiesButton());
		donuts.addActionListener(new donutsButton());
		candies.addActionListener(new candiesButton());
		popsicles.addActionListener(new popsiclesButton());
		
		coke.addActionListener(new cokeButton());
		pepsi.addActionListener(new pepsiButton());
		milk.addActionListener(new milkButton());
		juice.addActionListener(new juiceButton());
		wine.addActionListener(new wineButton());
		beer.addActionListener(new beerButton());
		
		fruits.addActionListener(new fruitsButton());
		veggies.addActionListener(new veggiesButton());
		proteins.addActionListener(new proteinsButton());
		snacks.addActionListener(new snacksButton());
		drinks.addActionListener(new drinksButton());
		
		
		admin.addActionListener(new adminButton());
		purchase.addActionListener(new purchaseButton());
		
		enterPw.addActionListener(new enterPwButton());
		
		finish.addActionListener(new finishButton());
		backToCat.addActionListener(new backToCatButton());
		searchButton.addActionListener(new searchButton());
		
		addItem.addActionListener(new addItemButton());
		traverse.addActionListener(new traverseButton());
		deleteItem.addActionListener(new deleteItemButton());
		updateItem.addActionListener(new updateItemButton());
		invenSize.addActionListener(new invenSizeButton());
		printReceipts.addActionListener(new printReceiptsButton());
		
		searchInventory.addActionListener(new searchInventoryButton());
		searchCategories.addActionListener(new searchCategoriesButton());
		
		//add to panels
		titlePanel.add(titleLabel);
		startPanel.add(startLabel);
		
		pwInput.add(pwLabel);
		pwInput.add(password);
		pwInput.add(enterPw);
		
		buttonPanel.add(bananas);
		buttonPanel.add(qty1);
		buttonPanel.add(apples);
		buttonPanel.add(qty2);
		buttonPanel.add(grapes);
		buttonPanel.add(qty3);
		buttonPanel1.add(oranges);
		buttonPanel1.add(qty4);
		buttonPanel1.add(pineapples);
		buttonPanel1.add(qty5);
		buttonPanel1.add(coconuts);
		buttonPanel1.add(qty6);
		
		buttonPanel.add(asparagi);
		buttonPanel.add(qty1);
		buttonPanel.add(carrots);
		buttonPanel.add(qty2);
		buttonPanel.add(greenbeans);
		buttonPanel.add(qty3);
		buttonPanel1.add(corns);
		buttonPanel1.add(qty4);
		buttonPanel1.add(potatoes);
		buttonPanel1.add(qty5);
		buttonPanel1.add(onions);
		buttonPanel1.add(qty6);
		
		buttonPanel.add(chicken);
		buttonPanel.add(qty1);
		buttonPanel.add(steak);
		buttonPanel.add(qty2);
		buttonPanel.add(pork);
		buttonPanel.add(qty3);
		buttonPanel1.add(lamb);
		buttonPanel1.add(qty4);
		buttonPanel1.add(salmon);
		buttonPanel1.add(qty5);
		buttonPanel1.add(shrimps);
		buttonPanel1.add(qty6);
		
		buttonPanel.add(crackers);
		buttonPanel.add(qty1);
		buttonPanel.add(chips);
		buttonPanel.add(qty2);
		buttonPanel.add(cookies);
		buttonPanel.add(qty3);
		buttonPanel1.add(donuts);
		buttonPanel1.add(qty4);
		buttonPanel1.add(candies);
		buttonPanel1.add(qty5);
		buttonPanel1.add(popsicles);
		buttonPanel1.add(qty6);
		
		buttonPanel.add(coke);
		buttonPanel.add(qty1);
		buttonPanel.add(pepsi);
		buttonPanel.add(qty2);
		buttonPanel.add(milk);
		buttonPanel.add(qty3);
		buttonPanel1.add(juice);
		buttonPanel1.add(qty4);
		buttonPanel1.add(wine);
		buttonPanel1.add(qty5);
		buttonPanel1.add(beer);
		buttonPanel1.add(qty6);
		
		buttonPanel.add(fruits);
		buttonPanel.add(qty1);
		buttonPanel.add(veggies);
		buttonPanel.add(qty2);
		buttonPanel.add(proteins);
		buttonPanel.add(qty3);
		buttonPanel1.add(snacks);
		buttonPanel1.add(qty4);
		buttonPanel1.add(drinks);
		buttonPanel1.add(qty5);
		buttonPanel1.add(qty6);
		
		startButtonPanel.add(admin);
		startButtonPanel.add(purchase);
		
		bottomPanel.add(searchButton);
		bottomPanel.add(search);
		bottomPanel.add(backToCat);
		bottomPanel.add(finish);
		
		adminButton.add(addItem);
		adminButton.add(deleteItem);
		adminButton.add(updateItem);
		adminButton1.add(traverse);
		adminButton1.add(invenSize);
		adminButton1.add(printReceipts);
		
		adminConsole.add(console);
		adminTitle.add(adminLabel);
		adminSearch.add(adminSearchIn);
		adminSearch.add(searchInventory);
		adminSearch.add(adminSearchCat);
		adminSearch.add(searchCategories);
		
		//default the purchase frame to non-visible
		//buttons become visible after category is pressed
		bananas.setVisible(false);
		apples.setVisible(false);
		grapes.setVisible(false);
		oranges.setVisible(false);
		pineapples.setVisible(false);
		coconuts.setVisible(false);
		
		asparagi.setVisible(false);
		carrots.setVisible(false);
		greenbeans.setVisible(false);
		corns.setVisible(false);
		potatoes.setVisible(false);
		onions.setVisible(false);
		
		chicken.setVisible(false);
		steak.setVisible(false);
		pork.setVisible(false);
		lamb.setVisible(false);
		salmon.setVisible(false);
		shrimps.setVisible(false);
		
		crackers.setVisible(false);
		chips.setVisible(false);
		cookies.setVisible(false);
		donuts.setVisible(false);
		candies.setVisible(false);
		popsicles.setVisible(false);
		
		coke.setVisible(false);
		pepsi.setVisible(false);
		milk.setVisible(false);
		juice.setVisible(false);
		wine.setVisible(false);
		beer.setVisible(false);
		
		qty1.setVisible(false);
		qty2.setVisible(false);
		qty3.setVisible(false);
		qty4.setVisible(false);
		qty5.setVisible(false);
		qty6.setVisible(false);
		
		fruits.setVisible(false);
		veggies.setVisible(false);
		proteins.setVisible(false);
		snacks.setVisible(false);
		drinks.setVisible(false);
		
		adminTitle.setVisible(false);
		adminPane.setVisible(false);
		adminSearch.setVisible(false);
		
		receiptPanel.add(receipt);
		subTotalPanel.add(subTotal);
		
		//add panels to frame
		add(titlePanel);
		add(adminTitle);
		add(splitPane);				
		add(adminPane);
		add(startPanel);
		add(startButtonPanel);
		add(pwInput);
		add(bottomPanel);
		add(adminSearch);
		
		//set panels to not visble by default
		bottomPanel.setVisible(false);
		splitPane.setVisible(false);
		pwInput.setVisible(false);
	}
	
	//control the display of the JFrame
	public void display()
	{ 
		JFrame theFrame = new JFrame("Grocer GUI");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setContentPane(this);
		theFrame.setPreferredSize(new Dimension(800, 800));
		theFrame.pack();
		theFrame.setVisible(true);
	}
	
	//One instance constructors to pass through methods
	TheGroceryStore t = new TheGroceryStore();
	Purchase p = new Purchase();
	DecimalFormat m = new DecimalFormat("##.00");
	
	//button classes
	//buttons that handle the changing of the panels
	class adminButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			startPanel.setVisible(false);
			startButtonPanel.setVisible(false);
			titlePanel.setVisible(false);
			adminTitle.setVisible(true);
			pwInput.setVisible(true);//set to enter password
		}
	}
	
	class enterPwButton implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			String pass =  password.getText();
			if (t.adminAccess(pass) == true)
			{
				pwInput.setVisible(false);
				titlePanel.setVisible(false);
				adminTitle.setVisible(true);
				adminPane.setVisible(true);
				adminSearch.setVisible(true);
			}
		}	
	}
	
	class purchaseButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t.fillInventory(t);
			startPanel.setVisible(false);
			startButtonPanel.setVisible(false);
			fruits.setVisible(true);
			veggies.setVisible(true);
			proteins.setVisible(true);
			snacks.setVisible(true);
			drinks.setVisible(true);
			splitPane.setVisible(true);
			bottomPanel.setVisible(true);
		}
	}
	
	class fruitsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			fruits.setVisible(false);
			veggies.setVisible(false);
			proteins.setVisible(false);
			snacks.setVisible(false);
			drinks.setVisible(false);
			
			bananas.setVisible(true);
			qty1.setVisible(true);
			apples.setVisible(true);
			qty2.setVisible(true);
			grapes.setVisible(true);
			qty3.setVisible(true);
			oranges.setVisible(true);
			qty4.setVisible(true);
			pineapples.setVisible(true);
			qty5.setVisible(true);
			coconuts.setVisible(true);
			qty6.setVisible(true);
		}
	}
	
	class veggiesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			fruits.setVisible(false);
			veggies.setVisible(false);
			proteins.setVisible(false);
			snacks.setVisible(false);
			drinks.setVisible(false);
			
			asparagi.setVisible(true);
			qty1.setVisible(true);
			carrots.setVisible(true);
			greenbeans.setVisible(true);
			corns.setVisible(true);
			potatoes.setVisible(true);
			onions.setVisible(true);
			
			qty2.setVisible(true);
			qty3.setVisible(true);
			qty4.setVisible(true);
			qty5.setVisible(true);
			qty6.setVisible(true);
		}
	}
	
	class proteinsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			fruits.setVisible(false);
			veggies.setVisible(false);
			proteins.setVisible(false);
			snacks.setVisible(false);
			drinks.setVisible(false);
			
			chicken.setVisible(true);
			qty1.setVisible(true);
			steak.setVisible(true);
			pork.setVisible(true);
			lamb.setVisible(true);
			salmon.setVisible(true);
			shrimps.setVisible(true);
		
			qty2.setVisible(true);
			qty3.setVisible(true);
			qty4.setVisible(true);
			qty5.setVisible(true);
			qty6.setVisible(true);
		}
	}
	
	class snacksButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			fruits.setVisible(false);
			veggies.setVisible(false);
			proteins.setVisible(false);
			snacks.setVisible(false);
			drinks.setVisible(false);
			
			crackers.setVisible(true);
			chips.setVisible(true);
			cookies.setVisible(true);
			donuts.setVisible(true);
			candies.setVisible(true);
			popsicles.setVisible(true);
			
			qty1.setVisible(true);
			qty2.setVisible(true);
			qty3.setVisible(true);
			qty4.setVisible(true);
			qty5.setVisible(true);
			qty6.setVisible(true);
		}
	}
	
	class drinksButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			fruits.setVisible(false);
			veggies.setVisible(false);
			proteins.setVisible(false);
			snacks.setVisible(false);
			drinks.setVisible(false);
			
			coke.setVisible(true);
			pepsi.setVisible(true);
			milk.setVisible(true);
			juice.setVisible(true);
			wine.setVisible(true);
			beer.setVisible(true);
			
			qty1.setVisible(true);
			qty2.setVisible(true);
			qty3.setVisible(true);
			qty4.setVisible(true);
			qty5.setVisible(true);
			qty6.setVisible(true);
		}
	}
		
	class backToCatButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			bananas.setVisible(false);
			apples.setVisible(false);
			grapes.setVisible(false);
			oranges.setVisible(false);
			pineapples.setVisible(false);
			coconuts.setVisible(false);
			
			asparagi.setVisible(false);
			carrots.setVisible(false);
			greenbeans.setVisible(false);
			corns.setVisible(false);
			potatoes.setVisible(false);
			onions.setVisible(false);
			
			chicken.setVisible(false);
			steak.setVisible(false);
			pork.setVisible(false);
			lamb.setVisible(false);
			salmon.setVisible(false);
			shrimps.setVisible(false);
			
			crackers.setVisible(false);
			chips.setVisible(false);
			cookies.setVisible(false);
			donuts.setVisible(false);
			candies.setVisible(false);
			popsicles.setVisible(false);
			
			coke.setVisible(false);
			pepsi.setVisible(false);
			milk.setVisible(false);
			juice.setVisible(false);
			wine.setVisible(false);
			beer.setVisible(false);
			
			qty1.setVisible(false);
			qty2.setVisible(false);
			qty3.setVisible(false);
			qty4.setVisible(false);
			qty5.setVisible(false);
			qty6.setVisible(false);
			
			fruits.setVisible(true);
			veggies.setVisible(true);
			proteins.setVisible(true);
			snacks.setVisible(true);
			drinks.setVisible(true);
		}
	}
	
	//buttons that are attached to food items
	class bananasButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty1.getText());
			i = t.searchForItem(t, i, "Bananas");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty1.setText("Enter Quantity");
		}
	}
	
	class applesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty2.getText());
			i = t.searchForItem(t, i, "Apples");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty2.setText("Enter Quantity");
		}
	}
	
	class grapesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty3.getText());
			i = t.searchForItem(t, i, "Grapes");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty3.setText("Enter Quantity");
		}
	}
	
	class orangesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty4.getText());
			i = t.searchForItem(t, i, "Oranges");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty4.setText("Enter Quantity");
		}
	}
	
	class pineapplesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty5.getText());
			i = t.searchForItem(t, i, "Pineapple");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty5.setText("Enter Quantity");
		}
	}
	
	class coconutsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty6.getText());
			i = t.searchForItem(t, i, "Coconuts");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty6.setText("Enter Quantity");
		}
	}
	
	class asparagiButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty1.getText());
			i = t.searchForItem(t, i, "Asparagus");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty1.setText("Enter Quantity");
		}
	}
	
	class carrotsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty2.getText());
			i = t.searchForItem(t, i, "Carrots");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty2.setText("Enter Quantity");
		}
	}
	
	class greenbeansButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty3.getText());
			i = t.searchForItem(t, i, "Green Beans");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty3.setText("Enter Quantity");
		}
	}
	
	class cornsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty4.getText());
			i = t.searchForItem(t, i, "Corn");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty4.setText("Enter Quantity");
		}
	}
	
	class potatoesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty5.getText());
			i = t.searchForItem(t, i, "Potatoes");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty5.setText("Enter Quantity");
		}
	}
	
	class onionsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty6.getText());
			i = t.searchForItem(t, i, "Onions");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty6.setText("Enter Quantity");
		}
	}
	
	class chickenButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty1.getText());
			i = t.searchForItem(t, i, "Chicken");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty1.setText("Enter Quantity");
		}
	}
	
	class steakButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty2.getText());
			i = t.searchForItem(t, i, "Steak");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty2.setText("Enter Quantity");
		}
	}
	
	class porkButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty3.getText());
			i = t.searchForItem(t, i, "Pork");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty3.setText("Enter Quantity");
		}
	}
	
	class lambButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty4.getText());
			i = t.searchForItem(t, i, "Lamb");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty4.setText("Enter Quantity");
		}
	}
	
	class salmonButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty5.getText());
			i = t.searchForItem(t, i, "Fish");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty5.setText("Enter Quantity");
		}
	}
	
	class shrimpsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty6.getText());
			i = t.searchForItem(t, i, "Shrimp");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty6.setText("Enter Quantity");
		}
	}
	
	class crackersButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty1.getText());
			i = t.searchForItem(t, i, "Crackers");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty1.setText("Enter Quantity");
		}
	}
	
	class chipsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty2.getText());
			i = t.searchForItem(t, i, "Chips");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty2.setText("Enter Quantity");
		}
	}
	
	class cookiesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty3.getText());
			i = t.searchForItem(t, i, "Cookies");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty3.setText("Enter Quantity");
		}
	}
	
	class donutsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty4.getText());
			i = t.searchForItem(t, i, "Donuts");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty4.setText("Enter Quantity");
		}
	}
	
	class candiesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty5.getText());
			i = t.searchForItem(t, i, "Candy");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty5.setText("Enter Quantity");
		}
	}
	
	class popsiclesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty6.getText());
			i = t.searchForItem(t, i, "Popsicles");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty6.setText("Enter Quantity");
		}
	}
	
	class cokeButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty1.getText());
			i = t.searchForItem(t, i, "Coke");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty1.setText("Enter Quantity");
		}
	}
	
	class pepsiButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty2.getText());
			i = t.searchForItem(t, i, "Pepsi");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty2.setText("Enter Quantity");
		}
	}
	
	class milkButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty3.getText());
			i = t.searchForItem(t, i, "Milk");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty3.setText("Enter Quantity");
		}
	}
	
	class juiceButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty4.getText());
			i = t.searchForItem(t, i, "Juice");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty4.setText("Enter Quantity");
		}
	}
	
	class wineButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty5.getText());
			i = t.searchForItem(t, i, "Wine");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty5.setText("Enter Quantity");
		}
	}
	
	class beerButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			int quan = Integer.parseInt(qty6.getText());
			i = t.searchForItem(t, i, "Beer");
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			qty6.setText("Enter Quantity");
		}
	}
	
	class searchButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			String searchItem = search.getText();
			i = t.searchForItem(t, i, searchItem);
			int quan = Integer.parseInt(JOptionPane.showInputDialog("You searched for:\n" + i.toString() + "\n" 
							+ "Enter Quantity to add to cart:"));
			receipt.append(quan + " x " + i.getFoodName() + " @ $" + m.format(i.getPrice()) + "\n");
			double sub = p.computeSubTotal(t, p, i, quan);
			p.addItemToCart(t, i, p, quan);
			subTotal.setText("SUBTOTAL: $" + m.format(sub));
			search.setText("Search for an Item Here");
		}
	}
	
	//button to handle the paying and finish
	//will return to home page
	class finishButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double sub = p.getSubTotal();
			String money = JOptionPane.showInputDialog("Subtotal is $" + m.format(sub) + ".\n"
					+ "Enter Money to Pay:");
			double payment = Double.parseDouble(money);
			double changeReceived = p.computeChange(payment, sub, p);
			String receiptFile = receipt.getText();
			p.checkout(t, p, receiptFile);
			
			//for console to simulate printing a receipt
			System.out.println("YOUR RECEIPT:");
			System.out.println(receipt.getText());
			System.out.println("SUBTOTAL: $" + m.format(sub));
			System.out.println("PAYMENT RECEIVED: $" + m.format(payment));
			System.out.println("CHANGE GIVEN: $" + m.format(changeReceived));
			
			//to write the receipt to the file using the JTextArea
			Calendar cal = Calendar.getInstance();
			try {
				PrintWriter outStream = new PrintWriter(new FileWriter("dailySales.txt", true));
				outStream.println("Sale at " + cal.getTime());
				receipt.write(outStream);
				outStream.println("SUBTOTAL: $" + m.format(sub));
				outStream.close();
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			
			//reset the panels to beginning
			receipt.setText(null);
			subTotal.setText(null);
			splitPane.setVisible(false);
			bottomPanel.setVisible(false);
			startPanel.setVisible(true);
			startButtonPanel.setVisible(true);		
			
			bananas.setVisible(false);
			apples.setVisible(false);
			grapes.setVisible(false);
			oranges.setVisible(false);
			pineapples.setVisible(false);
			coconuts.setVisible(false);
			
			asparagi.setVisible(false);
			carrots.setVisible(false);
			greenbeans.setVisible(false);
			corns.setVisible(false);
			potatoes.setVisible(false);
			onions.setVisible(false);
			
			chicken.setVisible(false);
			steak.setVisible(false);
			pork.setVisible(false);
			lamb.setVisible(false);
			salmon.setVisible(false);
			shrimps.setVisible(false);
			
			crackers.setVisible(false);
			chips.setVisible(false);
			cookies.setVisible(false);
			donuts.setVisible(false);
			candies.setVisible(false);
			popsicles.setVisible(false);
			
			coke.setVisible(false);
			pepsi.setVisible(false);
			milk.setVisible(false);
			juice.setVisible(false);
			wine.setVisible(false);
			beer.setVisible(false);
			
			qty1.setVisible(false);
			qty2.setVisible(false);
			qty3.setVisible(false);
			qty4.setVisible(false);
			qty5.setVisible(false);
			qty6.setVisible(false);
		}
	}
	
	//buttons for admin page
	class addItemButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t.setRoot(null);
			t.fillInventory(t);
			Inventory i = new Inventory();
			i = t.inventoryAdd(t);
			console.append("ITEM ADDED:\n"+ i.toString());
		}
	}
	
	class deleteItemButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			LinkedList<Inventory> inForDelete = new LinkedList<Inventory>();
			inForDelete = t.inventoryLL(t);
			i = t.inventoryDelete(t, inForDelete);
			console.append("ITEM DELETED:\n");
			console.append(i.toString());
		}
	}
	
	class updateItemButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Inventory i = new Inventory();
			LinkedList<Inventory> inForUpdate = new LinkedList<Inventory>();
			inForUpdate = t.inventoryLL(t);
			i = t.inventoryUpdate(t, inForUpdate);
			console.append("ITEM UPDATED:\n");
			console.append(i.toString());
		}
	}
	
	
	class traverseButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			LinkedList<Inventory> trav = new LinkedList<Inventory>();
			t.setRoot(null);
			t.fillInventory(t);
			trav = t.inventoryTraversal(t);
			console.append("TRAVERSING:\n");
			for(Inventory in: trav)//write to GUI
			{
				console.append(in.toString());
			}
		}
	}
	
	class invenSizeButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t.setRoot(null);
			t.fillInventory(t);
			int size = t.inventorySize(t);
			console.append("INVENTORY SIZE: " + size + "\n");
		}
	}
	
	class printReceiptsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			LinkedList<String> receipts = new LinkedList();
			receipts = t.printReceipts(t);
			console.append("SALES RECEIPTS:\n");
			for(String s: receipts)
			{
				console.append(s + "\n");
			}
		}
	}
	
	class searchInventoryButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t.setRoot(null);
			t.fillInventory(t);
			Inventory i = new Inventory();
			String searchItem = adminSearchIn.getText();
			i = t.inventorySearch(t, searchItem);
			adminSearchIn.setText("Search Inventory Here");
			console.append("YOUR ITEM:\n");
			console.append(i.toString());
		
		}
	}
	
	class searchCategoriesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			GroceryLinkedList gLL = new GroceryLinkedList();
			LinkedList<InventoryLLNode> iLL = new LinkedList<InventoryLLNode>();
			gLL.fillLinkedList(t, gLL);
			String search = adminSearchCat.getText();
			iLL = gLL.printTheLL(t, gLL, search);
			console.append("ITEMS FOUND IN " + search.toUpperCase() + ":\n");
			for(Inventory in: iLL)//write to GUI
			{
				console.append(in.toString());
			}
			adminSearchCat.setText("Search Categories Here");
		}
	}
	
}

public class InvetoryItems
{
	
	private String manufacturer, itemName, category, price;
	private int UPC;
	
	public InvetoryItems() //Default Constructor
	{
		manufacturer = "";
		itemName = "";
		category = "";
		UPC = 0;
		price = "";
	}
	
	public InvetoryItems(String man, String IN) //Constructor 1
	{
		manufacturer = man;
		itemName = IN;
		category = "UNDEFINED";
		price = "UNDEFINED";
		UPC = (int)(Math.random() * 100000000) + 1;
	}
	
	public InvetoryItems(String man, String IN, String cat, String p) //Constructor 2
	{
		manufacturer = man;
		itemName = IN;
		category = cat;
		price = p;
		UPC = (int)(Math.random() * 100000000) + 1;
	}
	
	public String toString() //toString
	{
		return "Manufacturer: " + manufacturer + "\nItem Name: " + itemName + "\nItem Category: " + category + "\nItem Price: " + price + "\nUPC#: " + UPC;
	}
	
}
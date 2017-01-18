public class InvetoryItems
{
	
	private String manufacturer, itemName, category;
	private int UPC, price;
	
	public InvetoryItems() //Default Constructor
	{
		manufacturer = "";
		itemName = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
	public InvetoryItems(String man, String IN) //Constructor 1
	{
		manufacturer = man;
		itemName = IN;
	}
}
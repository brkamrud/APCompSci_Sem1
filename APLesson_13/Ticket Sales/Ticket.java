public abstract class Ticket
{
	private int serialNo;
	
	public Ticket()
	{
		serialNo = (int)(Math.random() * ((9999999 - 1000000) + 1)) + 1000000;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + serialNo + "\nPrice: $" + getPrice();
	}
}
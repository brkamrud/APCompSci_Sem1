public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket advance = new Advance((int)(Math.random() * 20) + 1);
		Ticket studentAdvance = new StudentAdvance((int)(Math.random() * 20) + 1);
		Ticket walkup = new Walkup();
		
		System.out.println(advance.toString());
		System.out.println("\n" + studentAdvance.toString());
		System.out.println("\n" + walkup.toString());
	}
}
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	    Deck d = new Deck(ranks, suits, values);
		
		System.out.println(d);
		d.shuffle();
		System.out.println(d);
	    
	    // String[] rank2 = {"10", "Queen", "King"};
	    // String[] suit2 = {"Clubs", "Spades", "Diamonds"};
	    // int[] value2 = {10, 12, 13};
	    // Deck deck2 = new Deck(rank2, suit2, value2);
	    // System.out.println("Deck2 should not be empty: " + !deck2.isEmpty());
	    
	    // String[] rank3 = {"1", "3", "Queen"};
	    // String[] suit3 = {"Diamonds", "Spades", "Hearts"};
	    // int[] value3 = {1, 3, 12};
	    // Deck deck3 = new Deck(rank3, suit3, value3);
	    // System.out.println("Deck3 dealt card is: " + deck3.deal());
	   
	}
}

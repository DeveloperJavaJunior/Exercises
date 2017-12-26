
public class DeckOfCard {

	public static void main(String[] args) {
		
		int[] deck = new int[52];
		
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// Initialize the cards
		for(int i = 0; i < deck.length; i++){
			deck[i] = i;
			
			
		}
		// Shuffle the cards
		for(int i = 0; i < deck.length; i++){
			// Generate an index randomly
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		// Display the first four cards
		for(int i = 0; i < 4; i++){
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			
			System.out.println("Card number " + deck[i] + ": " +  rank + " of " + suit);
			
		}

	}

}
/**

Card number 6: 7 of Spades
Card number 48: 10 of Clubs
Card number 11: Queen of Spades
Card number 24: Queen of Hearts

if (deck[i] / 13 == 0)
System.out.print("suit is Spades");
else if (deck[i] / 13 == 1)
System.out.print("suit is Hearts");
else if (deck[i] / 13 == 2)
System.out.print("suit is Diamonds");
else
System.out.print("suit is Clubs");

*/
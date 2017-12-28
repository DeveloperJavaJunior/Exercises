public class Zad06RandomKarta {

	public static void main(String[] args) {
		String[] suits = { "Srce", "Kocka", "Pik", "Tref" }; // znak karte
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" }; // vrijednost karte
		
		int randomSuit = (int) (Math.random() * suits.length);// random broj za znak karte
		int randomRank = (int) ((Math.random() * ranks.length)); // random broj za vrijednost karte
		System.out.println("Vasa karta je: " + ranks[randomRank] + " "
				+ suits[randomSuit]);// stampanje rezultata
	}

}

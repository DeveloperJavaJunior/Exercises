import java.util.Scanner;
public class Task_7_35 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// Pretpostavka za pocetak igre, ako vrijednost, promijenimo u 'n',
		// igra zavrsava
		char playAgain = 'y';
		
		// Rijeci za pogadjanje.
		String[] words = {"Doboj", "Tuzla", "Teslic", "Tesanj", "Gracanica"};
		
		// Pocetak igre
		while (playAgain == 'y') {
			
			// Nasumicno generisanje rijeci iz string array_a words
			String word = generateWord(words);
			
            // Array je po default_u popunnjen sa '*', u toku igre kada korisnik pogodi
			// karakter, '*', mijenja vrijednost u pogodak 
			char[] chArray = new char[word.length()];
			
			// Popunjavanje array_a defaultnim vrijednostima. '*'.
			for (int i = 0; i < chArray.length; i++)
				chArray[i] = '*';
			
			// Broj promasaja
			int missed = 0;
	
			// Petlja ispisuje upit i pokazuje pogotke i promasaje.
			// Zavrsava se kad su pogodjeni svi karakteri
			do {
				// Prompt korisniku i ispis eventualnih pogodaka i njihovo mjesto,
				// odnosno ispis elemenata iz chArray
				displayQuestion(chArray);
			
				// Korisnikov pokusaj
				char guess = input.next().charAt(0);
				
				// Metod checkGuess procesuira korisnikov pokusaj, 
				// ukoliko je pogresan, broj promasaja se uvecava
				missed = checkGuess(word, chArray, guess, missed);
			
			// U situaciji kad su pogodjeni svi karakteri, array chArray je popunjen
			// korisnikovim pogocima, petlja se zavrsava	
			} while(!isFull(chArray));
			
			// Ispis konacnog rezultata
			System.out.println("The word is " + word + " you missed " + missed +
					" time");
		
			do {
				// Upit korisniku za nastavak igre
				System.out.print("Do you want to guess another word? " + 
						"Enter y or n> ");
				// U zavisnost od korisnikovog unosa igra se nastavlja 'y',
				// ili zavrsava 'n'
				playAgain = input.next().charAt(0);
				
				// U slucaju pogresnog unosa ponavlja se pitanje za nastavak igre
				if (playAgain != 'y' && playAgain != 'n')
					System.out.println("Invalid input");
				
			} while (playAgain != 'y' && playAgain != 'n');	
			
		};
		
		input.close();
	}
	/** Metod generise rijec, koju pogadjamo, iz string array-a */
	public static String generateWord(String[] s) {
		return s[(int)(Math.random() * s.length)];
	}
	/** Metod ispisuje prompt korisniku za unos karaktera i ispisuje
	 * vec pogodjene karaktere, odnosno, '*', gdje nema pogotka  */
	public static void displayQuestion(char[] ch) {
		System.out.print("(Guess) Enter a letter in word ");
		for (int i = 0; i < ch.length; i++) 
			System.out.print(ch[i]);
		System.out.print(" > ");	
	}
	/** Metod provjerava, postoji li u rijeci uneseni karakter */ 
	public static boolean isContaining(String s, char ch) {
		for (int i = 0; i < s.length(); i++) 
			if (s.charAt(i) == ch) return true;
		
		return false;
	}
	/** Metod provjerava da li je vec ranije unesen karakter koji unese korisnik */
	public static boolean isAlreadyGuessed(char[] chArray, char ch) {
		for (int i = 0; i < chArray.length; i++)
			if (chArray[i] == ch) return true;
		
		return false;
	}
	/** Metod provjerava da li su pogodjeni svi karakteri */
	public static boolean isFull(char[] ch) {
		for (char i : ch)
			if (i == '*') return false;
		return true;
	}
	/** Metod kontrolise unos korisnika i u slucaju pogresnog pokusaja, broj promasaja
	 * uvecava za jedan */
	public static int checkGuess(String s, char[] chArr, char ch, int n) {
		
		if (isAlreadyGuessed(chArr, ch))
			System.out.println(ch + " is already in the word");
		else if (!isContaining(s, ch)) {
			System.out.println(ch + " is not in the word");
			return ++n;
		}	
		else {
			for (int i = 0; i < chArr.length; i++) {
				if (s.charAt(i) == ch) {
					chArr[i] = ch;
				}
			}
		}
		return n;
	}
	
}





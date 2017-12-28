package week5;

public class RandomUppercaseCharacter {
	public static void main(String[] args) {

		// generisati nasumični uppercase karakter
		// ASCI uppercase karakteri imaju vrijednost od 65 do 90
		char random = (char) ((int) ((Math.random() * 26) + 65));

		// ispisati random char
		System.out.println(random);
	}
}

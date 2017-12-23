package lekcija_6;

public class RandomCharacter {

	/** Metoda koja generise nasumican karakter u rsponu od char1 do char2 */
	public static char vratiNasumicanKarakter(char char1, char char2) {
		return (char) (char1 + Math.random() * (char2 - char1 + 1));

	}

	/** Metoda koja generise nasumicno malo slovo */
	public static char VratiNasumicnoMaloSlovo() {
		return vratiNasumicanKarakter('a', 'z');

	}

	/** Metoda koja generise nasumicno veliko slovo */
	public static char VratiNasumicnoVelikoSlovo() {
		return vratiNasumicanKarakter('A', 'Z');

	}

	/** Metoda koja generise nasumicni brojcani karakter */
	public static char VratiNasumicniBrojcaniKarakter() {
		return vratiNasumicanKarakter('0', '9');
	}

	/** Metoda koja generise nasumican karakter */
	public static char VratiNasumicanKarakter() {
		return vratiNasumicanKarakter('\u0000', '\uFFFF');
	}

}

public class Zad04BrojPonavljanjaKaraktera {

	/**
	 * Metoda izracunava broj ponavljanja karaktera u stringu
	 * 
	 * @param str
	 *            string u kome zelimo prebrojati ponavljanje nekog karaktera
	 * @param a
	 *            karakter ciji broj ponavljanja zelimo izracunati
	 * @return broj ponavljanja odredjenog karaktera
	 */
	public static int count(String str, char a) {
		// brojac ponavljanja karaktera
		int count = 0;
		// petlja prolazi cijeli string
		for (int i = 0; i < str.length(); i++) {
			// ako je karakter datog stringa jednak karakteru ciji broj
			// ponavljanja zelimo izracunati,
			// povecavamo brojac za 1
			if (str.charAt(i) == a) {
				count++;
			}
		}
		// vracanje rezultata
		return count;
	}

	public static void main(String[] args) {
		String str = "welcome";
		char ch = 'e';
		// ispis rezultata
		System.out.println("U stringu \"" + str + "\" karakter '" + ch
				+ "' se ponavlja " + count(str, ch) + " puta.");
	}

}

package training_6_11_2017;

/**
 * @author Edin Korkic
 * 
 *         Napisati program koji simulira bacanje kovanice milion puta te
 *         ispisuje korisniku koliko puta je novèiæ pao na glavu a koliko puta
 *         na pismo.
 * 
 */

public class FlipCoin {

	public static void main(String[] args) {

		int head = 0;
		int tail = 0;

		for (int i = 0; i < 1e6; i++) {
			int coin = (int) (Math.random() * 2);
			if (coin > 0) {
				head++;
			} else {
				tail++;
			}
		}

		System.out.format(" Novcic je pao na glavu %d puta a na pismo %d puta!", head, tail);
	}

}

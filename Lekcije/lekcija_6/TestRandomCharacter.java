package lekcija_6;

public class TestRandomCharacter {

	public static void main(String[] args) {

		final int BROJ_KARAKTERA = 150;
		final int KARAKTERA_PO_LINIJI = 30;

		// ispisati nasumicne karaktere u rasponu od 'a' do 'z', 30 po liniji
		for (int i = 0; i < BROJ_KARAKTERA; i++) {
			char karakter = RandomCharacter.VratiNasumicnoMaloSlovo();
			// ukoliko smo dosegli 30 karaktera , predi u naraedni red
			if ((i + 1) % KARAKTERA_PO_LINIJI == 0) {
				System.out.println(karakter);
				// ukoliko nismo dosegli 30 karaktera , ispsuj dalje karaktere
			} else {
				System.out.print(karakter + " ");
			}
		}

	}

}

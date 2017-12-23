package day_1;

public class Zadatak_3 {

	public static void main(String[] args) {

		int bacanje = 0;
		int pismo = 0;
		int glava = 0;

		for (int i = 0; i < 1e6; i++) {
			bacanje = (int) (Math.random() * 2);

			if (bacanje == 0) {
				pismo++;

			} else {
				glava++;
			}

		}

		System.out.printf("Novcic je pao na pismo %d puta %n", pismo);
		System.out.printf("Novcic je pao na glavu %d puta", glava);
	}

}

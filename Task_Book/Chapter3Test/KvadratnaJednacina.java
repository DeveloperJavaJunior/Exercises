package Test;

import java.util.Scanner;

public class KvadratnaJednacina {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		// Tražiti od korisnika da unese a, b i c
		System.out.print("Molimo unesite a,b i c odvojene razmakom: ");
		double a = unos.nextDouble();
		double b = unos.nextDouble();
		double c = unos.nextDouble();
		unos.close();

		double diskriminanta = Math.pow(b, 2) - 4 * a * c;

		// Diskriminanta pozitivna - jednaèina ima dva realna korijena
		if (diskriminanta > 0) {
			double r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2* a;
			double r2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2* a;
			System.out.println("Jednaèina ima dva realna korijena:  " + r1+ " i " + r2);
		}
		// Diskriminanta je 0 i ima jedan realan korijen
		else if (diskriminanta == 0) {
			double r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2
					* a;
			System.out.println("Jednaèina ima jedan realan korijen: " + r1);
		}
		// Diskriminanta je negativna i nema ralnih korijena
		else {
			System.out.println("Jednaèina nema realnih korijena");
		}

	}
}

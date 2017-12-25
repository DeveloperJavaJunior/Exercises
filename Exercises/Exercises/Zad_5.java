/** Napisati program koji pita korisnika da unese cijeli, pozitivan, trocifren broj te potom racuna 
 * i ispisuje zbir cifara tog broja.Ako korisnik unese neki broj koji nije trocifren, ili nije pozitivan, 
 * program treba da mu ispise poruku da dati broj nije trocifren ili pozitivan.*/

		import java.util.Scanner;

		public class Zad_5 {

			public static void main(String[] args) {

				System.out.print("Unesite cijeli, pozitivan, trocifren broj: ");
				Scanner unos = new Scanner(System.in);
				int broj = unos.nextInt();
				unos.close();

				if (broj < 1000 && broj > 99) {
					System.out.println("Broj koji ste unjeli je pozitivan trocifren broj.");
					int zbir = 0;
					zbir = zbir + broj % 10;
					broj = broj / 10;
					zbir = zbir + broj % 10;
					broj = broj / 10;
					zbir = zbir + broj;
					System.out.println("Zbir cifara iznosi " + zbir);
				} else {
					System.out.println("Broj koji ste unjeli nije pozitivan ili trocifren.");
				}

			}
		}
import java.util.Scanner;

public class Zad07DanUSedmici {
	public static void printDayInFuture(int currentDay, int dayInFuture) {
		// pronalazenje dana koji odgovara broju dana u buducnosti
		int dayNumber = (currentDay + dayInFuture) % 7;
		String[] days = { "ponedeljak", "utorak", "srijeda", "cetvrtak",
				"petak", "subota", "nedelja" }; // dani u sedmici
		// ispis poruke korisniku
		System.out.println("Danas je " + days[currentDay]
				+ ", a dan u buducnosti je " + days[dayNumber] + ".");

	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite danasnji dan(0-ponedeljak, 1-utorak, 2-srijeda...): ");
		int today = input.nextInt();// danasnji dan

		System.out.print("Unesite broj dana u buducnosti: ");
		int futureDay = input.nextInt();// dan u buducnosti
		input.close();
		if (today >= 0 && today < 7) {// dani u sedmici su definisani od 0 do 6
			printDayInFuture(today, futureDay);// stampanje dana u buducnosti
		}

		else {
			System.out.println("Unijeli ste nepostojeci dan.");
		}

	}

}

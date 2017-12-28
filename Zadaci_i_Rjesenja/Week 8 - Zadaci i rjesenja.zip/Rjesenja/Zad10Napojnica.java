import java.util.Scanner;

public class Zad10Napojnica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// vrijednost racuna (kupljene robe)
		System.out.print("Unesite iznos racuna: ");
		double receipt = input.nextDouble();

		// vrijednost napojnice u procentima
		System.out.print("Unesite iznos napojnice u procentima: ");
		double tip = input.nextDouble();

		input.close();
		// racunanje i ispis iznosa napojnice i ukupnog racuna
		calculateTipAndPrintReceipt(receipt, tip);

	}

	private static void calculateTipAndPrintReceipt(double receipt,
			double tipPercent) {
		// iznos napojnice
		double valueOfTip = receipt * (tipPercent / 100);
		// iznos racuna
		double valueOfReceipt = receipt + valueOfTip;

		// stampanje rezultata
		System.out.println("Ukupna vrijednost racuna je: " + valueOfReceipt);
		System.out.println("Napojnica iznosi: " + valueOfTip);

	}

}

public class Task10Tip {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		// Unesem 10 za raèun
		System.out.print(" Enter a receipt:");
		double receipt = in.nextDouble();

		// Unesem 0.15(Da ne djelim sa 100 kada unesem 15)
		System.out.print(" Enter a tip:");
		double tip = in.nextDouble();

		in.close();
		calculateTipAndPrintReceipt(receipt, tip);

	}

	private static void calculateTipAndPrintReceipt(double receipt, double tip) {

		double valueOfTip = receipt * tip;

		double valueOfReceipt = receipt + valueOfTip;

		System.out.println(" Total value of receipt:" + valueOfReceipt);
		System.out.println(" Value of tip:" + valueOfTip);
	}

}
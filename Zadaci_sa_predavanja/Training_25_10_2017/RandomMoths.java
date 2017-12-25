package training_25_10_2017;

/*
 *  @uthor Edin Korkic
 *  
 *  Napisati program koji generiše nasumièan broj izmeðu 1 i 12 i na 
 *  osnovu nasumiènog broja ispisuje mjesec u godini.(Na primjer: 
 *  ukoliko je nasumièni broj 4, program ispisuje April.)
 * 
 */ 

public class RandomMoths {

	public static void main(String[] args) {
		
		int month = 1 + (int)(Math.random() *12);
		
		if (month == 1) {
			System.out.printf(" Januar ");
		} else if (month == 2) {
			System.out.printf(" Februar ");
		} else if (month == 3) {
			System.out.printf(" Mart ");
		} else if (month == 4) {
			System.out.printf(" April ");
		} else if (month == 5) {
			System.out.printf(" Maj ");
		} else if (month == 6) {
			System.out.printf(" Juni ");
		} else if (month == 7) {
			System.out.printf(" Juli ");
		} else if (month == 8) {
			System.out.printf(" Avgust ");
		} else if (month == 9) {
			System.out.printf(" Semptembar ");
		} else if (month == 10) {
			System.out.printf(" Oktobar ");
		} else if (month == 11) {
			System.out.printf(" Novembar ");
		} else{
			System.out.printf(" Decembar ");
		
	}}

}

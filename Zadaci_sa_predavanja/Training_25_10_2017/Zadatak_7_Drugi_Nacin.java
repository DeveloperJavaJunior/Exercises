package training_25_10_2017;

/*
*  @uthor Edin Korkic
*  
*  Napisati program koji generi�e nasumi�an broj izme�u 1 i 12 i na 
*  osnovu nasumi�nog broja ispisuje mjesec u godini.(Na primjer: 
*  ukoliko je nasumi�ni broj 4, program ispisuje April.)
* 
*/ 

public class Zadatak_7_Drugi_Nacin {

	public static void main(String[] args) {

		int month = 1 + (int) (Math.random() * 12);

		switch (month) {

		case 1:
			System.out.printf(" Januar ");
			break;
		case 2:
			System.out.printf(" Februar ");
			break;
		case 3:
			System.out.printf(" Mart ");
			break;
		case 4:
			System.out.printf(" April ");
			break;
		case 5:
			System.out.printf(" Maj ");
			break;
		case 6:
			System.out.printf(" Juni ");
			break;
		case 7:
			System.out.printf(" Juli ");
			break;
		case 8:
			System.out.printf(" Avgust ");
			break;
		case 9:
			System.out.printf(" Semptembar ");
			break;
		case 10:
			System.out.printf(" Oktobar ");
			break;
		case 11:
			System.out.printf(" Novembar ");
			break;
		case 12:
			System.out.printf(" Decembar ");

		}

	}

}

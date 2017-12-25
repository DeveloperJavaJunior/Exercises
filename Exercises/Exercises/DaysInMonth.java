import java.util.Scanner;

public class DaysInMonth {
			public static void main(String[] args) {
				// Korisnik unosi broj mjeseca u godini i godinu, program ispisuje koliko ima dana taj mjesec.
				Scanner input = new Scanner(System.in);
				System.out.println("Unesite broj za mjesec (1-12) i godinu: ");
				int month = input.nextInt();
				int year = input.nextInt();
				input.close();
				
				switch (month) {
					case 1 : System.out.println("Januar "+year+" godine ima 31 dan."); break;
					case 2 : if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
								System.out.println("Februar "+year+" godine ima 29 dana.");						
							 }
							 else {
								 System.out.println("Februar "+year+" godine ima 28 dana");
							 } break;					
					case 3 : System.out.println("Mart "+year+" godine ima 31."); break;
					case 4 : System.out.println("April "+year+" godine ima 30 dana."); break;
					case 5 : System.out.println("Maj "+year+" godine ima 31 dan."); break;
					case 6 : System.out.println("Juni "+year+" godine ima 30 dana."); break;
					case 7 : System.out.println("Juli "+year+" godine ima 31 dan."); break;
					case 8 : System.out.println("Avgust "+year+" godine ima 31 dan."); break;
					case 9 : System.out.println("Septembar "+year+" godine ima 30 dana."); break;
					case 10 : System.out.println("Oktobar "+year+" godine ima 31 dan."); break;
					case 11 : System.out.println("NoDecembar "+year+" godine ima 31 dan."); break;
					default: System.out.println("Pogresan unos. Unesite broj od 1 do 12.");
					  		 System.exit(1);
				}		

			}

		}

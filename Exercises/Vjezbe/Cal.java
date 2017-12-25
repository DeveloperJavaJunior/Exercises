import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		System.out.print(" Unesite broj: ");
		int n1 = input.nextInt();
		System.out.print(" Unesite znak za mat operaciju+: ");
		char ch = input.next().charAt(0);
		System.out.print(" Unesite broj: ");
		int n2 = input.nextInt();
		
		int res = 0;
		
		switch(ch){
		case'+':res = n1 + n2;break;
		case'-':res = n1 - n2;break;
		case'*':res = n1 * n2;break;
		case'/':res = n1 / n2;break;
		case'%':res = n1 % n2;break;
		default:
			System.out.printf(" pogresan unos!");break;
		}
		
			System.out.printf(" Rezultat operacije :%d",res);
	}

}

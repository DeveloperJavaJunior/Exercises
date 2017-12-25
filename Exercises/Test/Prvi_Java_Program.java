package test;

public class Prvi_Java_Program {

	public static void main(String[] args) {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		
		System.out.print(" Unesite svoje ime:");
		String ime = unos.nextLine();
		
		System.out.print(" Unesite svoje prezime:");
		String prezime = unos.nextLine();
		
		unos.close();
		
		System.out.format(" Zdravo,%s %s ", ime , prezime);

		
	}

}

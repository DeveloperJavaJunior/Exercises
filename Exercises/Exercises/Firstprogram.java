public class Firstprogram {

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Enter a name:");
		String name = in.nextLine();
		
		System.out.print(" Enter a surname:");
		String surName = in.nextLine();

		in.close();

		System.out.printf(" Hello %4s\n %6s,welcome to world Java!",name,surName);
	}

}
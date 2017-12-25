package test;

public class Test {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.print(" Enter a your name and surname:");
		
		String name = in.nextLine();
		in.close();
		
		System.out.format(" Welcome %s in Java world!",name);
		

	}

}

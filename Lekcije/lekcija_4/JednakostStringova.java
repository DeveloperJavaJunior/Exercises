package lekcija_4;

public class JednakostStringova {

	public static void main(String[] args) {
		
		String s1 = "String";
		String s2 = new String("String");
		
		// pogresan nacin za poredenje jednakosti stringova
		System.out.println("Dva stringa su jednaka? " + (s1 == s2));
		
		// ispravan nacin za poredenje jednakosti stringova
		System.out.println("Dva stringa su jednaka? " + s1.equals(s2));
		

	}

}

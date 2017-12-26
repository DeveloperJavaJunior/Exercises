import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date date = new Date(100000);

		d1(date);

		System.out.println(date.toString());
	}

	public static void d1(Date date) {

		date = new Date(1000000);
		d2(date);

		System.out.println(date.toString());
	}
	
	public static void d2(Date date) {
		
		date = new Date(10000000);
		d3(date);
		
		System.out.println(date.toString());
	}
	
	public static void d3(Date date) {
		
		date = new Date(100000000);
		d4(date);
		
		System.out.println(date.toString());
	}
	public static void d4(Date date) {
		
		date = new Date(1000000000);
		d5(date);
		
		System.out.println(date.toString());
	}
	public static void d5(Date date) {
		
		date = new Date(10000000000L);
		d6(date);
		
		System.out.println(date.toString());
	}
	public static void d6(Date date) {
		
		date = new Date(100000000000L);
		
		System.out.println(date.toString());
	
	}
}
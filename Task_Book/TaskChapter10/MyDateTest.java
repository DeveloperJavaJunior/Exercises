package Task_Chapter_10;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(34355555133101L);
		
		System.out.printf(" Current date:day %d month %d year %d \n", date1.getDay(), date1.getMonth(), date1.getYear());
		System.out.printf(" Elapsed date:day %d month %d year %d ", date2.getDay(), date2.getMonth(), date2.getYear());
		

	}

}

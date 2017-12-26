package Task_Chapter_10;

public class MyIntegerTest {

	public static void main(String[] args) {
		
         MyInteger myInt1 = new MyInteger(3);
         MyInteger myInt2 = new MyInteger(5);
         MyInteger myInt3 = new MyInteger(7);
         MyInteger myInt4 = new MyInteger(8);
         

         System.out.printf(" %d is even? %s %n ", myInt1.getValue(), myInt1.isEven());
         System.out.printf(" %d is even? %s %n ", myInt2.getValue(), myInt2.isEven());
         System.out.printf(" %d is even? %s %n ", myInt3.getValue(), myInt3.isEven());
         System.out.printf(" %d is even? %s %n ", myInt4.getValue(), myInt4.isEven());
         
         
         System.out.printf(" %d is odd? %s %n ", myInt1.getValue(), myInt1.isOdd());
         System.out.printf(" %d is odd? %s %n ", myInt2.getValue(), myInt2.isOdd());
         System.out.printf(" %d is odd? %s %n ", myInt3.getValue(), myInt3.isOdd());
         System.out.printf(" %d is odd? %s %n ", myInt4.getValue(), myInt4.isOdd());
         
         
         System.out.printf(" %d is prime? %s %n ", myInt1.getValue(), myInt1.isPrime());
         System.out.printf(" %d is prime? %s %n ", myInt2.getValue(), myInt2.isPrime());
         System.out.printf(" %d is prime? %s %n ", myInt3.getValue(), myInt3.isPrime());
         System.out.printf(" %d is prime? %s %n ", myInt4.getValue(), myInt4.isPrime());
         
         System.out.printf(" %d %n ", MyInteger.parseInt(new char[] {'1', '5', '6'}));
         System.out.printf(" %d %n ", MyInteger.parseInt("454"));
         
	}

}

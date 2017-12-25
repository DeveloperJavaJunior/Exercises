import java.util.Scanner;

public class IntToBinary {

	public static void main(String[] args) {
		int n;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Decimal Number:");
        n = s.nextInt();
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println(x);
	}

}
/**
		System.out.println("Binary representation of 124: ");
    	System.out.println(Integer.toBinaryString(0));
    	
    	int i = 56;
        
        String strBinaryNumber = Integer.toBinaryString(i);
       
        System.out.println("Convert decimal number to binary number example");
        System.out.println("Binary value of " + i + " is " + strBinaryNumber);

System.out.println(Integer.toBinaryString(10));
System.out.println(Integer.toHexString(10));
System.out.println(Integer.toOctalString(10));
 */                                     

import java.util.*;

public class Task5FinancialApplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print(" Enter subtotal and a gratuity rate:");
        
        double subtotal = input.nextDouble();
        double gratuityrate = input.nextDouble();
        input.close();
        
        double gratuity  = gratuityrate  / 10;
        double total = subtotal + gratuity;
        
        System.out.println(" The gratuity is $" + gratuity + " and total is $" + total);
        
	}

}

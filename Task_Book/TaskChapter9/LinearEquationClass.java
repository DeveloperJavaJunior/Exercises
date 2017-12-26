

public class LinearEquationClass {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		 System.out.println("Enter an Integer for Each of The Following Varables: a, b, c, d, e, f: ");
	
		         double a = input.nextDouble();
	
		         double b = input.nextDouble();
	
		         double c = input.nextDouble();
		
		         double d = input.nextDouble();
		
		         double e = input.nextDouble();
		
		         double f = input.nextDouble();
		
		     }
		
		 }
	
		 class LinearEquation {
		
		     private double a;
	
		     private double b;
		
		     private double c;
	
		     private double d;
		
		     private double e;
	
		     private double f;
	
		     private double x;
		 
		     private double y;
		 
		         if (isSolvable()){
		 
		             System.out.println("x is " + x + " and " + "y is" + y);
		             
		         }else{
		                 System.out.println("The Equation Has No Solution");
	
		         }

		
		     LinearEquation(double myA, double myB, double myC, double myD, double myE, double myF) {
		
		                 a = myA;
		 
		                 b = myB;
	
		                 c = myC;
		 
		                 d = myD;
	
		                 e = myE;
		
		                 f = myF;
		
		         }
		
		     boolean isSolvable() {
		
		         if (a*d-b*c != 0) return true;
		
		             else return false;
	
		     }
		
		     double getX() {
	
		         double x = ((e*d)-(b*f)/(a*d-b*c));
		
		         return x;
	
		     }
		
		     double getY() {
		
		         double y = ((a*f-e*c)/(a*d-b*c));
		
		         return y;
		
		     }
	
		     double getA() {
		
		         return a;

		     }
	
		     void setA(double newA){
	
		         a = newA;
		
		     }
		
		     double getB(){
		
		         return b;
		
		     }
		
		     void setB(double newB){
		
		         b = newB;
		
		     }
		
		     double getC() {
		
		         return c;
		
		     }
		
		     void setC(double newC){
		
		         c = newC;
		
		     }
		
		     double getD() {
	
		         return d;
		
		     }
		
		     void setD(double newD) {
		 
		         d = newD;
	
		     }
		
		  
		
		     double getE() {
		
		         return e;
		
		     }
		
		  
		
		     void setE(double newE) {
		
		         e = newE;
		
		     }
		
		     double getF() {
		 
		         return f;
		 
		     }
		
		     void setF(double newF) {
		
		         f = newF;
		
		     }
		     }
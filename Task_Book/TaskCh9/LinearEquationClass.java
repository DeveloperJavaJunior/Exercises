
public class LinearEquationClass {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter a,b,c,d,e,f:");
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double f = in.nextDouble();
		in.close();
		
		LinearEquation l = new LinearEquation(a,b,c,d,e,f);
		
		if(l.isSovable() != 0){ 
			System.out.println(" x is " + l.getX() + " and y is " + l.getY());
			
		}else{
			System.out.println(" The equation has no solution ");
			
		}

	}

}
class LinearEquation{
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	LinearEquation(){
		
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
	}
	LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF){
		
		
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
	}
		
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public double getD(){
		return d;
	}
	public double getE(){
		return e;
	}
	public double getF(){
		return f;
	}
	public double isSovable(){
		return (a * d) - (b *c);	
		
  	}
	public double getX(){
		return (e * d - b * f) / (a * d - b * c);
		
	}
	public double getY(){
		return (a * f - b * e) / (a * d - b * c);
		
	}
}
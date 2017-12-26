public class QuadraticEquationClass {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.print(" Enter a,b,c:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		
		QuadraticEquation q = new QuadraticEquation(a,b,c);
		
		if(q.getDiscriminant() > 0){
			System.out.println(" The equation has two roots " + q.getRoot1() + " and " + q.getRoot2());
		}
		else if(q.getDiscriminant() == 0){
			System.out.println(" The equation has one root " + q.getRoot1());
		}
		else{
			System.out.println(" The equation has no real roots ");
		}
			
	}

}
class QuadraticEquation{
	
	private int a;
	private int b;
	private int c;
	
	QuadraticEquation(){
		
		a = 0;
		b = 0;
		c = 0;
	}
	QuadraticEquation(int newA, int newB, int newC){
		
		a = newA;
		b = newB;
		c = newC;
	}
	
	public int getA(){
		return a;
	}
		public int getB(){
			return b;
		}
		public int getC(){
			return c;
		}
		public double getDiscriminant(){
			return (Math.pow(b,2) - 4 * a * c);
		}	
		public double getRoot1(){
			return (-b + Math.pow(Math.pow(b,2) - 4 * a * c,0.5)) / 2 * a;
		}
			public double getRoot2(){
				return (-b - Math.pow(Math.pow(b,2) - 4 * a * c,0.5)) / 2 * a;
			
		}
}
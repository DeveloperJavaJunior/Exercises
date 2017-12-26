

public class InterestingPoint {

	public static void main(String[] args) {

		//PROGRAM KOJI RJEŠAVA SISTEM DVIJE JEDNAÈINE
		public class LinearEquation {
		private double a;
		private double b;
		private double c;
		private double d;
		private double e;
		private double f;
		public LinearEquation(double a, double b, double c, double d, double e, double f ){
			this.a=a;
			this.b=b;
			this.c=c;
			this.d=d;
			this.e=e;
			this.f=f;
		}
		public double gerA(){
			return a;
		}
		public double gerB(){
			return b;
		}
		public double gerC(){
			return c;
		}
		public double gerD(){
			return d;
		}
		public double getE(){
			return e;
		}
		public double gerF(){
			return f;
		}
		public boolean isSolvable() {
			return a*d-b*c==0;
		}
		public double getX(){
			return (e*d-b*f)/(a*d-b*c);
		}
		public double getY(){
			return (a*f-e*c)/(a*d-b*c);
		}
		}


		import java.util.*;
		public class TestLinearEquation {
			public static void main(String[] args) {
				Scanner input=new Scanner(System.in);
				System.out.println("Unijeti a, b, c, d, e, f: ");
				double a=input.nextDouble();
				double b=input.nextDouble();
				double c=input.nextDouble();
				double d=input.nextDouble();
				double e=input.nextDouble();
				double f=input.nextDouble();
				LinearEquation l=new LinearEquation(a,b,c,d,e,f);
				if(l.isSolvable()==true)
					System.out.println("Jednaèina nema rješenja!");
				else
					System.out.println("x="+l.getX()+" y="+l.getY());
			}
		}

		//PROGRAM KOJI RAÈUNA PRESJEK DVIJE DUŽI
		//Kosti se klasa LinearEquation
		import java.util.*;
		public class TestCrossPoint {
		public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unijeti koordinate za sve èetiri taèke za x i y:");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double x3=input.nextDouble();
		double y3=input.nextDouble();
		double x4=input.nextDouble();
		double y4=input.nextDouble();
		double a=y1-y2;
		double b=x2-x1;
		double c=y3-y4;
		double d=x4-x3;
		double e=(y1-y2)*x1-(x1-x2)*y1;
		double f=(y3-y4)*x3-(x3-x4)*y3;
		LinearEquation l=new LinearEquation(a, b, c, d, e,f);
		if(l.isSolvable()==true)
			System.out.println("Dvije linije su paralelne tj. nema presjeka!");
		else
			System.out.println("Taèka presjeka dvije linije je: ("+l.getX()+","+l.getY()+")");
			}
		}
	}

}



public class RegularPolygon {

	public static void main(String[] args) {
		
		public class RegularPolygon {
			private int n;
			private double side;
			private double x;
			private double y;
			public RegularPolygon(){
				n=3;
				side=1;
				x=0;
				y=0;
			}
			public RegularPolygon(int n, double side){
				this.n=n;
				this.side=side;
				x=0;
				y=0;
			}
			public RegularPolygon(int n, double side, double x, double y){
				this.n=n;
				this.side=side;
				this.x=x;
				this.y=y;	
			}
			public void setN(int n){
				this.n=n;
			}
			public int getN(){
			return n;		
			}
			public void setSide(double side){
				this.side=side;
			}
			public double getSide(){
				return side;
			}
			public void setX(double x){
				this.x=x;
			}
			public double getX(){
				return x;
			}
			public void setY(double y){
				this.y=y;
			}
			public double getY(){
				return y;
			}
			public double getPerimeter(){
				return n*side;
			}
			public double getArea(){
				return n*side*side/(4*Math.tan(Math.PI/n));
			}
			}


			public class TestRegularPolygon {
				public static void main(String[] args) {
				RegularPolygon r1=new RegularPolygon();
				RegularPolygon r2=new RegularPolygon(6,4);
				RegularPolygon r3=new RegularPolygon(10, 4, 5.6, 7.8);
			System.out.printf("1. poligona ima: %d strana dužine %4.2f sa centrom u (%4.2f,%4.2f)"
			+ " površine mu je %5.2f i obim %4.2f\n", r1.getN(), r1.getSide(), r1.getX(),r1.getY(),
			r1.getArea(), r1.getPerimeter());
			System.out.printf("2. poligona ima: %d strana dužine %4.2f sa centrom u (%4.2f,%4.2f)"
			+ " površine mu je %5.2f i obim %4.2f\n", r2.getN(), r2.getSide(), r2.getX(),r2.getY(),
			r2.getArea(), r2.getPerimeter());
			System.out.printf("3. poligona ima: %d strana dužine %4.2f sa centrom u (%4.2f,%4.2f)"
			+ " površine mu je %5.2f i obim %4.2f\n", r3.getN(), r3.getSide(), r3.getX(),r3.getY(),
			r3.getArea(), r3.getPerimeter());
				}
			}
	}

}



public class FanClass {

	public static void main(String[] args) {
		
		Fan fan_is_on=new Fan(1,false,5,"blue");
		fan_is_on.seton$off(true);
		fan_is_on.setcolor("blue");
		fan_is_on.setspeed(3);
		 
		System.out.println("Fan is on: ");
		System.out.println("Speed: "+fan_is_on.getspeed());
		System.out.println("switch on: "+fan_is_on.ison$off());
		System.out.println("radius: "+fan_is_on.getradius());
		System.out.println("color: "+fan_is_on.getcolor());
		 
		 }
		}
		 
		class Fan{
		    int speed=1;
		    boolean on$off=false;
		    double radius=5;
		    String color="blue";
		 
		   Fan(int speed, boolean on$off, double radius, String color){
		    this.speed=speed;
		    this.on$off=on$off;
		    this.radius=radius;
		    this.color=color;
		    }
		   Fan(){}
		 
		    void setspeed(int s){ 
		    	speed=s; }
		    void seton$off(boolean open){ 
		    	on$off=open;}
		    void setradius(double r){ 
		    	radius=r; }
		    void setcolor(String c){
		    	color=c; }
		 
		 
		    int getspeed(){ 
		    	return speed; }
		    boolean ison$off(){ return on$off; }
		    double getradius(){ return radius; }
		    String getcolor(){ return color; }
		 
		}

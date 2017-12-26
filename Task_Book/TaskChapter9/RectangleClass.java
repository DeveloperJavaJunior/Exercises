

public class RectangleClass {

	public static void main(String[] args) {

		 Rectangle myRectangle = new Rectangle(4, 40);
	
		     System.out.println("The area of a rectangle with width " +
		 
		       myRectangle.width + " and height " +
		
		       myRectangle.height + " is " +
		
		       myRectangle.getArea());
		 
		     System.out.println("The perimeter of a rectangle is " +
		
		       myRectangle.getPerimeter());
		
		  
		
		     Rectangle yourRectangle = new Rectangle(3.5, 35.9);
		
		     System.out.println("The area of a rectangle with width " +
		
		       yourRectangle.width + " and height " +
	
		       yourRectangle.height + " is " +
	
		       yourRectangle.getArea());
		
		     System.out.println("The perimeter of a rectangle is " +
		 
		       yourRectangle.getPerimeter());
		 

		   }  
	
	}
	class Rectangle{

	double width;



    double height;

     

     Rectangle()

    {

        width = 1;

        height = 1;     

    }

     Rectangle(double width, double height)
    {

        this.width = width;

        this.height = height;

    }

     

    public double getArea() { 
    	return width * height;}

    public double getPerimeter() { return width * 2 + height * 2;}

}
	
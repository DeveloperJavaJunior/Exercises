

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //set object date
		
		    Date date = new Date (10000);
	
		        //set for next date
		
		    m7(date);


		    //print result
	
		    System.out.println(date.toString() );
		
		  }
	
		  //follow same formula as before until all output is generated
	
		  public static void m7(Date date) {
	
		    date = new Date (100000);
		
		    m6(date);
		
		  System.out.println(date.toString() );
	
		 }
		
		  public static void m6(Date date) {
		
		    date = new Date (1000000);
		
		    m5(date);
	
		  System.out.println(date.toString() );
	
		  }
		
		  public static void m5(Date date) {
		
		    date = new Date (10000000);
	
		    m4(date);
		
		  System.out.println(date.toString() );
	
		 }
		
		  public static void m4(Date date) {
		
		    date = new Date (100000000);
	
		    m3(date);
	
		  System.out.println(date.toString() );
	
		 }
	
		  public static void m3(Date date) {
		
		    date = new Date (1000000000);
	
		    m2(date);
		
		  System.out.println(date.toString() );
	
		 
		
		 }
	
		  public static void m2(Date date) {
		
		    date = new Date (10000000000L);
		
		    m1(date);
		
		  System.out.println(date.toString() );
	
		 }
	
		 public static void m1(Date date) {
		
		    date = new Date (100000000000L);
		
		  System.out.println(date.toString() );
	}

}

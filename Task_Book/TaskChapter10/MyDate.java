package Task_Chapter_10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {

	private int year;
	private int month;
	private int day;
	
	
	public MyDate(){
		
		GregorianCalendar calendar = new GregorianCalendar(); 
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH) +1;//Ovdje sam dodao jedan da dobijem 12 mjesec
		day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	public MyDate(long elapsedTime){
		
		GregorianCalendar calendar = new GregorianCalendar(); 
		calendar.setTimeInMillis(elapsedTime);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		day = calendar.get(Calendar.DAY_OF_MONTH);
		
	}
	public MyDate(int year,int month, int day){
		
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear(){
		
		return year;
		
	}
	
	public int getMonth(){
		
		return month;
		
		
	}

public int getDay(){
	
	return day;
	
}

public void setDate(long elapsedTime){
	
	GregorianCalendar calendar = new GregorianCalendar(); 
	calendar.setTimeInMillis(elapsedTime);
	year = calendar.get(Calendar.YEAR);
	month = calendar.get(Calendar.MONTH);
	day = calendar.get(Calendar.DAY_OF_MONTH);
	
}

}


public class Task6Stopwatch {
	public static double startTime;
	public static double endTime;
	
	public static void main(String[] args) {
		

	}
	public Task6Stopwatch(double startTime){
		startTime = System.currentTimeMillis();
	}
		
	public  void start(){
		startTime = System.currentTimeMillis();
		
	}

	public  void stop(){
		endTime = System.currentTimeMillis();
		
	}

	public static void getTime(double startTime,double endTime){
		
	}
}
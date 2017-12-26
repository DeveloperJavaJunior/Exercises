package Task_Chapter_10;

public class BMI_Test {

	public static void main(String[] args) {
		
		BMI bmi = new BMI("Name",25,95.5,50);
		
		System.out.printf(" The BMI is:%s %.2f %s ", bmi.getName(), bmi.getBMI(),bmi.getStatus());
		
	}

}

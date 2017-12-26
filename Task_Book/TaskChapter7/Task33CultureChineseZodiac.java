import java.util.*;

public class Task33CultureChineseZodiac {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter a year:");

			int year = input.nextInt();
			int index = year % 12;
			
			String[] zodiac = { " Monkey "," Rooster "," Dog "," Pig "," Rat "," Ox ",
					" Tiger "," Rabbit "," Dragon "," Snake "," Horse "," Sheep" };
			
			System.out.println(zodiac[index]);
		}
}

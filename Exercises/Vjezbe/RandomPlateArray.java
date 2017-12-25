
/*
 * @author Edin Korkic
 * 
 */

public class RandomPlateArray {

	public static void main(String[] args) {

		char[] plate = new char[8];
		
		plate[0] = (char) (Math.random() * 26 + 65);
		plate[1] = (char) (Math.random() * 26 + 65);
		plate[2] = (char) (Math.random() * 26 + 65);
		plate[3] = (char) (Math.random() * 1 + 45);
		plate[4] = (char) (Math.random() * 10 + 48);
		plate[5] = (char) (Math.random() * 10 + 48);
		plate[6] = (char) (Math.random() * 10 + 48);
		plate[7] = (char) (Math.random() * 10 + 48);
			

		System.out.println(plate);

	}

}
//plate[0] = (char) (Math.random() * 26 + 65);

//plate[7] = (char) (Math.random() * 10 + 48);

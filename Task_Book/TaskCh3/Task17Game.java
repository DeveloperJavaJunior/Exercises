import java.util.*;

public class Task17Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Input a scissor 0,rock 1 and paper 2:");

		int player = input.nextInt();
		input.close();

		int computer = (int) (Math.random() * 3);

		if (computer == 0) {
			System.out.println(" Computer chose scissor.");
		} else if (computer == 1) {
			System.out.println(" Computer chose rock.");
		} else {
			System.out.println(" Computer chose paper.");
		}
		if (computer == player) {
			System.out.println(" It is draw.");
			
		}
		else if((player == 0 && computer == 1) || (player == 1 && computer == 2)){
		System.out.println(" Computer is win.");
	}
	else {
		System.out.println(" You win,you champion.");
	}
	}
}

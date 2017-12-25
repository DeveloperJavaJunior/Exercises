import java.util.Scanner;

public class Task_Ex_3 {

	public static void main(String[] args) {
		
				int broj1 = (int) (Math.random() * 10);
				int broj2 = (int) (Math.random() * 10);
				System.out.println("Koliko je:" + broj1 + "-" + broj2 + ":");
				Scanner input = new Scanner(System.in);
				int odgovor = input.nextInt();
				int rezultat = broj1 - broj2;
				if (rezultat == odgovor) {
					System.out.println("Odgovor je tacan");
				}
				else {
					System.out.println("Odgovor koji ste unjeli nije tacan, tacan odgovor je " + rezultat);
				}
			}

		}
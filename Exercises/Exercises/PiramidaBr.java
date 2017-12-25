import java.util.Scanner;

public class PiramidaBr {

	

		public static void main(String[] args) {
			// Traži od korisnika unos cijelog broja a zatim formira piramidu
			
			Scanner unos = new Scanner(System.in);
			System.out.print(" Molimo unesite cijeli pozitivan broj do kojeg želite formirati piramidu: ");
			int broj = unos.nextInt();
			unos.close();
			
			for (int x = 1; x <= broj; x++)
			{
				for (int y = 1; y <= broj - x; y++ )
				{
					System.out.print("  ");	
				}
				
				for ( int z = x; z >= 1; z--)
				{
					System.out.print(z + " ");
				}
				
				for (int a = 2; a <= x; a++)
				{
					System.out.print(a + " ");
				}
				
				System.out.println();
			}

		}

	}


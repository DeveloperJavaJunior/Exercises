package exercises;

/**
 * 
 * Pozitivni cijeli broj se naziva savršen broj ako je jednak zbiru svih svojih pozitivnih djelilaca,iskljuèujuæi  
 * sebe. Npr 6 je prvi savršeni broj zato što je 6 = 1 + 2 + 3. 
 * Sljedeæi savršeni broj je 28, zato što je 28 = 14 + 7 + 4 + 2 + 1.  
 * Do 10.000 postoje 4 savršena broja. Napisati program koji æe ispisati sva 4 savršena broja.
 *
 */

public class SavrseniBrojevi {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		
		for(int i = 1; i <= 1e4; i++){
			for(int j = 1; j < i; j++){
				if(i % j == 0){
					sum += j;
				}
			
			}
				if (sum == i){
					System.out.println(i + " je savrseni broj.");
				num++;
				}
			sum = 0;
		}
		System.out.println();
	}

}

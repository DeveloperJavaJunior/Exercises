package exercises;

/**
 * 
 * Pozitivni cijeli broj se naziva savr�en broj ako je jednak zbiru svih svojih pozitivnih djelilaca,isklju�uju�i  
 * sebe. Npr 6 je prvi savr�eni broj zato �to je 6 = 1 + 2 + 3. 
 * Sljede�i savr�eni broj je 28, zato �to je 28 = 14 + 7 + 4 + 2 + 1.  
 * Do 10.000 postoje 4 savr�ena broja. Napisati program koji �e ispisati sva 4 savr�ena broja.
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

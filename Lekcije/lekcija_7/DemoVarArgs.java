package lekcija_7;

public class DemoVarArgs {
	
	// int... brojevi varirajuce liste java tretira kao nizove
	public static void ispisiMaxVrijednost(int... brojevi) {
		
		if(brojevi.length == 0){
			System.out.println("0 proslidenih argumenata");
			return;
		}
		
		int rezultat = brojevi[0];
		
		for(int i = 0; i < brojevi.length; i++){
			if(brojevi[i] > rezultat){
				rezultat = brojevi[i];
			}
		}
		System.out.println("Max vrijednost je: " + rezultat);
	}

	public static void main(String[] args) {
		
		ispisiMaxVrijednost(34, 4, 3, 5, 6, 7);
		ispisiMaxVrijednost();
		ispisiMaxVrijednost(new int[] { 1, 2, 5});

	}

}

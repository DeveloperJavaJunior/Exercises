package arrays_Example;

public class Ex_1 {

	public static void main(String[] args) {
		
		double[] lista = new double [5];
		
		for (int i = 0; i < lista.length; i++) {
			// nasumicno generisati indeks j tako da 0 <= j <= i
			int j = (int)(Math.random() * (i + 1));
			// zamijeniti lista[i] sa lista[j]
			double privremena = lista[i];
			lista[i] = lista[j];
			lista[j] = privremena;
			}
		double privremena = lista[0]; // sacuvaj prvi element
		// pomjeri sve elemente na lijevo
		for(int i = 0; i < lista.length; i++){
		lista[i - 1] = lista[i];
		}
		// pomjeri sacuvani prvi element na kraj liste
		lista[lista.length - 1] = privremena;
		
		for(int i = 0; i < lista.length; i++){
		System.out.println(lista[i]);
		}
	}

}
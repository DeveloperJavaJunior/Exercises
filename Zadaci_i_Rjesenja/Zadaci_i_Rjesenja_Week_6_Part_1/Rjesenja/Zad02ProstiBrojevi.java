
public class Zad02ProstiBrojevi {
	
	/**
	 * Metoda provjerava da li je broj prost
	 * @param n  broj koji zelimo provjeriti da li je prost
	 * @return  true, ako je prost
	 */
	public static boolean isPrime(int n){
		// ako je broj 0 ili 1, nije prost
		if(n == 0 || n == 1){
			return false;
		}
		// ako je broj djeljiv bilo kojim brojem osim sa 1 i samim sobom, onda nije prost
		for(int i = 2; i < n; i++){
			if(n % i == 0 ){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// petlja prolazi sve brojeve od 0 do 100 000
		for(int i = 0; i < 100000; i++){
			// ako je broj prost, ispisujemo ga
			if(isPrime(i)){
				System.out.println(i + " ");
			}
		}
	}

}

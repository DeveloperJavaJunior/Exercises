package lekcija_6;

public class OcjeneZadatak {
	
	public static void ispisiOcjenu(double bodovi) {
		
		if(bodovi >= 91){
			System.out.println("Vasa ocjena je 10.");
		}else if(bodovi >= 81){
			System.out.println("Vasa ocjena je 9.");
		}else if(bodovi >= 71){
			System.out.println("Vasa ocjena je 8.");
		}else if(bodovi >= 61){
			System.out.println("Vasa ocjena je 7.");
		}else if(bodovi >= 51){
			System.out.println("Vasa ocjena je 6.");
		}else {
			System.out.println("Vasa ocjena je 5.");
		}
		
	}

	public static void main(String[] args) {
		
		double bodovi = 65.9;
		ispisiOcjenu(bodovi);

	}

}

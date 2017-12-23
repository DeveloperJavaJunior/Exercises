package lekcija_5;

public class BacanjeNovcica {

	public static void main(String[] args) {
		
		int brojacGlava = 0;
		int brojacPismo = 0;
		int novcic;
		
		for(int i = 0; i < 1000000; i++){
			novcic = (int) (Math.random() * 2);
			if(novcic == 0){
				brojacGlava++;
			}else{
				brojacPismo++;
			}
		}
System.out.println("Novcic je pao na glavu " + brojacGlava + " puta.");
System.out.println("Novcic je pao na pismo " + brojacPismo + " puta.");
	}

}



package lekcija_4;

public class MathPrimjer {

	public static void main(String[] args) {

		double prviBroj = 77;
		int drugiBroj = 7;
		int treciBroj = 14;

		// racunanje kvadratnog korjena
		double korijenBroja = Math.sqrt(prviBroj);

		// ispis korijena broja 77
		System.out.println("Korijen broja " + prviBroj + " inosi: " + korijenBroja);

		// ispis zaukruzenog izracunatog korijena
		System.out.println("Zaoukruzen broj " + korijenBroja + " iznosi: " + Math.round(korijenBroja));

		// racunanje kvadrata broja 7
		double kvadratBroja = Math.pow(drugiBroj, 2);
		System.out.println("kvadrat broja " + drugiBroj + " iznosi " + kvadratBroja);

		// poredenje broja 7 i broja 14 i ispis vece vrijednosti
		System.out.println("Sta je vece " + drugiBroj + " ili " + treciBroj + " ? " + Math.max(drugiBroj, treciBroj));

		// poredenje broja 7 i broja 14 i ispis manje vrijednosti
		System.out.println("Sta je manje " + drugiBroj + " ili " + treciBroj + " ? " + Math.min(drugiBroj, treciBroj));

	}

}

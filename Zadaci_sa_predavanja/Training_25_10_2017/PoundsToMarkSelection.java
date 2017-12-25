package training_25_10_2017;

/*
 *  @uthor Edin Korkic
 * 
 * Prepraviti program koji vrši konverziju funti u BAM tako da, ukoliko korisnike 
 * unese broj funti manji od nule, program izbaci grešku.Ukoliko broj koji korisnik 
 * unese nije manji od 0, program normalno izvršava konverziju. 
 * 
 */

import java.util.Scanner;

public class PoundsToMarkSelection {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print(" Unesite iznos funti koji želite pretvoriti u marke:");

		double funte = unos.nextDouble();

		unos.close();
		
		if(funte > 0){
		double bam = funte * 2.20;
		System.out.printf(" %.2f funti je %.2f maraka ", funte, bam);
		}else{
			System.out.printf(" Nije moguæe konvertovati u marke.");
		}


	}

}

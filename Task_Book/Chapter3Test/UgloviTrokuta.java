package lekcija3;

import java.util.Scanner;

public class UgloviTrokuta {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Ovaj program vam može izraèunati uglove trokuta,ako unesete duljine stranica ili koordinate vrhova.");
		System.out.println("Ako æete unositi duljine stranica unesite rijeè: stranice,a u suprotnom unesite: vrhovi. ");
		System.out.print("Unesite rijeè stranice ili vrhovi: ");
		String izbor=unos.next();
		izbor=izbor.toLowerCase();
		double a=0,b=0,c=0; //stranice trokuta
		double x1,y1,x2,y2,x3,y3;//koordinate vrhova
	    double p;//površina trokuta
		double ha;//visina spuštena na stranicu a
        double kutKodA,kutKodB,kutKodC;//uglovi trokuta
		double s;//poluopseg trokuta
		int counter=0;
	    switch (izbor){
	    
	    
	    //Ukoliko korisnik izabere vrhove prvo izraèunati stranice
	    case "vrhovi":
	        System.out.print("Unesite koordinate vrha A, x1 i y1:");
			x1=unos.nextDouble();
			y1=unos.nextDouble();
			System.out.print("Unesite koordinate vrha B, x2 i y2: ");
			x2=unos.nextDouble();
			y2=unos.nextDouble();
			System.out.print("Unesite koordinate vrha C, x3 i y3: ");
			x3=unos.nextDouble();
			y3=unos.nextDouble();
			a=Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
			b=Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
			c=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		 break;
		 //ako je izbor stranice uèitati unos stranica
	     case "stranice":
			System.out.print("Unesite duljinu stranice a: ");
			a=unos.nextDouble();
			System.out.print("Unesite duljinu stranice b: ");
			b=unos.nextDouble();
			System.out.print("Unesite duljinu stranice c: ");
	        c=unos.nextDouble();
	      break; 
	      default:System.out.print("Pogrešan unos!");
	       counter=1;
	   
	      }
	     
	      if(counter==0){
	     /*Izraèunati površinu 
	      *i pomoæu nje izraèunati visinu nastranicu a, tj ha
	      */
	      s=(a+b+c)/2;
	      p=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	      ha=(2*p)/a;
	      //sinus kuta kod vrha C sinC=ha/b, onda to ubaciti u asin, i pretvoriti u stepene
	      //analogno i za kut kod vrha B
	      kutKodC=Math.toDegrees(Math.asin(ha/b));
	      kutKodB=Math.toDegrees(Math.asin(ha/c));
		  kutKodA=180-kutKodC-kutKodB;
		  System.out.printf("Kut kod vrha A je: %4.2f,kut kod vrha B: je %4.2f,kut kod vrha C je: %4.2f",kutKodA,kutKodB,kutKodC);
		  }
	      else{
	    	  System.out.print("Ponovo pokrenite program i unesite iskljuèivo rijeè stranice ili vrhovi");
	      }
		
		
		

	}

}

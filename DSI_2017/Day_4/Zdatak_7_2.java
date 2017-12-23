package day_4;
import java.util.*;

public class Zdatak_7_2 {

	public static void main(String[] args) {
		
			Scanner unos=new Scanner(System.in);
			ArrayList<Integer> niz=new ArrayList<>();
			for(int i=0; i<10; i++){
			System.out.printf("%d. broj: ", i+1);
			int broj=unos.nextInt();
			if(niz.contains(broj)==false)
				niz.add(broj);	
			}
		System.out.printf("Unijeto je %d jedinstvenih brojeva a to su:\n",niz.size());
		for(int i=0; i<niz.size(); i++)
			System.out.println(niz.get(i));
			}
		}
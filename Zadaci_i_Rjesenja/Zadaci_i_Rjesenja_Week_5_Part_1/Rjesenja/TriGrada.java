package zadaci;

import java.util.Scanner;

public class TriGrada {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite tri grada: ");
		String prviGrad = unos.next();
		String drugiGrad = unos.next();
		String treciGrad = unos.next();

		unos.close();
		System.out.println("Gradovi prema abecednom redoslijedu: ");
		if (prviGrad.compareTo(drugiGrad) <= 0
				&& prviGrad.compareTo(treciGrad) <= 0) {
			if (drugiGrad.compareTo(treciGrad) < 0) {
				System.out.println(prviGrad + " " + drugiGrad + " " + treciGrad);
			} else {
				System.out.println(prviGrad + " " + treciGrad + " " + drugiGrad);
			}
		} else if (drugiGrad.compareTo(prviGrad) <= 0
				&& drugiGrad.compareTo(treciGrad) <= 0) {
			if (prviGrad.compareTo(treciGrad) < 0) {
				System.out.println(drugiGrad + " " + prviGrad + " " + treciGrad);
			} else {
				System.out.println(drugiGrad + " " + treciGrad + " " + prviGrad);
			}
		} else if (treciGrad.compareTo(prviGrad) <= 0
				&& treciGrad.compareTo(drugiGrad) <= 0) {
			if (prviGrad.compareTo(drugiGrad) < 0) {
				System.out.println(treciGrad + " " + prviGrad + " " + drugiGrad);
			} else {
				System.out.println(treciGrad + " " + drugiGrad + " " + prviGrad);
			}
		}
	}

}

package array_2D_exercises;

public class SumRowAndCol {

	public static void main(String[] args) {
		/**
		for (int kolona = 0; kolona < matrica[0].length; kolona++) {
int zbir = 0;
for (int red = 0; red < matrica.length; red++) {
zbir += matrica[red][kolona];
}
System.out.println("Zbir za kolonu " + kolona + " je " + zbir);
		 */
		/*__________________________________________*/
		/**
		 int najveciRed = 0;
int indeksNajvecegReda = 0;
for (int kolona = 0; kolona < matrica[0].length; kolona++) {
najveciRed += matrica[0][kolona];
}
for (int red = 1; red < matrica.length; red++) {
int zbirOvogReda = 0;
for (int kolona = 0; kolona < matrica[red].length; kolona++) {
zbirOvogReda += matrica[red][kolona];
}
if (zbirOvogReda > najveciRed) {
najveciRed = zbirOvogReda;
indeksNajvecegReda = red;
}
}
System.out.println("Red " + indeksNajvecegReda + " ima najveci zbir: " +
najveciRed);
		 */
		/*__________________________________________*/
		/**
		 public class OcjenjivanjeTestova {
public static void main(String[] args) {
// Odgovori studenata
char[][] odgovori = {
{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E','D'},
{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E','D'},
{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E','D'},
{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E','D'},
{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E','D'},
{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E','D'},
{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E','D'},
{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E','D'}
};
// kljuc tacnih odgovora
char[] kljuc = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
// pregledaj sve odgovore
for (int i = 0; i < odgovori.length; i++) {
// pregledaj odgovore individualnog studenta
int tacniOdgovori = 0;
for (int j = 0; j < odgovori[i].length; j++) {
if (odgovori[i][j] == kljuc[j])
tacniOdgovori++;
}
System.out.println("Student " + i + " je imao " + tacniOdgovori + "
tacnih odgovora.");
}
}
}
		 */
		

	}

}

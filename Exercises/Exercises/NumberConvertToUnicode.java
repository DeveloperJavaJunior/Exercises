import java.util.*;

//KONVERZIJA KARAKTERA U UNICODE
public class NumberConvertToUnicode {

	public static void main(String[] args) {
			
			Scanner unos=new Scanner(System.in);
			System.out.print("Unijeti karakter: ");
			char c=unos.next().charAt(0);
			System.out.printf(" \\u%04x",(int)c);

	}

}

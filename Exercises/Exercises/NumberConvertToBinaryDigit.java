import java.util.Scanner;

public class NumberConvertToBinaryDigit {
		
		//public class BinarniBroj16bita {
			public static String binarni(int broj){
				String b="";
				do{
					b+=broj%2;
					broj/=2;
				}while(broj>0);
				String b1="";
				for(int i=b.length()-1; i>=0; i--)
					b1+=b.charAt(i);
				String nule="";
				for(int i=0; i<16-b.length(); i++)
					nule=nule+"0";
				b1=nule+b1;
				return b1;
			}
				public static void main(String[] args) {
					Scanner unos=new Scanner (System.in);
					System.out.println("Unijeti broj:");
					int br=unos.nextInt();
					System.out.println(binarni(br));
				}
			}
	

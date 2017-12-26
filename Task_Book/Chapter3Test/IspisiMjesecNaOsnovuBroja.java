package Test;

public class IspisiMjesecNaOsnovuBroja {
	
	public static void main(String[] args) {
int month = (int)(Math.random() * 12) +1; 
		
		switch (month) 
		{
			case 1 : System.out.println("1 - januar.");break;
			case 2 : System.out.println("2 - februar.");break;
			case 3 : System.out.println("3 -  mart.");break;
			case 4 : System.out.println("4 - april.");break;
			case 5 : System.out.println("5 -  maj.");break;
			case 6 : System.out.println("6 - jun");break;
			case 7 : System.out.println("7 - jul");break;
			case 8 : System.out.println("8 - avgust.");break;
			case 9 : System.out.println("9 - septembar.");break;
			case 10 : System.out.println("10 - oktobar.");break;
			case 11 : System.out.println("11 - novembar.");break;
			case 12 : System.out.println("12 - decembar");break;		
		}
	  }	

}
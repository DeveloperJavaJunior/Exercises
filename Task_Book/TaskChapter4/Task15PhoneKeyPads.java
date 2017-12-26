import java.util.*;

public class Task15PhoneKeyPads {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a letter:");
		
		String s = input.nextLine();
		input.close();
		
		char ch = s.toLowerCase().charAt(0);
		int i;
		
		switch(ch){
		case 'a':
		case 'b':
		case 'c':
		i = 2;
		break;
		
		case 'd':
		case 'e':
		case 'f':
		i = 3;
		break;
	
		case 'g':
		case 'h':
		case 'i':
		i = 4;
		break;
	
		case 'j':
		case 'k':
		case 'l':
		i = 5;
		break;
		
		case 'm':
		case 'n':
		case 'o':
		i = 6;
		break;
	
		case 'p':
		case 'q':
		case 'r':
		case 's':
		i = 7;
		break;
		
		case 't':
		case 'u':
		case 'v':
		i = 8;
		break;
		
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		i = 7;
		break;
		
		default:
		i = 0;
		break;
		
		}
		if(i != 0){
		System.out.println(" The corresponding number is " + i);	
		
		}else{
			System.out.println(i + " is a invalid input.");	
		}

	}

}

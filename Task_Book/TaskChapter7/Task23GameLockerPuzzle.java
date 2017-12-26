
public class Task23GameLockerPuzzle {

	public static void main(String[] args) {
		boolean[] locker = new boolean[100];
		int j = 0;
		
		for(int i = 0; i < locker.length; i++){
			j = i;
			
			while(j < locker.length){
				locker[j] = !locker[j];
				j += i + 1;
			}
		}
		System.out.println(" The open lockers are:");
		
		for(int i = 0; i < locker.length; i++){
			if(locker[i] == true){
				System.out.print(i + " ");
				
			}
		}
	}

}

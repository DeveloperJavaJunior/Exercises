package array_2D;

public class Employee {

	public static void main(String[] args) {
		/*
		  		  Su M T W Th F Sa
		Employee 0 2 4 3 4 5  8 8
		Employee 1 7 3 4 3 3  4 4
		Employee 2 3 3 4 3 3  2 2
		Employee 3 9 3 4 7 3  4 1
		Employee 4 3 5 4 3 6  3 8
		Employee 5 3 4 4 6 3  4 4
		Employee 6 3 7 4 8 3  8 4
		Employee 7 6 3 5 9 2  7 9

		 */

		String[][] employee ={{"          ","Su","M","T","W","Th","F","Sa"},
							  {"Employee 0", "2","4","3","4","5","8","8"},
							  {"Employee 1", "2","4","3","4","5","8","8"},
							  {"Employee 2", "2","4","3","4","5","8","8"},
							  {"Employee 3", "2","4","3","4","5","8","8"},
							  {"Employee 4", "2","4","3","4","5","8","8"},
							  {"Employee 5", "2","4","3","4","5","8","8"},
							  {"Employee 6", "2","4","3","4","5","8","8"},
							  {"Employee 7", "2","4","3","4","5","8","8"}};
							
		for(int i = 0; i < employee.length; i++){
			for(int j = 0; j < employee[i].length; j++){
		System.out.printf(" %2s ",employee[i][j]);
		}
	System.out.printf("\n");

		}
	}
}



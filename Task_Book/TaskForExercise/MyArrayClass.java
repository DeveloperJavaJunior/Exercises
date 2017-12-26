package Task_For_Exercise;




public class MyArrayClass {
	
	private int[] array;
	private int smallest;
	private int largest;
	private int sum;


public static void main(String[] args) {
		
		// Declare circleArray
		 MyArrayClass[] myArray;
		
		 // Create circleArray
		 myArray = createNewArray();
		
		 // Print circleArray and total areas of the circles
		 printMyArray(myArray);
}
		 public MyArrayClass(double d) {
			 // TODO Auto-generated constructor stub
		 }
		
		/** Create an array of Circle objects */
		 public static  MyArrayClass[] createNewArray() {
			 MyArrayClass[] myArray = new MyArrayClass[5];
		
		 for (int i = 0; i < myArray.length; i++) {
		 myArray[i] =  new  MyArrayClass(Math.random() * 100);
		
		 }
		 
		 // Return Circle array
		 return myArray;
		 }
		

			

			

				MyArrayClass[] myArray;
				
			
				
			}

			class MyArray {

				public MyArray(double d) {

					d = d;
				}

				public int getSmallestElement(int[] array) {

					smallest = array[0];
					for (int n : array) {
						if (n < smallest) {
							n = smallest;
						}
					}

					return smallest;
				}

				public int getLargestElement(int[] array) {

					largest = Math.abs(array[0]);

					for (int i = 0; i < array.length; i++) {
						if (Math.abs(array[i]) > largest) {
							largest = Math.abs(array[i]);

						}
					}

					return largest;

				}

				public int sumAllElements(int[] array) {

					int sum = 0;
					for (int i = 0; i < array.length; i++) {
						sum += array[i];

					}

					return sum;

				}

				public void printAllElements(MyArrayClass[] myArray) {

					MyArrayClass[] createMyArray = new MyArrayClass[0];
					for (int i = 0; i < myArray.length; i++) {
						System.out.printf(" Array is %d ",myArray);
					}

				}
			}}
		 /** Print an array of circles and their total area */
		 public static void printMyArray(
				 MyArrayClass[] myArray) {
		 for (int i = 0; i < myArray.length; i++) {
			 System.out.println(myArray);
			 
		 }}}
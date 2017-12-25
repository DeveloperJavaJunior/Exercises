
public class SelectoinInsertionBubbleSort {

	public static void main(String[] args) {

	}

	public static void selectionSort(int[] arr) {
		// find the smallest element starting from position i
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i; // record the position of the smallest
			for (int j = i + 1; j < arr.length; j++) {
				// update min when finding a smaller element
				if (arr[j] < arr[min])
					min = j;
			}

			// put the smallest element at position i
			swap(arr, i, min);
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			// a temporary copy of the current element
			int tmp = arr[i];
			int j;
			// find the position for insertion
			for (j = i; j > 0; j--) {
				if (arr[j - 1] < tmp)
					break;
				// shift the sorted part to right
				arr[j] = arr[j - 1];
			}
			// insert the current element
			arr[j] = tmp;
		}
	}

	public static void bubbleSort(int[] data) {
		for (int i = data.length - 1; i >= 0; i--) {
			// bubble up
			for (int j = 0; j <= i - 1; j++) {
				if (data[j] > data[j + 1])
					swap(data, j, j + 1);
			}
		}
	}
	public static void mergeSort(int[] data, int first, int last)
	{
	    if (first >= last)
	        return;
	    int mid = (first + last) / 2;
	 
	    mergeSort(data, first, mid);      // sort the left half
	    mergeSort(data, mid + 1, last);   // sort the right half
	 
	    merge(data, first, last);         // merge two sorted subarrays
	}
	public static void merge(int[] data, int first, int last)
	{
	    // A new array to hold the merged result
	    int[] temp = new int[last - first + 1];
	 
	    int mid = (first + last) / 2;
	    int i = first, j = mid + 1, k = 0;
	 
	    // Copy smaller item from each subarray into temp until one
	    // of the subarrays is exhausted
	    while (i <= mid && j <= last)
	    {
	        if (data[i] < data[j])
	            temp[k++] = data[i++];
	        else
	            temp[k++] = data[j++];
	    }
	 
	    // Copy remaining elements from first subarray, if any
	    while (i <= mid)
	        temp[k++] = data[i++];
	 
	    // Copy remaining elements from second subarray, if any
	    while (j <= last)
	        temp[k++] = data[j++];
	 
	    // Copy the result back into original array
	    for (i = first; i <= last; i++)
	        data[i] = temp[i - first];
	}
	public static void merge1(int[] data, int first, int last)
	{
	    int mid = (first + last) / 2;
	    int i = first, j = mid + 1;
	    int len = last - first + 1;
	    int[] temp = new int[len];      // Temporary storage
	 
	    for (int k = 0; k < len; k++)
	    {
	        if (i == mid + 1)           // The left part is done
	            temp[k] = data[j++];
	        else if (j == last + 1)     // The right part is done
	            temp[k] = data[i++];
	        else if (data[i] < data[j]) // Get one from the left
	            temp[k] = data[i++];
	        else                        // Get one from the right
	            temp[k] = data[j++];
	    }
	 
	    // Copy merged part back into the original array
	    /**	for (i = first; i &lt;= last; i++) */
	    for (i = first; i <= last; i++)
	    data[i] = temp[i - first];
	}
	public static void quickSort(int[] data, int first, int last)
	{
	    if (first >= last)
	        return;
	 
	    int pivot = partition(data, first, last);
	    quickSort(data, first, pivot - 1); // sort the left part
	    quickSort(data, pivot + 1, last); // sort the right part
	}
	
	public static int partition(int[] data, int first, int last)
	{
	    int[] temp = new int[last - first + 1];
	    int pivot = data[first];
	    int i = 0, j = last - first, k;
	 
	    for (k = first + 1; k <= last; k++)
	    {
	        if (data[k] <= pivot)
	            temp[i++] = data[k];
	        else
	            temp[j--] = data[k];
	    }
	    temp[i] = data[first];
	 
	    // Copy data back into original array
	    for (k = first; k <= last; k++)
	        data[k] = temp[k - first];
	    return first + i;
	}
	public static int partition1(int[] data, int first, int last)
	{
	    int pivot = data[first];
	    int left = first, right = last;
	 
	    while (left < right)
	    {
	        // Find an element bigger than the pivot from the left
	        while (data[left] <= pivot && left < right)
	            left++;
	        // Find an element smaller than the pivot from the right
	        while (data[right] > pivot)
	            right--;
	        // Swap the two elements found
	        if (left < right)
	            swap(data, left, right);
	    }
	 
	    // move the pivot element to the middle
	    swap (data, first, right);
	    return right;
}}

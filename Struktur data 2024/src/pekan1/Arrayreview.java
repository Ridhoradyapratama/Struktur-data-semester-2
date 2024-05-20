package pekan1;

public class Arrayreview {
	public static void main(String[] Args) {
		// declares an Array of integers.
		int[] arr;
		// allocating memory for 5 integers.
		arr = new int[5];
		
		// initialize the firs elements of the array
		arr[0] = 10;
		
		// initilize the second elements of the array
		arr[1] = 20;
		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// accessing the elements of the specificied array
		for (int i = 0; i < arr.length;i++)
		System.out.println("Element at index" + i +":"+arr[i]);
			
	}

	}


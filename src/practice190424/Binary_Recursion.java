package practice190424;

public class Binary_Recursion {
	
	private static int[] arr = {1, 2, 3, 4, 5, 6, 7};

	public static void main(String[] args) {

		int start = 0;
		int end = arr.length;
		
		binary(arr, 1, start, end);
		binary(arr, 5, start, end);
		binary(arr, 10, start, end);
		
	}
	
	private static int binary(int[] arr, int findNumber, int start, int end) {
		
		int middle = (start + end) / 2;
		
		if(start > arr.length - 1 || end < 0) {
			System.out.println("Element doesn't exist");
			return -1;
		}
		else if(arr[middle] == findNumber) {
			System.out.println("Element exists");
			return 1;
		}
		else {
			
			if(arr[middle] > findNumber) {
				return binary(arr, findNumber, start, end-1);
			}
			else if(arr[middle] < findNumber) {
				return binary(arr, findNumber, start+1, end);
			}
			else {
				System.out.println("Element exists");
				return 1;
			}
		}
		
	}

}

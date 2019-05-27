package practice190422;

public class BinarySearch_Interation {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		binary(arr, 12);

	}
	
	static boolean binary(int[] arr, int findNumber) {
		
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		
		while(start <= end) {
			
			if(arr[mid] > findNumber) {
				end -= 1;
			} 
			else if (arr[mid] == findNumber) {
				System.out.println("The number you find exists in the array");
				return true;
			}
			else {
				start += 1;
			}
			
			mid = (start + end) / 2;
			
		}
		
		System.out.println("False");
		return false;
		
	}

}

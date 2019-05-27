package practice190426;

public class Binary_iteration {
	
	private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	public static void main(String[] args) {
		binary(arr, 11);
	}
	
	private static boolean binary(int[] arr, int findNumber) {
		
		int start = 0;
		int end = arr.length;
		int middle = (start + end) / 2;
		
		while(start < end) {
			if(arr[middle] == findNumber) {
				System.out.println("Exist");
				return true;
			}
			else if (arr[middle] > findNumber) {
				end -= 1;
			}
			else {
				start += 1;
			}
			middle = (start + end) / 2;
		}
		System.out.println("Doesn't exist");
		return false;
		
	}

}

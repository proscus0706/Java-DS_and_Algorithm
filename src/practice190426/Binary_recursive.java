package practice190426;

public class Binary_recursive {

	private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public static void main(String[] args) {
		
		binary(arr, 0 , 0, arr.length - 1);

	}	
	
	private static int binary(int[] arr, int findNumber, int start, int end) {
		
		int middle = (start + end) / 2;
		
		if(arr[middle] == findNumber) {
			System.out.println("exist");
			return 1;
		} 
		else if(start > arr.length - 1 || end < 0) {
			System.out.println("doesn't exist");
			return -1;
		}
		else {
			
			if(arr[middle] > findNumber) {
				end -= 1;
				return binary(arr, findNumber, start, end);
			}
			else if(arr[middle] < findNumber) {
				start += 1;
				return binary(arr, findNumber, start, end);
			}
			else {
				System.out.println("exist");
				return 1;
			}
			
		}
		
	}

}

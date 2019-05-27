package practice190423;

public class Binary_Recursive {

	private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public static void main(String[] args) {
		
		recursive(arr, 0, arr.length - 1, 3);
		recursive(arr, 0, arr.length - 1, 20);
		
	}
	
	private static int recursive(int[] arr, int start, int end, int findNumber) {
		
		int middle = (start + end) / 2;
		
		//종료조건. 숫자를 찾거나 숫자가 범위가 넘어서거
		if(arr[middle] == findNumber) {
			System.out.println("숫자가 존재합니다.");
			return findNumber;
		}
		else if(start > arr.length - 1|| end < 0) {
			System.out.println("숫자가 존재하지 않습니다.");
			return -1;
		} 
		//반복조건
		else {
			
			if(arr[middle] > findNumber) {
				return recursive(arr, start, end - 1, findNumber);
			} 
			else {
				return recursive(arr, start + 1, end, findNumber);
			}
			
			
			
		}
		
	}

}

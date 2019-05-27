package practice190424;

public class Binary_Iteration {

	private static int[] arr = {1, 2, 3, 4, 5, 6, 7};
	
	public static void main(String[] args) {
		
		//어레이, 찾고자하는 숫자
		//start, end, middle
		
		binary(arr, 1);
		binary(arr, 3);
		binary(arr, 9);

	}
	
	private static boolean binary(int[] arr, int findNumber) {
		
		int start = 0;
		int end = arr.length;
		int middle = (start + end) / 2;
		
		while(start < end) {
			
			if(arr[middle] == findNumber) {
				System.out.println("element가 존재합니다.");
				return true;
			}
			else if(arr[middle] > findNumber) {
				end -= 1;
			}
			else {
				start +=1;
			}
			
			middle = (start + end) / 2;
			
		}
		
		System.out.println("element가 존재하지 않습니다.");
		return false;
		
	}

}

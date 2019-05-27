package practice190424;

public class Biggest_Recursive {

	private static int[] arr = {1, 34, 56, 76, 23, 543, 545, 12, 7};
	
	public static void main(String[] args) {
		
		System.out.println(findTheBiggest(arr, arr.length));

	}
	
	private static int findTheBiggest(int[] arr, int n) {
		
		//종료조건
		if(n == 0) {
			return arr[0]; 
		}
		//작업조건 
		else {
			return Math.max(arr[n-1], findTheBiggest(arr, n-1)); //본질적으로는 어레이를 계속 왼쪽으로 밀면서 최대값을 가진다.
		}
		
		
	}

}

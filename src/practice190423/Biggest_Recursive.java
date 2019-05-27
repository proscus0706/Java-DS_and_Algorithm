package practice190423;

public class Biggest_Recursive {
	
	private static int[] arr = {1, 4, 3, 532, 234, 65, 1234, 564, 234, 616, 43}; 
	
	public static void main(String[] args) {
		
		int max = findTheBiggest(arr, arr.length);
		System.out.println(max);
		
		
	}
	
	private static int findTheBiggest(int[] arr, int n) {
		
		if(n == 1) //어레이에 element가 하나밖에 없다면 굳이 비교하지 않아도 최대값임을 알 수 있으므로.
			return arr[0];
		return Math.max(arr[n-1], findTheBiggest(arr, n-1));
		
	}
	
}

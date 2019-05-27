package big0;

public class Recursive {
	
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {

		
		
		int[] arr = {1, 4, 7, 8, 3, 74, 56, 12};
		iteration(arr);//잘 작동한다.
		System.out.println(recursive(arr, arr.length - 1, max));
		
	}
	
	//iteration
	public static int iteration(int[] array) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
		
		return max;
		
	}
	
	//recursive 
	public static int recursive(int[] array, int n, int max) {
		
		//종료조건
		if(n == -1) {
			return max;
		}
		//반복조건 
		else {
			
			if(array[n] > max) {
				max = array[n];
			}
		
			return recursive(array, n - 1, max);
			
		}
		
	}
	

}

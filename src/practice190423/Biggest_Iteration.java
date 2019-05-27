package practice190423;

public class Biggest_Iteration {

	private static int[] arr = {1, 4, 3, 532, 234, 65, 1234, 564, 234, 616, 43}; 
	
	public static void main(String[] args) {
		
		findTheBiggest(arr);
		
	}
	
	private static void findTheBiggest(int[] arr) {
		
		int biggest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > biggest) {
				biggest = arr[i];
			}
			
		}
		
		System.out.println("가장 큰 숫자는 "  + biggest);
		
	}

}

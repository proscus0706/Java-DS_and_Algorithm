package practice190421;

public class LargestNumber_recursive {
	
	static int largest_number = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		int[] array =  {1, 2, 4, 6, 32, 1341, 42, 76 };
		
		getTheLargest(array, array.length - 1);
	}
	
	public static int getTheLargest(int[] array, int n) {
		
		if(n==-1) {
			System.out.println(largest_number); 
			return largest_number;
		} 
		else {
			
			if(array[n] > largest_number) {
				largest_number = array[n];
			}
			return getTheLargest(array, n-1);
		}
		
	}

}

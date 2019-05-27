package practice190421;

public class LargestNumber_Itaration {
	
	public static void main(String[] args) {
		
		int[] array = {1, 4, 63, 765, 25, 7, 86};
		
		getTheLargest(array);
			
	}
	
	public static int getTheLargest(int[] array) {
		
		int largest_number=Integer.MIN_VALUE; //Time Complexity - O(1)
		
		
		for(int i=0; i<array.length;i++) {
			if(array[i] > largest_number) {
				largest_number = array[i]; 
			}
		}//Time Complexity - O(n) 
		System.out.println(largest_number); //Time Complexity - O(1)
		return largest_number; //O(1)
		
		//O(1) + O(n) + O(1) + O(1) = O(n)
		
	}

}

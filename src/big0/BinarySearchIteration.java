package big0;

public class BinarySearchIteration {
	
	private static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	
	public static void main(String[] args) {
		
		binary_iteration(array, 1);
		binary_iteration(array, 16);
		
	}
	
	public static boolean binary_iteration(int[] arr, int findNumber) {
		
		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;
		
		while(first <= last) {
			
			if(arr[mid] < findNumber){
				first += 1;
			}
			else if(arr[mid] == findNumber){
				System.out.println(findNumber);
				return true;
			}
			else {
				last -= 1;
			}
			
			mid = (first + last) / 2;
			
		}
		System.out.println("The number you are looking for doesn't exist in this array");
		return false;
	}

}

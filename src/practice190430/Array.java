package practice190430;

public class Array {
	
	private int[] arr;
	
	public Array(int sizeOfArray) {
		
		arr = new int[sizeOfArray];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		
	}
	
	//traverse O(n)
	public void traverse() {
		
		try {
			
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
		} catch(Exception e) {
			System.out.println("Invalid");
		}
		
	}
	
	//insert O(1)
	public void insert(int cellNumber, int value) {
		
		try {
			
			if(arr[cellNumber] == Integer.MIN_VALUE) {
				arr[cellNumber] = value;
			} 
			else {
				System.out.println("It's already occupied");
			}
			
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Index");
		}
		
		
	}
	
	//access O(1)
	public void access(int cellNumber) {
		try {
			System.out.println(arr[cellNumber]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Index");
		}
	}
	
	//search O(n)
	public void search(int value) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == value) {
				System.out.println(arr[i]);
			}
		}
	}
	
	//delete O(1)
	public void delete(int cellnumber) {
		
		try {
			arr[cellnumber] = Integer.MIN_VALUE;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Index");
		}
		
	}
	
	
}

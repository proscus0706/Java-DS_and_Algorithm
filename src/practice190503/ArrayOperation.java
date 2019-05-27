package practice190503;

public class ArrayOperation {
	
	private int[] arr = null;
	
	//DTIASD - Declare, Traverse, Insert, Access, Search, Delete
	public ArrayOperation(int sizeOfArray) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		
	}
	
	public void traverse() {
		
		try {
			for(int i=0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		catch(Exception e) {
			System.out.println("Invalid");
		}
		
	}
	
	public void insert(int cellNumber, int newValue) {
		
		try {
			if(arr[cellNumber] == Integer.MIN_VALUE) {
				arr[cellNumber] = newValue;
			}
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
		}
		
	}
	
	public void access(int cellNumber) {
		
		try {
			System.out.println(arr[cellNumber]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
		}
		
	}
	
	public void search(int value) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == value) {
				System.out.println(arr[i]);
			}
		}

	}

	public void delete(int cellNumber) {
		
		try {
			arr[cellNumber] = Integer.MIN_VALUE;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
		}
		
	}
	
}

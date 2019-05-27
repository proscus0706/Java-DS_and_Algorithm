package practice190429;

public class ArrayOperation {

	private int[] arr;
	
	//The creation of Array
	public ArrayOperation(int sizeOfTheArray) {
		
		arr = new int[sizeOfTheArray];
		for(int i = 0; i < sizeOfTheArray; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		
	}
	
	//Traverse - just exception
	public void traverse() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//Insert 
	//1. check if the cell number is occupied
	//2. out of index
	public void insert(int cellNumber, int insert) {
		
		try {
			if(arr[cellNumber] == Integer.MIN_VALUE) {
				arr[cellNumber] = insert;
			} else {
				System.out.println("Already occupied");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid");
		}
		
	}
	
	//Access
	//1. valid cell 
	public void access(int cellNumber) {
		try {
			System.out.println(arr[cellNumber]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid");
		}
	}
	
	//Search
	public void search(int value) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				System.out.println("It exists");
			}
			else {
				System.out.println("It doesn't exist");
			}
		}
	}
	
	//Delete
	//out of index
	public void delete(int cellNumber) {
		
		try {
			if(arr[cellNumber] != Integer.MIN_VALUE) {
				arr[cellNumber] = Integer.MIN_VALUE;
			}
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid");
		}
		
	}
		
}

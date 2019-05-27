package practice190427;

public class SingleDimensionArray {
	int arr[] = null; //declare
	
	// Constructor - Declare
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray]; //instantiate
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE; //initialize
		}
	}
	
	// Print the array - Traverse
	public void traverseArray() {
		//traverse
		//1. 어레이 크기가 범위를 넘어서는지 확인.
		try {
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + " ");
			}
		} 
		catch(Exception e) {
			System.out.println("Array no longer exists!");
		}
	} 
	//Time Complexity O(n)
	//Space Complexity O(1)
	
	
	// Insert value in the Array
	public void insert(int location, int valueToBeInserted) {
		//insertion
		//1. 넣고자 하는 index가 occupied 인지 확인. 
		//2. 어레이 크기가 범위를 넘어서는지 확인. 
		try {
		
			if(arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Successfully inserted " + valueToBeInserted + " at location: " + location);
			} 
			else {
				System.out.println("This cell is already occupied by antther value.");
			}
		
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array! ");
		}
	}
	
	// Access a particular element of an array
	public void accessingCell(int cellNumber) {
		//access
		//1.어레이 크기가 범위를 넘어서는지 확인.
		try {
			System.out.println(arr[cellNumber]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");
		}
		
	}
	
	// Search for an element in the given Array
	public void searchInAnArray(int valueToSearch) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == valueToSearch) {
				System.out.println("Value found !");
				System.out.println("Index of " + valueToSearch + " is: " + i);
				return;
			}
		}
		System.out.println(valueToSearch + " is not found!");
	}
	
	// Delete value from given Array
	public void deleteValueFromArray(int deleteValueFromThisCell) {
		
		try {
		arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Cant delete the value as Cell# provided is not in the range of array !");
		}
	}
	
}

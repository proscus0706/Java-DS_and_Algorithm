package practice190513;

public class TwoDimensionalArray {
	
	int[][] array = null;
	
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		array = new int[numberOfRows][numberOfColumns];
		for(int row=0;row<array.length;row++) {
			for(int col=0;col<array[col].length;col++) {
				array[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	public void traverseTwoDimensionalArray() {
		try {
			for(int row=0;row<array.length;row++) {
				for(int col=0;col<array[0].length;col++) {
					System.out.print(array[row][col]);
				}
				System.out.println();
			}
		} catch(Exception e) {
			System.out.println("No valid array exists");
		}
	}
	
	public void insertValue(int row, int col) {
		try {
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bounds");
		}
	}
	
}

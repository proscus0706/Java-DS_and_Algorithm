package array;

public class TwoDimensionalArrayMain {
	
	public static void main(String[] args) {
		
		System.out.println("Creating a blank array of size 5x5...");
		TwoDimensionalArray sda = new TwoDimensionalArray(5, 5);
		sda.traverseArray();
		
		sda.insertValueInTheArray(0, 2, 123);
		sda.traverseArray();
		
		sda.insertValueInTheArray(0, 2, 122);
		sda.traverseArray();
		
		sda.accessSingleCell(0, 2);
		sda.accessSingleCell(5, 2);
		sda.accessSingleCell(2, 2);
		
		sda.searchingSingleValue(123);
		sda.searchingSingleValue(-214783648);
		sda.searchingSingleValue(1000000001);
		
		sda.deleteValueFromArry(0, 2);
		sda.traverseArray();
		
		sda.deleteThisArray();
		sda.traverseArray();
		
	}

}

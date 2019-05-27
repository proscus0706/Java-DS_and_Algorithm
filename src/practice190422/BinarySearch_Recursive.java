package practice190422;

public class BinarySearch_Recursive {

	private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	
	public static void main(String[] args) {
		
		binary(arr, 0, arr.length-1, 20);
		
	}
	
	//재귀함수
	//종료조건
	//작업조건
	private static int binary(int[] arr, int start, int end, int findNumber) {
		
		int mid = (start + end) / 2;
		
		//Base Condition
		//종료조건 
		//1 - 숫자를 찾는다. -- start나 end가 음수가 되기 전 -- 어차피 값이 존재한다면 무조건 음수가 되기 전에 찾는다. 
		//2 - 숫자를 못찾는다. -- start나 end가 둘중 하나가 음수가 된다.
		
		if(arr[mid] == findNumber) {
			//숫자를 찾음.
			System.out.println("값이 존재한다.");
			return arr[mid];	
		}	
		
		if(start > arr.length - 1 || end < 0) {
			System.out.println("값이 존재하지 않는다.");
			return -1; // -1 프로그래밍에서 전통적으로 존재하지 않는 값을 의미. 
		}
		//Operation
		//조건에 따라서 start와 end값을 다르게 주자.
		else 
		{
			if(arr[mid] > findNumber) {
				return binary(arr, start, end - 1, findNumber);
			}
			else if(arr[mid] < findNumber){
				return binary(arr, start + 1, end, findNumber);
			}
			else {
				return -1;
			}
		}	
		
	}
	
	

}

package recursive;

public class Practice3 {
	//피보나치 수열
	public static void main(String[] args) {
		
		System.out.println(fibonnaci(10));
		
	}
	
	static int fibonnaci(int n) {
		//기본조건 - 끝날 조건. 
		if(n == 1 || n == 2) 
			return 1; 
		else
			//피보나치 수열을 일반화한식
			return fibonnaci(n - 1) + fibonnaci(n - 2);
	}

}

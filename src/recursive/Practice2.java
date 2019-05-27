package recursive;

public class Practice2 {

	public static void main(String[] args) {
		
		//팩토리
		System.out.println(factorial(10));
		

	}
	
	static int factorial(int n) {
		
		//ending or base condition
		if(n==0) //n이 0일 때 멈추자. 
			return 1;
		else 
			//아니라면 로직을 진행한다.
			System.out.println(n); //함수를 호출하기 전이기 때문에 10, 9, 8, 7, 6, 5, 4, 3, 2 순서로출력될 것이다. 
			int newValue = factorial(n-1) * n; 
			System.out.println(n); //이건 stack 구조의 영향을 받기떄문에 last in first out이 적용되었다.즉 오름차순으로 출력될 것이다. 
			return newValue;
		
			
	}

}

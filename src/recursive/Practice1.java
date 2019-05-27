package recursive;

public class Practice1 {

	public static void main(String[] args) {
		
		num(10);

	}
	
	static void num(int n) {
		
		//base condition 
		//In other words, ending condition
		if(n==0)
			return;
		else
			System.out.println("Hello World " + n);  //하지만 여기다가 출력하면 10,9,8,7.. 순서대로 출력된다. 
			num(n-1);
			System.out.println("Hello World " + n); //여기다가 출력하면 1,2,3,4,.. 순서대로 출력되는 것을 확인할 수 있다. 
	}
	
	// LIFO, Last in First out. 
	
	

}

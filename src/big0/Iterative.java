package big0;

public class Iterative {

	public static void main(String[] args) {
		
		//빅5를 계산하
		
		int[] random_numbers = {1, 5, 7, 8, 25, 14, 78, 123};
		int largest_number = 0; //o(1)
		
		for(int i = 0; i < random_numbers.length; i++) {
			if(random_numbers[i] > largest_number) {
				largest_number = random_numbers[i];//o(1)
			}
		}
		//for loop 전체 o(n)  -- 정렬되지 않은 어레이므로 big0의 값은 o(n)
		
		//빅5 계산 o(1) + o(n) +forloop만큼 o(1) = o(n) 
		
		System.out.println(largest_number);

	}
}

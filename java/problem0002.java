import java.util.ArrayList;

public class problem0002{
	public static void main(String[] args){
		int fib = 0;
		int sum = 0;
		int n = 0;
		ArrayList<Integer> fibList = new ArrayList<Integer>(0);
		while(fib < 4000000){
			fib = fibonacci(n, fibList);
			fibList.add(fib);
			if(fib%2 == 0){
				sum+=fib;
			}//end if
			n++;
		}//end while
		System.out.println("The sum of all even Fibonacci terms under four million is: " + sum);
	}//end main

	public static  int fibonacci(int n, ArrayList<Integer> fibList){
		if(n == 0 || n == 1){
			return 1;
		} else {
			return fibList.get(n-1) + fibList.get(n-2);
		}//end if
	}//end fibonacci
}//end problem0002

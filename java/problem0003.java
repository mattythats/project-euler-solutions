import java.util.ArrayList;
import java.util.Comparator;

public class problem0003{
	public static void main(String[] args){
		long n = 600851475143L;
		ArrayList<Long> factors = factor(n);
		System.out.println(factors);
	} //end main

	public static ArrayList<Long> factor(long n){
		ArrayList<Long> factors = new ArrayList<Long>(0);
		long sqrt = Double.valueOf(Math.sqrt(n)).longValue();
		for(long i = 1; i <= sqrt; i++){
			if(n%i == 0){
				factors.add(i);
				factors.add(n/i);
			}//end if
		}//end for
		factors.sort(new NumberSort());
		return factors;
	}//end factor

	public static boolean isPrime(int n){
		if(n%2 == 0){
			return false;
		}
	}
}//end problem0003

//sorts in reverse order
class NumberSort implements Comparator<Long>{
	public int compare(Long l1, Long l2){
		if(l1 < l2){
			return 1;
		} else if(l1 > l2){
			return -1;
		} else {
			return 0;
		}
	}//end compare
}//end comparator

public class problem0003{
	public static void main(String[] args){
		long init = 600851475143L;
		long n = init;
		long primeFactor = 3;
		while(n != primeFactor){
			if(isPrime(primeFactor) && n%primeFactor == 0){
				n/=primeFactor;
				primeFactor = 1;
			}
			primeFactor+=2;
		}
		System.out.printf("The largest prime factor of %d is %d\n", init, n);
	} //end main

	public static boolean isPrime(long n){
		if(n%2 == 0){
			return false;
		}
		long div = 3L;
		long sqrt = 1+Double.valueOf(Math.sqrt(n)).longValue();
		while(n%div != 0 && div < sqrt){
			div+=2;
		}
		if(div < sqrt){
			return false;
		}
		return true;
	}
}//end problem0003

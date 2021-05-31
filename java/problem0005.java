public class problem0005{
	public static void main(String[] args){
		long result = 1*5*7*11*13*17*19*16*9L; //some primes under 20 and some other stuff
		int divisor = 3; //result has to be even so we can start checking at 3
		while(divisor < 21){
			if(result%divisor == 0){
				divisor++;
			} else {
				System.out.printf("%d failed on %d\n", result, divisor);
				result+=2;
				divisor = 3;
			}//end if
		}//end while
		System.out.println("The smallest positive number that is evenly divisible by all numbers 1-20 is " + result);
	}//end main
}//end problem0005

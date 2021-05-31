public class problem0006{
	public static void main(String[] args){
		int summedSquares = 0;
		int squaredSum = 0;
		for(int i = 1; i <= 100; i++){
			summedSquares+=Math.pow(i,2);
			squaredSum+=i;
		}
		squaredSum = (int) Math.pow(squaredSum,2);
		int diff = squaredSum - summedSquares;
		System.out.println("The sum square difference of the first 100 natural numbers is " + diff);
	}//end main
}//end problem0006

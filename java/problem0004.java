public class problem0004{
	public static void main(String[] args){
		int result = 1;
		int i = 999, j = 999;
		int maxI = 0, maxJ = 0;
		while(i > 99){
			j = 999;
			while(j > 99){
				int palTest = i*j;
				String  palTestStr = String.valueOf(palTest);
				String revPalTest = reverse(palTestStr);
				System.out.printf("palTest %d\tpalTestStr %s\trevPalTest %s\n", palTest, palTestStr, revPalTest);
				if(palTestStr.equals(revPalTest)){
					if(palTest > result){
						maxI = i;
						maxJ = j;
					}
					result = Math.max(result, palTest);
				}
				j--;
			}//end j while
			i--;
		}//end i while
		System.out.printf("Max 3-digit product palindrome: %d (%d*%d)\n", result, maxI, maxJ);
	}//end main
	
	public static String reverse(String s){
		String r = "";
		for(int i = s.length()-1; i >= 0; i--){
			r+=s.charAt(i);
		}//end for
		return r;
	}//end reverse

}//end problem0004

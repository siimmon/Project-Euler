package LargestPalindrome;

public class largestPalindrome {
	public static void main(String[] args)	{
		int max = 0;
		int first = 0;
		int second = 0;
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				if (isPalindrome(i*j) && i*j > max) {
					max = i*j;
					first = i;
					second = j;
				} 
				
			}
		}
		System.out.println(max + " " + first +" "+second);
	}
	
	public static boolean isPalindrome (int n) {
		String forward = Integer.toString(n);
		String backward = "";
		
		for (int i = forward.length()-1; i >= 0; i--) {
			backward = backward+forward.charAt(i);
		}
		
		return (forward.equals(backward));
		
	}
}


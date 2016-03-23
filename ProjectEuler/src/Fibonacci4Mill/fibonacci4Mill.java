package Fibonacci4Mill;

public class fibonacci4Mill {
	public static void main(String[] args)	{
	int n = 0;
	int sum = 0;
	
	while (fibonacci(n) < 610) {
	n += 1;
	}
	 
	for (int i = 0; i < n; i++) {
	 if (fibonacci(i) % 2 == 0) {
	 sum += fibonacci(i);
	 }
	}
	
	System.out.println(n);
	}
	
	public static int fibonacci(int n) {
	  if (n <= 1) return n;
	  
	  return (fibonacci(n-2)+fibonacci(n-1));
	}
}


import java.util.*;
public class FibonacciWithRecursion {

	public static void main(String a[]) {
		
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print(" Enter Number:");
		 n=s.nextInt();
		 System.out.println(" Fibonacci series upto "+n+ "Numbers Using Recursion:");
		 for(int i = 0; i < n; i++){
				System.out.print(fibonacci(i) +" ");
			}
		
;	}

	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
		return 1;
		else
			return fibonacci(n-2)+fibonacci(n-1);
	}
}

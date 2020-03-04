import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=s.nextInt();
		int a=1,b=1,c;
		System.out.println(" Fibonacci Series upto "+n+" numbers:");
		for(int i=0;i<n;i++) {
			if(i==0 || i==1) {
				System.out.print(" "+1);
			}else {
			c=a+b;
			System.out.print(" "+ c);
			a=b;
			b=c;
			
		}
		}
	}

}

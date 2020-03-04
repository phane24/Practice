import java.util.*;

public class Prime {
	
	@SuppressWarnings("resource")
	public static void main(String a[]) {
		
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(int i=2;i<n;i++) {
			int count=0;
			for(int j=1;j<n;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(" "+i);
			}
		}
		
	}

}

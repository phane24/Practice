import java.util.*;
public class LeftRotatin {
	
	public static void main(String args[]) {
		
		int [] a = new int [] {1, 2, 3, 4, 5};   
		int n;
		Scanner s= new Scanner(System.in);
		
		System.out.println(" Orginal Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.println(" Enter the Number you want to rotate the elements; ");
		n=s.nextInt();
		for(int i=0;i<n;i++) {
			int temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println(" Array afer left Rotation");
	
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}
}

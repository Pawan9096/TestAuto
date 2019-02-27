package omy;
import java.util.Scanner;

public class fibbonacci {
	public static void main (String args[]) {
		int a[]= new int[5];
		Scanner abc = new Scanner (System.in);
		System.out.print("Enter no. ");
		for (int i=0;i<5;i++) {
			a[i] = abc.nextInt();			
		}
		//for (int x=0;x<5;x++) {
		//System.out.println(+a[x]);
	//}
		int temp=0;
		for (int x=0;x<5;x++) {
			if(x==0) {
				temp= a[x];
			}
			else {
				temp = a[x]+ temp;
			}
	//int c = a[x] + a[x];
	//System.out.println(c);
		}
		System.out.print(temp);
	}
}

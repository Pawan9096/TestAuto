package omy;
import java.util.Scanner;
public class twovalue{
	public static void main (String args[]) {
		String a,b,c;
		Scanner abc = new Scanner (System.in);
		Scanner mno = new Scanner (System.in);
		System.out.println("A = ");
		a=abc.next();
		System.out.println("B = ");
		b=mno.next();
		c=a+b;
		System.out.println(c);
	}
}
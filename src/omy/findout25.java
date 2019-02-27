package omy;
import java.util.*;

public class findout25 {
	public static void main (String args[]) {
		int abc[]= new int[10];
		Scanner mno = new Scanner (System.in);
		for (int i=0; i<10; i++) {
			abc[i]=mno.nextInt();
		}
		for (int i=0; i<10; i++) {
			if (abc[i]==25) {
				System.out.print(abc[i]);
				break;
			}
		}
	}
}

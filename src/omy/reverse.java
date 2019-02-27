package omy;

import java.util.Scanner;

public class reverse {
	public static void main (String args[]) {
		Scanner abc = new Scanner (System.in);
		String a[] = new String[3];
		for (int i=0;i<3;i++) {
			
			a[i] = abc.next();
		}
		for(int j=0;j<3;j++) {
			for (int k=2;k>=0;k--) {
				if(j==2) {
					System.out.print(a[j]+'\n' );
					j++;
				}
				else {
					String temp = a[k];
					a[k] = a[j];
						a[j] = temp;
						System.out.print(a[j]+'\n' );
							
						j++;
					
				}
					
			}
			
		
		}
	}
}

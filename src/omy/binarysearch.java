package omy;

import java.util.Scanner;

public class binarysearch {
	public static void main (String args[]) {
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		int arrayLength = a.length;
		int last = a.length-1;
		int first = 0;
		
		int g;
		
		g = arrayLength/2;
		
		if(a[g]==first) { 
			System.out.println(g);
			if (a[g]==80) {
				System.out.println(+a[5]);
			}
			else if (a[g]>80) {
				//System.out.println(+a[g]);
			}
			else if (a[g]<80){
				first = g;
				//g = 
					
			}
			return;
		}
	}
}

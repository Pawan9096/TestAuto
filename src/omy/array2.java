package omy;

import java.util.Scanner;

public class array2 {
	public static void main (String [] args) {
		int marks [] = new int[6]; 
		float total = 0, per;
		Scanner arr2 = new Scanner (System.in);
		for (int i=0;i<6;i++) {
			System.out.print("Subject"+(i+1)+" - ");
			marks[i] = arr2.nextInt();
			total = total + marks[i];
		}
		per = total/600*100;
		System.out.println("Percentage = "+per+"%");
	}
}

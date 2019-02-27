package omy;

import java.util.Scanner;

public class lineararray {
	public static void main(String args[]) {
		int a[] = new int[5];
		Scanner abc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = abc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if (a[i] == 20) {
				System.out.println(a[i]);
				break;
			}
		}
	}
}
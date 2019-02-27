package omy;
import java.util.Scanner;

public class ppa {
	public static void main (String args[]) {
		int marks[] = new int[3];
		float total = 0, per, avg;
		Scanner arra1 = new Scanner (System.in);
		for (int i=0;i<3;i++) {
			System.out.print("Marks of Pawan "+(i+1)+ "- ");
			marks[i] = arra1.nextInt();
			total = total + marks[i];
		}
		avg = total/3;
		System.out.println("Average marks = "+avg);
		per = total/2;
		System.out.println("Percentage = "+per);

		for (int i=0;i<3;i++) {
			System.out.print("Marks of Amol "+(i+1)+ "- ");
			marks[i] = arra1.nextInt();
			total = total + marks[i];
		}
		avg = total/3;
		System.out.println("Average marks = "+avg);
		per = total/2;
		System.out.println("Percentage = "+per);

		for (int i=0;i<3;i++) {
			System.out.print("Marks of Prashant "+(i+1)+ "- ");
			marks[i] = arra1.nextInt();
			total = total + marks[i];
		}
		avg = total/3;
		System.out.println("Average marks = "+avg);
		per = total/2;
		System.out.print("Percentage = "+per+"%");
	}
}
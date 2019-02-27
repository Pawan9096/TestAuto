package omy;
import java.util.Scanner;
public class nameentry {
public static void main (String args[]) {
	Scanner abc = new Scanner(System.in);
	String check = "Pawan";
	String name;
	System.out.print("Enter - ");
	name = abc.next();
	//String check_new = name[0];
if (name == check) {
		System.out.println("True");
	}
	else
		System.out.println("False");
//	System.out.print(name[0]);
	}
}

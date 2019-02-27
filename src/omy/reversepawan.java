package omy;

public class reversepawan {
	public static void main (String args[]) 
	{
	String testString = "asdfga";
	char check = 'y';
		for(int i=0;i<testString.length();i++) {
			if(check!='n') {
				for(int j=testString.length()-1;j>0;j--){
					if(testString.charAt(i)==testString.charAt(j)) {
						check='y';
						i++;
					}
					else {
						check='n';
						i++;
						break;
						
					}
				}
			}
		}
		if(check=='y') {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}

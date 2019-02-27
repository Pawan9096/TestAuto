package omy;

	class class_s{
		int i=1;
		int j=1;
		void method() {
			System.out.println("Value of i= "+i+" & j= "+j);
			i++;
		}
	}
	public class statics {
		public static void main(String args[]) {
			class_s s1=new class_s();
			class_s s2=new class_s();
			class_s s3=new class_s();
			
			s1.method();
			s2.method();
			s3.method();
		}
}

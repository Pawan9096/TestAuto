package omy;

class bank {
	private float balance;
	//private float loan;
	//private float profit;
	private String name;
	private int accountNumber;
	//System.out.println("Name= "+name);
	//System.out.println("Balance= "+balance);
	//System.out.println("Account number= "+accountNumber);
	public int getaccountNumber() {
		return accountNumber;
	}
	public String getname() {
		return name;
	}
	public float getbalance() {
		return balance;
	}
	public void setname (String newValue) {
		name = newValue;
	}
	public void setbalance (int newValue) {
		balance = newValue;
	}
	public void setaccountNumber (int newValue) {
		accountNumber = newValue;
	}
	}

public class absClass{
	public static void main(String args[]) {
		bank obj = new bank() ;
		obj.setname("Pawan");
		obj.setbalance(1000);
		obj.setaccountNumber(1045551);
		System.out.println("Name= "+obj.getname());
		System.out.println("Balance= "+obj.getbalance());
		System.out.println("Account Number= "+obj.getaccountNumber());
	}
}
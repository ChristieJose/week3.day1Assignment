package org.Bank;

public class AxisBank extends BankInfo  {
	public void deposit() {
		System.out.println("Fund Deposit : overrides org.bank.BankInfo.deposit");

	}

	public static void main(String[] args) {

		AxisBank obj = new AxisBank();
		System.out.println("***Axis Bank***");

		obj.deposit();
		obj.saving();
		obj.fixed();

		BankInfo obj2 = new BankInfo();
		System.out.println("**********************BankInfo********************************);
		obj2.deposit();

	}

}

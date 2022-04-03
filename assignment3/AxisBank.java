package week3.day1.assignment3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit-AxisBank");
	}

	public static void main(String[] args) {
		AxisBank abk = new AxisBank();
		abk.deposit();
		abk.saving();
		abk.fixed();
	}
}

package week3.day1.assignments;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("Deposit of override method");
	}
	public static void main(String[] args) {
		AxisBank objAxis = new AxisBank();
		objAxis.deposit();
		objAxis.fixed();
		objAxis.saving();
	}
}

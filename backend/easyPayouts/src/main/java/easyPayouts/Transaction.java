package easyPayouts;

public class Transaction {
	private String date;
	private double credit;
	private double acBalance;
	private String utr;
	private String upi;

	public Transaction(String date, double credit, double acBalance, String utr, String upi) {
		this.date = date;
		this.credit = credit;
		this.acBalance = acBalance;
		this.utr = utr;
		this.upi = upi;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getAcBalance() {
		return acBalance;
	}

	public void setAcBalance(double acBalance) {
		this.acBalance = acBalance;
	}

	public String getUtr() {
		return utr;
	}

	public void setUtr(String utr) {
		this.utr = utr;
	}

	public String getUpi() {
		return upi;
	}

	public void setUpi(String upi) {
		this.upi = upi;
	}

}

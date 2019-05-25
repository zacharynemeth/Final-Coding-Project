package pkghelper;

public class Payment{
	private double PaymentID;
	private double DueDate;
	private double IPMT;
	private double PPMT;
	private double TotalPrinciple;
	private double Balance;
	private double Principle;
	private double Interest;
	private double InterestRate;
	
	
	public Payment(double Balance,double InterestRate,double PPMT);
	


public double getPrinciple() {
	return Math.round(Principle*100)/100;
}
public double getExtraPayment() {
	return Interest;
}
public double getInterest() {
	return Math.round(Interest*100)/100;
}
public double getBalance() {
	return Balance;
}
public double getMyPmtNbr() {
	return PPMT;
}
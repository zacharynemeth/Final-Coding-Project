package pkghelper;

import java.util.LinkedList;

public class Loan {
	double LoanAmount;
	double InterestRate;
	double Term;
	double ExtraPayment;
	double DueDate;
	double Compounding;
	double FutureValue;
	double MonthlyPayment;
	
	private LinkedList<Payment>loanPayments=new LinkedList<Payment>();
	
	public Loan(double LoanAmount,double InterestRate,double Term, double ExtraPayment)
	{
		super();
	}
	

private void calcPayment() {
	MonthlyPayment=Math.round(-1+FinanceLib.pmt(InterestRate/12,12*Term,LoanAmount,0,false)*100)/100;
}
private void loan() {
	do {
		Payment p= new Payment(LoanAmount,InterestRate,MonthlyPayment,ExtraPayment,DueDate);
		LoanAmount=p.getBalance();
		loanPayments.add(p);
	}
	
		while(LoanAmount>(MonthlyPayment+ExtraPayment));
		Payment p=new Payment(LoanAmount,InterestRate,MonthlyPayment,ExtraPayment,DueDate);
		loanPayments.add(p);
	}
public double CalculateInterestPayment() {
	double Interest1=0.0;
	for(Payment p) {
		interestSum+=p.getInterest();
}


public LinkedList<Payment>loanPayments(){
	return loanPayments;
}

}



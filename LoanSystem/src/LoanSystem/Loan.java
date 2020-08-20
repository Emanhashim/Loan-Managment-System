package LoanSystem;
public class Loan {
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	public Loan(double annualIntersetRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
		}
	public  double getAnnualInterestRate() {
		return annualInterestRate;
		}
	public void setAnnualIntersetRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public void setNumberOfYears(double NumberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public double getMonthlyPayment() {
		double MonthlyIntersetRate = annualInterestRate/1200;
		double monthlyPayment = loanAmount*MonthlyIntersetRate/(1-(1/Math.pow(1+MonthlyIntersetRate, numberOfYears*12)));
	     return monthlyPayment;
	}
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears *12;
		return totalPayment;
	}
	 public java.util.Date getLoanDate(){
		 return loanDate;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // at page 377
		
	}

}

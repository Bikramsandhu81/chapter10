import java.util.Scanner;
public class TestLoanClass {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter annual interest rate, for example, 8.25: ");
		double annaualInterestRate = input.nextDouble();
		
		System.out.println("Enter number of years as an interger: ");
		int numberOfYears = input.nextInt();
		
		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		
		Loan loan = new Loan(annaualInterestRate, numberOfYears, loanAmount);
		
		System.out.printf("The loan was created on %sf\n" , loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
	    System.out.println(loan.getLoanAmount());
	}

}

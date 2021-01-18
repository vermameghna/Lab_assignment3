package labAssignment3;

public class SalariedEmployee extends Employee {
	private static double salaryRateOfEmployee = 10000;
	
	public static double getRateOfEmployee() {
		return salaryRateOfEmployee;
	}
	
	public static void setSalaryRateOfEmployee(double rate) {
		salaryRateOfEmployee = rate;
	}
	
	public double getSalary() {
		return salaryRateOfEmployee;
	}
	
	public void setSalary(double salary) {
		salaryRateOfEmployee = salary;
	}
	
	
	@Override
	public double getPayment() {
		return this.getSalary();
	}
}
 
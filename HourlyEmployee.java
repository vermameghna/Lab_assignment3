package labAssignment3;

public class HourlyEmployee extends Employee {
	private static double hourlyRateOfEmployee = 1500;
	private int hoursWorked = 0;
	

	public HourlyEmployee() {}

	public HourlyEmployee(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public static double getRateOfEmployee() {
		return hourlyRateOfEmployee;
	}
	
	public static void setHourlyRateOfEmployee(double rate) {
		hourlyRateOfEmployee = rate;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double getSalary() {
		return this.hoursWorked*hourlyRateOfEmployee;
	}

	public double getSalary(int hoursWorked) {
		this.hoursWorked = hoursWorked;
		return getSalary();
	}
	
	
	public void setSalary(double hourlyRate) {
		hourlyRateOfEmployee = hourlyRate;
	}
	
	
	@Override
	public double getPayment() {
		return this.getSalary();
	}
}

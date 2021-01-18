package labAssignment3;

public class CommissionEmployee extends Employee {
	private static double salesPercent = 50;
	private int noOfSales = 0;
	
	
	public CommissionEmployee() {
	}

	public CommissionEmployee(int noOfSales) {
		this.noOfSales = noOfSales;
	} 
	
	public static double getSalesPercent() {
		return salesPercent;
	}

	public static void setSalesPercent(double percent) {
		salesPercent = percent;
	}

	public int getNoOfSales() {
		return noOfSales;
	}

	public void setNoOfSales(int noOfSales) {
		this.noOfSales = noOfSales;
	}

	public double getSalary() {
		return (noOfSales*salesPercent)/100;
	}
	
	public double getSalary(int noOfSales) {
		this.noOfSales = noOfSales;
		return getSalary();
	}
	
	public void setSalary(double percent) {
		salesPercent = percent;
	}
	
	@Override
	public double getPayment() {
		return this.getSalary();
	}
	
}

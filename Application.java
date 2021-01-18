package labAssignment3;

public class Application {
	public static void main(String[] args) {
		Payable salariedEmployee = new SalariedEmployee();
		Payable hourlyEmployee = new HourlyEmployee(10);
		Payable commissionEmployee = new CommissionEmployee(40000);
		Payable invoice  = new Invoice("Wheels","Alloy type wheels",4,20000);
		
		
		System.out.println("Payment of salaried employee: " + salariedEmployee.getPayment());
		System.out.println("Payment of Hourly employee: " + hourlyEmployee.getPayment());
		System.out.println("Payment of Commission employee: " + commissionEmployee.getPayment());
		System.out.println("Payment of Invoice: " + invoice.getPayment());
	}
}

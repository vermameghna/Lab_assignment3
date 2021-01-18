package labAssignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeTester {
	public static void main(String[] args) throws IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Which type of employee is there ? ");
		System.out.println("1.Salaried Employee");
		System.out.println("2.Hourly Employee");
		System.out.println("3.Commission Employee");
		int choice = Integer.parseInt(s.readLine());
	
		if(choice > 3) {
			System.out.println("You are not an employee of our company.");
			return;
		}
		
		int whichEmployee = choice;
		
		System.out.println("What action you want to take: ");
		System.out.println("1.Get the weekly salary");
		System.out.println("2.Set the rate of employee");
		System.out.println("3.Increment Salary");
		choice = Integer.parseInt(s.readLine());
		
		if(choice == 1) {
			double weeklySalary = 0.0;
			if(whichEmployee == 1) {
				SalariedEmployee tempSalariedEmployee = new SalariedEmployee();
				weeklySalary = tempSalariedEmployee.getPayment();
			}else if(whichEmployee == 2) {
				System.out.println("How many hours of work ? ");
				int hours = Integer.parseInt(s.readLine());
				HourlyEmployee tempHourlyEmployee = new HourlyEmployee(hours);
				weeklySalary = tempHourlyEmployee.getPayment();
			}else if(whichEmployee == 3) {
				System.out.println("You did sales worth ? ");
				int sales = Integer.parseInt(s.readLine());
				CommissionEmployee tempCommissionEmployee = new CommissionEmployee(sales);
				weeklySalary = tempCommissionEmployee.getPayment();
			}
			System.out.println("Weekly salary of employee is: " + weeklySalary);
		}else if(choice == 2) {
			System.out.println("Please enter rate of Salaried and Hourly employees and enter percentage of sales for Commission Employees: ");
			double rate1 = Double.parseDouble(s.readLine());
			double rate2 = Double.parseDouble(s.readLine());
			double percent = Double.parseDouble(s.readLine());
			
			SalariedEmployee tempSalariedEmployee = new SalariedEmployee();
			tempSalariedEmployee.setSalary(rate1);
			HourlyEmployee tempHourlyEmployee = new HourlyEmployee();
			tempHourlyEmployee.setSalary(rate2);
			CommissionEmployee tempCommissionEmployee = new CommissionEmployee();
			tempCommissionEmployee.setSalary(percent);
			
			
			System.out.println("Task Done!");
		}else if(choice == 3){
			if(whichEmployee == 1) {
				System.out.println("Enter the rate by which you want to increment: ");
				int incrementRate = Integer.parseInt(s.readLine());
				SalariedEmployee.setSalaryRateOfEmployee(SalariedEmployee.getRateOfEmployee() + incrementRate);
			}else if(whichEmployee == 2) {
				System.out.println("Enter the rate by which you want to increment: ");
				int incrementRate = Integer.parseInt(s.readLine());
				HourlyEmployee.setHourlyRateOfEmployee(HourlyEmployee.getRateOfEmployee() + incrementRate);
			}else {
				System.out.println("Enter the percentage by which you want to increment: ");
				int percentIncrement = Integer.parseInt(s.readLine());
				CommissionEmployee.setSalesPercent(CommissionEmployee.getSalesPercent() + percentIncrement);
			}
		}else {
			System.out.println("Thankyou!");
		}
		
	}
}

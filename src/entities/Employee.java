package entities;

public class Employee {
	private String name;
	private double GrossSalary;
	private double tax;
	
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		GrossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return GrossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		GrossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double NetSalary() {
		return GrossSalary-tax;
	}
	
	public void IncreaseSalary (double percentage ) {
	this.GrossSalary += (percentage/100)*GrossSalary;
	}

	@Override
	public String toString() {
		return  name + ", $ " +String.format("%.2f",NetSalary());
	}
	
	
	
}

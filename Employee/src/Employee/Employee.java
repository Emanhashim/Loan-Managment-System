package Employee;
public abstract class Employee {
	
private String name;
private int number;
private String address;

public Employee(String name, String address, int number) {
	System.out.println("constructing an employee class");
	this.address = address;
	this.name = name;
	this.number = number;
	
}

public double computePay() {
	System.out.println("this compute payment inside employee");
	return 0.0;
}
public void mailCheck() {
	System.out.println("this mail checked to" + this.name + "with ths address "+ this .address);
}
public String toString() {
	return name + "" + address + "" + number;
}
public String getName() {
	return name;
}

public String getAddress() {
	return address;
}
public void setAddress(String newAddress) {
	address = newAddress;
	}
public int getNumber() {
	return number;
}

public class Salary extends Employee{
	private double salary;
	
	public Salary(String name, String address, int number, double salary) {
		super(name, address,number);
		setSalary(salary);
		}
	public void mailcheck() {
		System.out.println("with checking maill of salary class");
		System.out.println("checking mail to" + getName() + "with the salary" + salary);
	}
	
	public double  getSalary() {
		return salary;
	}
	
	public void setSalary(double newSalary) {
		if(salary >= 0.0) {
			salary = newSalary;
		}
		}
	public double computPay() {
	System.out.println("comput payment for" + getName());	
	return salary/52;
	}
	
	
}
	
	
	
	public static void main(String[] args) {
		Salary s = new Salary("eman hahsim", "aware", 100.100);
		Employee e = new Salary("sara hashim", "bole", 2400.56);
		System.out.println("--------------------this is");
		e.mailCheck();
		System.out.println("------------------this is employee's mail");
		s.mailcheck();
	}

}

package genericsWildcard;

import java.util.ArrayList;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {

		// we know we can assign an instance of subclass to parent class like :

		Employee employee = new Employee();
		Accountant accountant = new Accountant();

		employee = accountant; // this is completely fine

		// but we can't do this things we generic type, like

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<Accountant>();
		accountants.add(new Accountant());
		//employees = accountants; // this will raise compile time error

		// generic wildcard

		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<Accountant> accountants2 = new ArrayList<Accountant>();
		employees2 = accountants; // this is allowed

		// upper bound
		// this just means that all the instance of employee as well as all the
		// children of the employee are allowed
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountant3 = new ArrayList<Accountant>();
		employees3 = accountant3;

		// lower bound
		// this just means that all the instance of employee as well as all the
		// parents of the employee are allowed
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		ArrayList<Accountant> accountant4 = new ArrayList<Accountant>();
		// this is not allowed as Accountant is the subclass of Employee and not
		// the parent class
		//employees4 = accountant4;

		
		makeEmployeeWork(employees);  // this will work
		makeEmployeeWork(accountants); // this will also work
	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		
		for(Employee employee : employees) {
			
			employee.work();
		}
	}
}

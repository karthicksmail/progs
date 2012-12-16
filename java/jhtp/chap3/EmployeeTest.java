// Exercise 3.14
//Test driver for Employee  Class. Is not based on any unit test framework. Confirmation of values need to be done manually.
public class EmployeeTest {
	public static void main(String[] args) { 
		Employee emp1 = new Employee("Karthick", "Sundararajan", 10000.00);
		Employee emp2 = new Employee("Soumiyashri", "Swaminathan", 14203.00);

		System.out.printf("Details for emp1:\n");
		System.out.printf("First Name: %s\n", emp1.getFirstName());
		System.out.printf("Last Name: %s\n", emp1.getLastName());
		System.out.printf("Salary: %.2f\n", emp1.getSalary());

		System.out.printf("Details for emp2:\n");
		System.out.printf("First Name: %s\n", emp2.getFirstName());
		System.out.printf("Last Name: %s\n", emp2.getLastName());
		System.out.printf("Salary: %.2f\n", emp2.getSalary());

		System.out.printf("Both receive 10%% hikes\n");
		emp1.setSalary(emp1.getSalary() * 1.1);
		emp2.setSalary(emp2.getSalary() * 1.1);

		System.out.printf("Details for emp1:\n");
		System.out.printf("First Name: %s\n", emp1.getFirstName());
		System.out.printf("Last Name: %s\n", emp1.getLastName());
		System.out.printf("Salary: %.2f\n", emp1.getSalary());

		System.out.printf("Details for emp2:\n");
		System.out.printf("First Name: %s\n", emp2.getFirstName());
		System.out.printf("Last Name: %s\n", emp2.getLastName());
		System.out.printf("Salary: %.2f\n", emp2.getSalary());
	}
}

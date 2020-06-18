public class Main {

    public static void main(String[] args) {
	// write your code here
    Customer customer = new Customer();
    Employee employee = new Employee();

    customer.email="enes.altan@outlook.com";

    employee.age = 25;

    CustomerManager customerManager = new CustomerManager();
    EmployeeManager employeeManager = new EmployeeManager();

    customerManager.List();
    employeeManager.BestEmployee();
    }
}

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(10);

        management.addEmployee(new Employee(101, "Monalisa", "Developer", 50000));
        management.addEmployee(new Employee(102, "Rahul", "Tester", 40000));
        management.addEmployee(new Employee(103, "Sneha", "Manager", 70000));

        System.out.println("\nEmployee List:");
        management.displayEmployees();

        System.out.println("\nSearching Employee:");
        Employee employee = management.searchEmployee(102);

        if (employee != null) {
            employee.display();
        } else {
            System.out.println("Employee Not Found");
        }

        System.out.println("\nDeleting Employee:");
        management.deleteEmployee(102);

        System.out.println("\nUpdated Employee List:");
        management.displayEmployees();
    }
}
/**
 * Test program to demonstrate the Employee hierarchy.
 * It creates instances of each Employee type and displays their details and earnings.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // Create instances of different employee types
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Doe", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", "Smith", "222-22-2222", 16.75, 42);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Jack", "Johnson", "333-33-3333", 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Jill", "Brown", "444-44-4444", 5000, 0.04, 300);

        // Display each employee's information
        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee};
        for (Employee emp : employees) {
            System.out.println(emp);
            System.out.printf("Earned: $%.2f%n%n", emp.earnings());
        }
    }
}

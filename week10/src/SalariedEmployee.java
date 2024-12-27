/**
 * SalariedEmployee is a subclass of Employee that represents an employee
 * who is paid a fixed weekly salary.
 */
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // Constructor to initialize SalariedEmployee details
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        // Call the constructor of the superclass (Employee) to initialize the common attributes
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    // Getters and setters
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    // Implement earnings method to return weekly salary
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    // Overridden toString method to include weekly salary details
    @Override
    public String toString() {
        return String.format(
                "Salaried employee: %s\n" +
                "Weekly salary: %.2f",
                super.toString(), getWeeklySalary());
    }
}

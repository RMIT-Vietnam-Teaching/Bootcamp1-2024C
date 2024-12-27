/**
 * HourlyEmployee is a subclass of Employee that represents an employee
 * who is paid based on hourly wage and hours worked.
 * Overtime (hours > 40) is paid at 1.5x the hourly wage.
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    // Constructor to initialize HourlyEmployee details
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        // Call the constructor of the superclass (Employee) to initialize the common attributes
        super(firstName, lastName, socialSecurityNumber);
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        if (hours < 0.0 || hours > 168.0) { // Maximum hours in a week is 168
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.wage = wage;
        this.hours = hours;
    }

    // Getters and setters
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    // Implement earnings method to calculate weekly pay
    @Override
    public double earnings() {
        if (getHours() <= 40) { // No overtime
            return getWage() * getHours();
        } else { // Overtime calculation
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    // Overridden toString method to include hourly wage and hours worked
    @Override
    public String toString() {
        return String.format(
                "Hourly employee: %s\n" +
                "Hourly wage: %.2f; Hours worked: %.2f",
                super.toString(), getWage(), getHours());
    }
}

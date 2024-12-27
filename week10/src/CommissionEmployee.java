/**
 * CommissionEmployee is a subclass of Employee that represents an employee
 * whose earnings are based on a percentage of their gross sales.
 */
public class CommissionEmployee extends Employee {
    private double grossSales; // Total sales
    private double commissionRate; // Percentage commission

    // Constructor to initialize CommissionEmployee details
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        // Call the constructor of the superclass (Employee) to initialize the common attributes
        super(firstName, lastName, socialSecurityNumber);
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // Getters and setters
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    // Implement earnings method to calculate earnings based on commission
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // Overridden toString method to include gross sales and commission rate
    @Override
    public String toString() {
        return String.format(
                "Commission employee: %s\n" +
                "Gross sales: %.2f; Commission rate: %.2f",
                super.toString(), getGrossSales(), getCommissionRate());
    }
}

/**
 * BasePlusCommissionEmployee is a subclass of CommissionEmployee
 * that includes a base salary in addition to earnings from commission.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    // Constructor to initialize BasePlusCommissionEmployee details
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        // Call the constructor of the superclass (CommissionEmployee) to initialize the common attributes
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // Getters and setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // Override earnings method to include base salary
    @Override
    public double earnings() {
        return super.earnings() + getBaseSalary();
    }

    // Overridden toString method to include base salary
    @Override
    public String toString() {
        return String.format(
                "Base plus %s\n" +
                "Base salary: %.2f",
                super.toString(), getBaseSalary());
    }
}

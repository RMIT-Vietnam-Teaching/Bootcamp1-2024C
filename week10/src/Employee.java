/**
 * Abstract superclass Employee represents an employee with basic details:
 * first name, last name, and social security number.
 * It defines the abstract method `earnings` to calculate earnings, which must be implemented in subclasses.
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Abstract method to calculate earnings.
     * Each subclass must provide its own implementation.
     */
    public abstract double earnings();

    // Overridden toString method to return employee's basic details
    @Override
    public String toString() {
        return String.format("%s %s\nSocial security number: %s", 
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}

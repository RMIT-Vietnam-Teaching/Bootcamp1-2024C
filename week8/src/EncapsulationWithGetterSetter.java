import java.util.Scanner;

public class EncapsulationWithGetterSetter {
    // Create a class called `Person` with the following fields:
    // - `name` of type `String`
    // - `age` of type `int`
    // - Provide a getter and setter for each field
    public static class Person {
        // Encapsulate the fields
        private String name;
        private int age;

        // Default constructor is provided by Java if no constructor is defined

        // Provide getter and setter for the fields
        public String getName() {
            return name;
        }

        public void setName(String inputName) {
            name = inputName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int intAge) {
            age = intAge;
        }
    }

    // - In the `main` method, create an instance of `Person` and set the `name` and `age` fields
    // - Print the `name` and `age` fields
    public static void main(String[] args) {
        Person person = new Person();
        // Use scanner to get the name and age from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        person.setName(scanner.nextLine());
        System.out.println("Enter age: ");
        person.setAge(scanner.nextInt());

        System.out.println("Person details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

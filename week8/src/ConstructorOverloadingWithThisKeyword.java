public class ConstructorOverloadingWithThisKeyword {
    // Create a class called `Person` with the following fields:
    // - `name` of type `String`
    // - `age` of type `int`
    // - Provide a constructor that takes in `name` and `age` as parameters
    public static class Person {
        private String name;
        private int age;

        // Default constructor
        public Person() {
            this.name = "Default Name";
            this.age = 20;
        }

        // Constructor with parameters
        // Use the `this` keyword to refer to the instance fields
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Provide getter and setter for the fields
        // Use the `this` keyword to refer to the instance fields
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        // Use the `this` keyword to refer to the instance fields
        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    // Add helper method to initialize person details
    private static void initializePerson(Person person, String name, int age) {
        person.setName(name);
        person.setAge(age);
    }

    // Add helper method to print person details
    private static void printPersonDetails(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("--------------------");
    }

    // - In the `main` method, create an instance of `Person` using the constructor and pass the `name` and `age` as arguments
    // - Print the `name` and `age` fields
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        printPersonDetails(person);

        Person person2 = new Person();
        printPersonDetails(person2);
    }
}

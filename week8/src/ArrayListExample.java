import java.util.ArrayList;

public class ArrayListExample {
    // Create a class called `Person` with the following fields:
    // - `name` of type `String`
    // - `age` of type `int`
    public static class Person {
        private String name;
        private int age;

        // Provide a constructor that takes in `name` and `age` as parameters
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Provide getter and setter for the fields
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

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
        // Create an ArrayList of Person objects
        ArrayList<Person> persons = new ArrayList<Person>();

        // Add Person objects to the ArrayList
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("Charlie", 35));

        // Print the details of each Person object
        for (Person person : persons) {
            printPersonDetails(person);
        }
    }
}

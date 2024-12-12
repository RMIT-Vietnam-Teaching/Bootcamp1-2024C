public class AvoidNullPointerException {
    // Create a class called `Person`
    // In the main function, create an instance of `Person` and call the `printPersonDetails` method
    // Detect the case where the instance of `Person` is not initialized and print an error message
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void printPersonDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        Person person = null;
        // Comment out the line below to see the NullPointerException
        if (person != null)
        {
            person.printPersonDetails();
        }
    }
}

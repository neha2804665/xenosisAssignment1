import java.util.*;
public class Person {
    // Properties of the Person class
    private String name;
    private int age;

    // Constructor to initialize the properties
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the details of the person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to instantiate an object of Person and call displayDetails
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		int age = sc.nextInt();
        // Creating an object of the Person class
        Person person = new Person(name, age);
        
        // Calling the displayDetails method
        person.displayDetails();
    }
}

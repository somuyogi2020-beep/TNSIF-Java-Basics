package tnsif_java_rahulgandhi;

public class Constructor {

	public static void main(String[] args) {
		// Example: Constructor in Java
		class Student {
		    String name;
		    int age;

		    // Constructor
		    Student(String n, int a) {
		        name = n;
		        age = a;
		    }

		    // Method to display student details
		    void display() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		    }

		    // Main method
		    public static void main(String[] args) {
		        // Creating object and calling constructor
		        Student s1 = new Student("Rahul", 21);

		        // Displaying details
		        s1.display();
		    }
		}

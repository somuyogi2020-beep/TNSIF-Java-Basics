package tnsif_java_rahulgandhi;

public class Inheritance {

	public static void main(String[] args) {
		// Parent class
		class Animal {
		    void eat() {
		        System.out.println("Animal is eating");
		    }
		}

		// Child class inherits from Animal
		class Dog extends Animal {
		    void bark() {
		        System.out.println("Dog is barking");
		    }
		}

		// Main class
		public class Main {
		    public static void main(String[] args) {
		        Dog d = new Dog();
		        d.eat();   // calling method from parent class
		        d.bark();  // calling method from child class
		    }
		}
	}

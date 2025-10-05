package tnsif_java_rahulgandhi;

public class PolymorphismBasics {
public static void main(String[] args) {
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class
class Dog extends Animal {
 // Overriding the parent method
 void sound() {
     System.out.println("Dog barks");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     Animal a = new Dog(); // parent reference, child object
     a.sound();            // calls the overridden method in Dog
 }
}

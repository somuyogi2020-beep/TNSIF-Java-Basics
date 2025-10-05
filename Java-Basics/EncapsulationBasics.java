package tnsif_java_rahulgandhi;

class Person {
    private String name;  // private variable

    // Setter method
    public void setName(String n) {
        name = n;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {a
        Person p = new Person();
        p.setName("Rahul");   // set value using setter
        System.out.println("Name: " + p.getName()); // get value using getter
    }
}

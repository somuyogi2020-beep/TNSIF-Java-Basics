package tnsif_java_rahulgandhi;

public class AcessModifier {
	public static void main(String[] args) {
		class A {
		    public int x = 10;       // accessible everywhere
		    private int y = 20;      // accessible only within class A
		    protected int z = 30;    // accessible in same package and by subclass
		    int w = 40;              // default (package-private) – same package only

		    void display() {
		        System.out.println("Inside class A:");
		        System.out.println("x = " + x);
		        System.out.println("y = " + y);
		        System.out.println("z = " + z);
		        System.out.println("w = " + w);
		    }
		}

		class B extends A {
		    void show() {
		        System.out.println("Inside class B:");
		        System.out.println("x = " + x);  // public → accessible
		        // System.out.println("y = " + y);  // private → not accessible
		        System.out.println("z = " + z);  // protected → accessible
		        System.out.println("w = " + w);  // default → accessible (same package)
		    }
		}

		public class Main {
		    public static void main(String[] args) {
		        A obj1 = new A();
		        obj1.display();

		        B obj2 = new B();
		        obj2.show();
		    }
		}

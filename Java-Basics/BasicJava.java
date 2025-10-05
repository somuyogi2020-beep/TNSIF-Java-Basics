package tnsif_java_rahulgandhi;

import com.tnsif.oopsconcept.Circle;
import com.tnsif.oopsconcept.Shape;

public class BasicJava {
	abstract class Shape{
		abstract void draw(); 
	}

	class Circle extends Shape{

		void draw() {
			System.out.println("Drawing Circle");
		}
	}
	public class AbstractionDemo {

		public static void main(String[] args) {
			
			Shape s = new Circle();
			s.draw();		
		}
	}

}

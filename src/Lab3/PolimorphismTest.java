package Lab3;

class Shape {
    public void numberOfSides() {
        System.out.println("Number Of Sides: Base Class" );
    }
}

class Rectangle extends Shape {
    public void numberOfSides() {
        System.out.println("Number Of Sides: Rectangle = 4" );
    }
}

class Triangle extends Shape {
    public void numberOfSides() {
        System.out.println("Number Of Sides: Triangle = 3" );
    }
}

public class PolimorphismTest {

    public static void main(String[] args) {
	Shape shape1 = new Rectangle(); // Using Shape reference
	shape1.numberOfSides();

	Shape shape2 = new Triangle(); // Using Shape reference
	shape2.numberOfSides();

    }
}

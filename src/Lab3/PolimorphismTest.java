package Lab3;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    public void calculateArea() {
        System.out.println("Calculating the area of a rectangle.");
    }
}

public class PolimorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapeRectangle = new Rectangle(); // Using Shape reference
        Rectangle directRectangle = new Rectangle(); // Using Rectangle reference

        shapeRectangle.draw(); // Calls the overridden method in Rectangle
        
        // shapeRectangle.calculateArea(); 
        // Compilation error - calculateArea() not in Shape class

        directRectangle.draw(); // Calls the overridden method in Rectangle
        directRectangle.calculateArea(); // Calls the method in Rectangle
        
       
	}

}

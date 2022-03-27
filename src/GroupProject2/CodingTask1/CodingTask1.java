package GroupProject2.CodingTask1;

public class CodingTask1 {
    /*
    1. Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
     */
}

// Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
interface Shape {
    void calculateArea(double area);

    void calculatePerimeter(double perimeter);
}

// Create class Circle that implements functionality defined in the Shape Interface.
class Circle implements Shape {
    @Override
    public void calculateArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of a circle with a radius of " + radius + " is equal to " + area + ".");
    }

    @Override
    public void calculatePerimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of a circle with a radius of " + radius + " is equal to " + perimeter + ".");
    }
}

// Create class Square that implements functionality defined in the Shape Interface.
class Square implements Shape {
    @Override
    public void calculateArea(double side) {
        double area = side * side;
        System.out.println("The area of a square with a side of " + side + " is equal to " + area + ".");
    }

    @Override
    public void calculatePerimeter(double side) {
        double perimeter = 4 * side;
        System.out.println("The perimeter of a square with a side of " + side + " is equal to " + perimeter + ".");
    }
}

// Test your code.
class ShapeTester {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea(3);
        circle.calculatePerimeter(3);

        Square square = new Square();
        square.calculateArea(3);
        square.calculatePerimeter(3);
    }
}


package FunctionalInterface;
// Define the functional interface
@FunctionalInterface
 interface Area {
    double computeArea(); // Single abstract method to compute area

    // Default method to return the number of sides
    default int numberOfSides() {

        return 4;
    }
}

// Implementations for various shapes

// Circle
class Circle implements Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return 3.14 * radius * radius;
    }
}

// Rectangle
class Rectangle implements Area {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return width * height;
    }
}

// Isosceles right triangle
class IsoscelesRightTriangle implements Area {
    private double leg;

    public IsoscelesRightTriangle(double leg) {
        this.leg = leg;
    }

    @Override
    public double computeArea() {
        return (leg * leg) / 2;
    }

    // Override default numberOfSides method
    @Override
    public int numberOfSides() {
        return 3;
    }
}

// Example usage
public class Demo3 {
    public static void main(String[] args) {
        Area circle = new Circle(5);
        Area rectangle = new Rectangle(4, 6);
        Area triangle = new IsoscelesRightTriangle(3);

        System.out.println("Circle area: " + circle.computeArea());
        System.out.println("Rectangle area: " + rectangle.computeArea());
        System.out.println("Isosceles right triangle area: " + triangle.computeArea());

        System.out.println("Circle number of sides: " + circle.numberOfSides());
        System.out.println("Rectangle number of sides: " + rectangle.numberOfSides());
        System.out.println("Isosceles right triangle number of sides: " + triangle.numberOfSides());
    }
}

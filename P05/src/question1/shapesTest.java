package question1;

public class shapesTest {
    public static void main (String[] args){
        pentagon pentagon = new pentagon("Pentagon", 7.3, 8.5);
		System.out.println("Pentagon Perimeter: " + pentagon.perimeter()); // perimeter should be 36.5
		System.out.println("Pentagon Area: " + pentagon.area()); // area should be 155.125

        circle circle = new circle("Circle", 7.5);
		System.out.println("Circle Perimeter: " + circle.perimeter()); // perimeter should be 47.1
		System.out.println("Circle Area: " + circle.area()); // area should be 176.625
		System.out.println("Circle Diameter: " + circle.getDiameter()); // diameter should be 15.0
    }
}

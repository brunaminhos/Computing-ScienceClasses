package question1;

public class circle extends Shape{
    private double radius;

    public circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    // return diameter
    public double getDiameter(){
        return 2*radius;
    }

    // return area
    public double area(){
        return 3.14*radius*radius;
    }

    // return perimeter
    public double perimeter() {
		return 2*3.14*radius;
	}
}

package question1;

public class pentagon extends Shape{

    private double lenghtOfSIde, heightFromCenter;

    // contructor
    public pentagon (String name, double lenghtOfSIde, double heightFromCenter){
        super(name);
        this.lenghtOfSIde = lenghtOfSIde;
        this.heightFromCenter = heightFromCenter;
    }

    // return area
    public double area() {
		return 2.5*lenghtOfSIde*heightFromCenter  ;
    }
    
    // return perimeter
    public double perimeter() {
		return 5*lenghtOfSIde;
	}
}

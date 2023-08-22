/**
 * Name: Shape.java
 *
 * Student Name;
 * Student Number:
 */
package question1;

abstract class Shape{
	private String name;

	public Shape(String n){
		name = n;
	}

	public abstract double area();

	public abstract double perimeter();

	public void put(){
		System.out.printf("%s with area %6.2f and perimeter %6.2f\n",name, area(), perimeter() );
	}
}
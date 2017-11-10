//Shape.java
//Dongpeng Xia
//Shape is an abstract class.

package shapes;

//Shape
public abstract class Shape 
{
	//calculatePerimeter calculates and returns the perimeter of a shape
	abstract public double calculatePerimeter();
	
	//calculateArea calculates and returns the area of a shape
	abstract public double calculateArea();
	
	//getName returns the name of a shape
	abstract public String getName();

	//main method
	public static void main(String[] args) 
	{
		System.out.println("Inside main method of the abstract Shape class.");
		
	}//end main
	
}//end Shape
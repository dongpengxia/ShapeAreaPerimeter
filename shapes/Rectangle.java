//Rectangle.java
//Dongpeng Xia
//Rectangle is a child of the Shape class with a length and a width.

package shapes;

import java.util.*;

public class Rectangle extends Shape
{
	//length and width of rectangle
	protected double length;
	protected double width;
		
	//constructor with no parameters sets length and width to 0
	public Rectangle()
	{
		length = 0;
		width = 0;
		
	}//end Rectangle()
		
	//constructor with double parameters for length and width
	public Rectangle( double l, double w )
	{
		length = l;
		width = w;
		
	}//end Rectangle( double, double )
		
	//constructor, expects StringTokenizer with length and width in it
	public Rectangle( StringTokenizer st )
	{
		length = Double.parseDouble( st.nextToken() );
		width = Double.parseDouble( st.nextToken() );
		
	}//end Rectangle( StringTokenizer )
		
	//calculatePerimeter method from abstract Shape class, perimeter = length + length + width + width
	@Override
	public double calculatePerimeter()
	{
		return ( length + length + width + width );
			
	}//end calculatePerimeter
		
	//calculateArea method from abstract Shape class, area = length * width
	@Override
	public double calculateArea()
	{
		return ( length * width );
		
	}//end calculateArea
	
	//getName method from abstract Shape class
	@Override
	public String getName()
	{
		return "rectangle";
		
	}//end getName
		
	//getter method for length
	public double getLength()
	{
		return length;
		
	}//end getLength
	
	//getter method for width
	public double getWidth()
	{
		return width;
		
	}//end getWidth
		
	//setter method for length
	public void setLength( double l )
	{
		length = l;
		
	}//end setLength
	
	//setter method for width
	public void setWidth( double w )
	{
		width = w;
	}
		
	//main method
	public static void main(String[] args) 
	{
		System.out.println("Inside main method of Rectangle class.");
		
	}//end main
		
}//end Rectangle class
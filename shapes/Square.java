//Square.java
//Dongpeng Xia
//Square is a child of the Shape class.

package shapes;

import java.util.*;

public class Square extends Shape
{
	//side length
	protected double sideLength;
	
	//constructor with no parameters sets side length to 0
	public Square()
	{
		sideLength = 0;
		
	}//end Square()
	
	//constructor with double parameter for side length
	public Square( double s )
	{
		sideLength = s;
		
	}//end Square( double )
	
	//constructor, expects StringTokenizer with side length in it
	public Square( StringTokenizer st )
	{
		sideLength = Double.parseDouble( st.nextToken() );
		
	}//end Square( StringTokenizer )
	
	//calculatePerimeter method from abstract Shape class, perimeter = side length * 4
	@Override
	public double calculatePerimeter()
	{
		return ( sideLength * 4 );
		
	}//end calculatePerimeter
	
	//calculateArea method from abstract Shape class, area = side length * side length
	@Override
	public double calculateArea()
	{
		return ( sideLength * sideLength );
		
	}//end calculateArea
	
	//getName method from abstract Shape class
	@Override
	public String getName()
	{
		return "square";
		
	}//end getName
	
	//getter method for side length
	public double getSideLength()
	{
		return sideLength;
		
	}//end getSideLength
	
	//setter method for side length
	public void setSideLength( double s )
	{
		sideLength = s;
		
	}//end setSideLength
	
	//main method
	public static void main(String[] args) 
	{
		System.out.println("Inside main method of Square class.");
		
	}//end main
	
}//end Square class
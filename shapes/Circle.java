//Circle.java
//Dongpeng Xia
//Circle is a child of the Shape class with a radius.

package shapes;

import java.util.*;

public class Circle extends Shape
{
	//radius of circle
	protected double radius;
	
	//constructor with no parameters sets radius to 0
	public Circle()
	{
		radius = 0;
		
	}//end Circle()
	
	//constructor with double parameter for radius
	public Circle( double r )
	{
		radius = r;
		
	}//end Circle( double )
	
	//constructor, expects StringTokenizer with radius in it
	public Circle( StringTokenizer st )
	{
		radius = Double.parseDouble( st.nextToken() );
		
	}//end Circle( StringTokenizer )
	
	//calculatePerimeter method from abstract Shape class, perimeter = 2*pi*radius
	@Override
	public double calculatePerimeter()
	{
		return ( 2 * Math.PI * radius );
		
	}//end calculatePerimeter
	
	//calculateArea method from abstract Shape class, area = pi*radius*radius
	@Override
	public double calculateArea()
	{
		return ( Math.PI * radius * radius );
		
	}//end calculateArea
	
	//getName method from abstract Shape class
	@Override
	public String getName()
	{
		return "circle";
		
	}//end getName
	
	//calculateDiameter calculates and returns the diameter of the circle
	public double calculateDiameter()
	{
		return ( radius * 2 );
		
	}//end calculateDiameter
	
	//getter method for radius
	public double getRadius()
	{
		return radius;
		
	}//end getRadius
	
	//setter method for radius
	public void setRadius( double r )
	{
		radius = r;
		
	}//end setRadius
	
	//main method
	public static void main(String[] args) 
	{
		System.out.println("Inside main method of Circle class.");
		
	}//end main
	
}//end Circle class
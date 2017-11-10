//Triangle.java
//Dongpeng Xia
//Triangle is a child of the Shape class with three sides.

package shapes;

import java.util.*;

public class Triangle extends Shape
{
	//Three sides of a triangle
	protected double firstSide;
	protected double secondSide;
	protected double thirdSide;
		
	//constructor with no parameters sets all three sides to 0
	public Triangle()
	{
		firstSide = 0;
		secondSide = 0;
		thirdSide = 0;
		
	}//end Triangle()
		
	//constructor with double parameters for three sides
	public Triangle( double sideA, double sideB, double sideC )
	{
		firstSide = sideA;
		secondSide = sideB;
		thirdSide = sideC;
		
	}//end Triangle( double, double, double )
		
	//constructor, expects StringTokenizer with three sides in it
	public Triangle( StringTokenizer st )
	{
		firstSide = Double.parseDouble( st.nextToken() );
		secondSide = Double.parseDouble( st.nextToken() );
		thirdSide = Double.parseDouble( st.nextToken() );
		
	}//end Triangle( StringTokenizer )
		
	//calculatePerimeter method from abstract Shape class, perimeter = side1 + side2 + side3
	@Override
	public double calculatePerimeter()
	{
		return ( firstSide + secondSide + thirdSide );
			
	}//end calculatePerimeter
		
	//calculateArea method from abstract Shape class
	//Heron's formula: http://www.mathopenref.com/heronsformula.html
	//p = ( side1 + side2 + side3 ) / 2
	//area = squareRoot( p * ( p - side1 ) * ( p - side2 ) * ( p - side3 ) )
	@Override
	public double calculateArea()
	{
		double p = ( firstSide + secondSide + thirdSide ) / 2.0;
		return ( Math.sqrt(p * ( p - firstSide ) * ( p - secondSide ) * ( p - thirdSide ) ) );
		
	}//end calculateArea
	
	//getName method from abstract Shape class
	@Override
	public String getName()
	{
		return "triangle";
		
	}//end getName
		
	//getter method for first side
	public double getFirstSide()
	{
		return firstSide;
		
	}//end getFirstSide
	
	//getter method for second side
	public double getSecondSide()
	{
		return secondSide;
		
	}//end getSecondSide
	
	//getter method for third side
	public double getThirdSide()
	{
		return thirdSide;
		
	}//end getThirdSide
		
	//setter method for first side
	public void setFirstSide( double s1 )
	{
		firstSide = s1;
		
	}//end setFirstSide
	
	//setter method for second side
	public void setSecondSide( double s2 )
	{
		secondSide = s2;
		
	}//end setSecondSide
	
	//setter method for third side
	public void setThirdSide( double s3 )
	{
		thirdSide = s3;
		
	}//end setThirdSide
		
	//main method
	public static void main(String[] args) 
	{
		System.out.println("Inside main method of Triangle class.");
		
	}//end main
		
}//end Triangle class
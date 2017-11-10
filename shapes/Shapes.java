// Shapes.java
// Dongpeng Xia
// Contains a list of shapes.

package shapes;

import java.util.*;
import java.io.*;

public class Shapes
{
	//list of shapes
	protected LinkedList<Shape> shapesList;
   
	//main method
	public static void main( String[] args )
	{
		new Shapes();
		
	}//end main method
   
   // constructor, reads a file of shapes and adds them to the list
   public Shapes()
   {
	   String fileName;
	   Scanner in = new Scanner(System.in);
	   
	   //Prompt for file name and path
	   System.out.print("Please enter file name and path to load: ");
	   fileName = in.nextLine();
	   
	   //initialize list of shapes
	   shapesList = new LinkedList<Shape>();
	   try
	   {
		   //Open the file
		   File file = new File(fileName);
		   FileReader fileRead = new FileReader( file );
		   BufferedReader bufferRead = new BufferedReader( fileRead );
		   
		   //Process lines
		   String line;
		   while ( (line = bufferRead.readLine()) != null )
		   {
			   handleLine( line );
		   }
		   bufferRead.close();
		   
	   }//end try
	   catch ( Exception e )
	   { 
		   System.out.println( "File Error: " + e ); 
		   
	   }//end catch
	   
	   in.close();
	   report();
	   
   }//end Shapes
   
   // Process a line from the file, expecting shapes
   // Catch any errors in line
   public void handleLine( String line )
   {
	   try
	   {
		   System.out.println("Processing: " + line);
		   StringTokenizer st = new StringTokenizer( line );
		   String type = st.nextToken();
		   //Determine what kind of shape to make
		   if      ( type.toLowerCase().equals("rectangle") ) { shapesList.add( new Rectangle(st) ); }
		   else if ( type.toLowerCase().equals("square"   ) ) { shapesList.add( new Square(st) ); }
		   else if ( type.toLowerCase().equals("triangle" ) ) { shapesList.add( new Triangle(st) ); }
		   else if ( type.toLowerCase().equals("circle"   ) ) { shapesList.add( new Circle(st) ); }
		   else { System.out.println("Sorry, but the requested shape is not available."); }
		   
	   }//end try
	   catch (NoSuchElementException n) {}//end catch
	   catch (Exception e )
	   { 
		   System.out.println("Error in line: " + e );
		   
	   }//end catch
   }//end handleLine
   
   //Print areas and perimeters of shapes
   public void report()
   {
	   System.out.println();
	   System.out.println();
	   System.out.println("Shape Areas and Perimeters:");
	   double totalArea = 0;
	   double totalPerimeter = 0;
	   
	   Iterator<Shape> iter = shapesList.iterator();
	   while ( iter.hasNext() )
	   {
		   Shape s = iter.next();
		   totalArea += s.calculateArea();
		   totalPerimeter += s.calculatePerimeter();
		   //Formatted output
		   System.out.format("%10s: Area: %10.2f           Perimeter: %10.2f%n", s.getName(), s.calculateArea(), s.calculatePerimeter());
	   }
	   System.out.println();
	   System.out.println();
	   System.out.format( "totalArea=%.3f%ntotalPerimeter=%.3f%n", totalArea, totalPerimeter );
   }//end report
}//end Shapes
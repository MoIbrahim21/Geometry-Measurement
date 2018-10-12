import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Geometrycalculator {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter your name:  ");
		String Name; 
		String name= user.nextLine();
		System.out.println("\n\n Hello, " + name + ", Welcome to the Geometry Calculator!");
		System.out.println("Press enter to continue...");
		user.nextLine(); //this just stops the program till the reader presses enter again
		System.out.println("Area of a Triangle");
		System.out.print("Please enter the measure of the base:  ");
		String baseStr = user.nextLine();
		System.out.print("\nPlease enter the measure of the height:  ");
		String heightStr = user.nextLine();
		double base;
		base = Double.parseDouble(baseStr);
		double height = Double.parseDouble(heightStr);
		System.out.print("Please enter the unit of measure: ");
		String unit = user.nextLine();
		double area = .5*(base * height);
		System.out.println("The area of the tringle is " + area +" " + unit + ""^2");
		
	}

}
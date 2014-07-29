import java.util.Scanner; 

public class BMICalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
				
		double pounds, inches, meters, kilos, feet, BMI;
		
		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): " );
		inches = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();
		
		meters = 0.0254 * (inches + (feet * 12));
		kilos = 0.453592 * pounds;
		BMI = ( kilos / (meters * meters) );
			
		System.out.println( "Your BMI is " + BMI );
	}
}
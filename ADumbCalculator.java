import java.util.Scanner; 

public class ADumbCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
				
		double number1, number2, number3, x;
		
		System.out.print( "What is your first number? " );
		number1 = keyboard.nextDouble();
		
		System.out.print( "What is your second number? " );
		number2 = keyboard.nextDouble();
		
		System.out.print( "What is your third number? " );
		number3 = keyboard.nextDouble();
		
		x = (number1 + number2 + number3) / 2;
		
		System.out.println( "( " + number1 + " + " + number2 + " + " + number3 + " ) / 2 is..." + x ); 
	}
}
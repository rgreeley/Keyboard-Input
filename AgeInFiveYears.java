import java.util.Scanner; 

public class AgeInFiveYears
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
				
		int thepast, thefuture, age;
		String name;
		
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "\nHi, " + name + "! How old are you:" );
		age = keyboard.nextInt();
		
		thepast = age - 5;
		thefuture = age + 5;
		
		System.out.println( "\nDid you know that in five years you will be " + thefuture + " years old?" );
		System.out.println( "And five years ago you were " + thepast + "! Imagine!" );
	}
}
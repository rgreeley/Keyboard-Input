import java.util.Scanner; 

public class NameAgeAndSalary
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
				
		int age, money;
		String name;
		
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you?" );
		age= keyboard.nextInt();
		
		System.out.print( "So you're " + age + ", eh? That's not old at all! How much do you make," + name + "?" );
		money = keyboard.nextInt();
		
		System.out.println( money + "! I hope that's per hour and not per year! LOL!" );	
	}
}
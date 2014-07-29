import java.util.Scanner; 

public class MoreUserInputData
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
				
		int grade, studentId;
		String FirstName, LastName, LogIn;
		double gpa;
		
		System.out.println( "Please enter the following information so I can sell it for a profit!" );
		
		System.out.print( "\nFirst Name: " );
		FirstName = keyboard.next();
		
		System.out.print( "Last name:" );
		LastName = keyboard.next();
		
		System.out.print( "Grade (9-12):" );
		grade = keyboard.nextInt();
		
		System.out.print( "Student ID:" );
		studentId = keyboard.nextInt();
		
		System.out.print( "Login:" );
		LogIn = keyboard.next();
		
		System.out.print( "GPA (0.0-4.0)" );
		gpa = keyboard.nextDouble();
		
		
		System.out.println( "\nYour Information:" );
		System.out.println( "\tLogin: " + LogIn );
		System.out.println( "\tID: " + studentId );
		System.out.println( "\tName: " + LastName + ", " + FirstName );
		System.out.println( "\tGPA: " + gpa );
		System.out.println( "\tGrade: " + grade );
	}
}
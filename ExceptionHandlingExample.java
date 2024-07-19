import java.util.*;

public class ExceptionHandlingExample 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int fixedNumber = 10;

        try 
		{
            // Prompt the user to input a number
            System.out.print("Enter a number to divide " + fixedNumber + " by: ");
            int userInput = scanner.nextInt();

            // Attempt to divide the fixed number by the user-provided number
            int result = fixedNumber / userInput;
            System.out.println("Result: " + result);
        } 
		catch (ArithmeticException e) 
		{
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } 
		catch (Exception e) 
		{
            // Handle any other exceptions
            System.out.println("Error: An unexpected error occurred.");
        } 
		finally 
		{
            // Cleanup operations
            scanner.close();
            System.out.println("Scanner closed. Program finished.");
        }
    }
}

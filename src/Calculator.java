import java.util.Scanner;
public class Calculator 
{

	String userInput = null;

	public String calculate(String tempNumToDelete)
	{
		userInput = askForUserInput();

	
		return askForUserInput();
		
	}
	
	
	public String askForUserInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What would you like to calculate?");
		userInput = scanner.nextLine();
		scanner.close();
		return userInput;
		
	}
	

	
	
	
	
}

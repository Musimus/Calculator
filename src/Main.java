import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();
		
		System.out.println(calc.calculate(askForUserInput()));
	}
	
	public static String askForUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What would you like to calculate?");
		String userInput = scanner.nextLine();
		scanner.close();
		return userInput;
		
	}

}

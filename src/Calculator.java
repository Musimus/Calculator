import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
	String userInput = null;

	public String calculate(String tempNumToDelete){
		userInput = askForUserInput();
		stringSplitter(userInput);

		return "answer :)";
		
	}
	
	public String askForUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What would you like to calculate?");
		userInput = scanner.nextLine();
		scanner.close();
		return userInput;
		
	}
	public void stringSplitter(String userInput) {
		boolean[] charListBooleans = new boolean[userInput.length()];
		Arrays.fill(charListBooleans, Boolean.FALSE);
		int charAmount = userInput.length();
		for(int i = 0; i < charAmount; i++) {
			if(testForNumber(userInput.charAt(i))) {
				charListBooleans[i] = true;
			}
			
		}
		testToCheckBooleans(charListBooleans);
	}
	public boolean testForNumber(char charToTest) {
		boolean charIsNum = false;
		switch(charToTest) {
			case 1 :
			case 2 :
			case 3 :
			case 4 :
			case 5 :
			case 6 :
			case 7 : 
			case 8 :
			case 9 :
			case 0 :
				charIsNum = true; 
				break;
			default : 
				break;
		}
		
		return charIsNum;
	}
	public void testToCheckBooleans(boolean[] testarray) {
		for(int i = 0; i < testarray.length; i++) {
			if(testarray[i])
				System.out.println(i + "space is true");
			else
				System.out.println(i + "space is false");
		}
	}
}

/*


My switch statement is not working and i need to fix it



*/
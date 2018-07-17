


public class Calculator {

	private int newNumber = 0;
	private int answer = 0;
	private char symbol = '0';
	private boolean answerIsNeg = false;
	private boolean newNumberIsNeg = false;
	


	public String calculate(String userInput){
		boolean reachedSymbol = false;
		boolean firstNumGenerated = false;
		char charToTest = '0';
		for(int i = 0; i < userInput.length(); i++) {
			charToTest = userInput.charAt(i);
			if(charToTest == ' ');
			else if(charToTest == '-' && !firstNumGenerated && answer == 0)
				answerIsNeg = true;
			else if(isDigit(charToTest) && !firstNumGenerated)
				answer = answer * 10 + getDigit(charToTest);
			
			else if(!isDigit(charToTest) && !reachedSymbol) {
				reachedSymbol = true;
				firstNumGenerated = true;
				symbol = charToTest;
			}
			else if(isDigit(charToTest) && reachedSymbol)
				newNumber = newNumber * 10 + getDigit(charToTest);
			else if(!isDigit(charToTest) && reachedSymbol) {
				doTheMath();
				newNumber = 0;
				symbol = charToTest;
			}

			
			
		}
		doTheMath();
		return "The answer is: " + answer;
		
		
	}

	private boolean isDigit(char charToTest) {
		return charToTest >= '0' && charToTest <= '9';
	}
	private int getDigit(char charToConvert) {
		return charToConvert - '0';
	}
	private void doTheMath() {
//		System.out.println("First Number: " +answer );
//		System.out.println("Second Number: " +newNumber );
		
		if(answerIsNeg)
			answer = 0 - answer;
		if(newNumberIsNeg)
			newNumber = 0 - newNumber;
		
		if(symbol == '+')
			answer = answer + newNumber;
		if(symbol == '-')
			answer = answer - newNumber;
		
		
		
	}
	
}

/*TODO
      12 + 17 + 4 + 10 
      
      	int number1 = 0;
		int number2 = 0;
		int answer = 0;
		char symbol = 0;
		
		for(int i = 0; i < userInput.length(); i++){
			char charToTest = userInput.charAt(i);
			if(isDigit(charToTest) && symbol == 0)
				number1 = number1 * 10 + getDigit(charToTest);
			else if(symbol == 0 && !isDigit(charToTest))
				symbol = charToTest;
			else if(isDigit(charToTest))
				number2 = number2 * 10 + getDigit(charToTest);
		}
		if(symbol == '+')
			answer = number1 + number2;
		if(symbol == '-')
			answer = number1 - number2; 
		
 */

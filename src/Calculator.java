


public class Calculator {

	Debugger debugger = new Debugger();
	


	public int calculate(String userInput){
		
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
		
		return answer;
		
	}

	private boolean isDigit(char charToTest) {
		return charToTest >= '0' && charToTest <= '9';
	}
	private int getDigit(char charToConvert) {
		return charToConvert - '0';
	}
	
}

/*TODO
      12 + 17 + 4
 * 
 * 
 * 
 * 	public boolean[] booleanGenerator(String userInput) {
		boolean[] charListBooleans = new boolean[userInput.length()];
		Arrays.fill(charListBooleans, Boolean.FALSE);
		for(int i = 0; i < userInput.length(); i++) {
			if(isDigit(userInput.charAt(i)))
				charListBooleans[i] = true;
		}
		debugger.testBooleans(charListBooleans);
		return charListBooleans;
	}
 */

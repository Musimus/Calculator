import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSingleDigitSingleAdd() {
		Calculator calculator = new Calculator();
		String result = calculator.calculate("4+7");
		assertEquals("11", result);
	}
	
	@Test
	void testSingleDigitSingleSubtract() {
		Calculator calculator = new Calculator();
		String result = calculator.calculate("2-7");
		assertEquals("-5", result);
	}
	
	@Test
	void testSingleDigitMultipleAddSubtract() {
		Calculator calculator = new Calculator();
		String result = calculator.calculate("1+2-4+8");
		assertEquals("7", result);
	}
	
	@Test
	void testMultipleDigitsSingleAdd() {
		Calculator calculator = new Calculator();
		String result = calculator.calculate("1337+47");
		assertEquals("1384", result);
	}
	
	@Test
	void testMultipleDigitsSingleSubtract() {
		Calculator calculator = new Calculator();
		String result = calculator.calculate("1024-69");
		assertEquals("955", result);
	}
	
	@Test
	void testMultipleDigitsMultipleAddSubtract() {
		Calculator calculator = new Calculator();
		String result = calculator.calculate("2720-152+457-98052");
		assertEquals("-95027", result);
	}
	
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	void testSingleDigitSingleAdd() {
		String result = calculator.calculate("4+7");
		assertEquals("11", result);
	}

	@Test
	void testSingleDigitSingleSubtract() {
		String result = calculator.calculate("2-7");
		assertEquals("-5", result);
	}

	@Test
	void testSingleDigitMultipleAddSubtract() {
		String result = calculator.calculate("1+2-4+8");
		assertEquals("7", result);
	}

	@Test
	void testMultipleDigitsSingleAdd() {
		String result = calculator.calculate("1337+47");
		assertEquals("1384", result);
	}

	@Test
	void testMultipleDigitsSingleSubtract() {
		String result = calculator.calculate("1024-69");
		assertEquals("955", result);
	}

	@Test
	void testMultipleDigitsMultipleAddSubtract() {
		String result = calculator.calculate("2720-152+457-98052");
		assertEquals("-95027", result);
	}

}

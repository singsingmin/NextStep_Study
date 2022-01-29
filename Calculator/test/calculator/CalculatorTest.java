package calculator;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
	}
	
	@Test
	public void add() {
		assertEquals(9, cal.add(6, 3));
	}
	
	@Test
	public void subtract() {
		assertEquals(5, cal.subtract(10, 5));
	}
}

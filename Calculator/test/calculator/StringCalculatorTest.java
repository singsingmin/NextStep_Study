package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private StringCalculator cal;
	
	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	
	@Test
	public void add_null_�Ǵ�_����() {
		assertEquals(0, cal.add(null));
		assertEquals(0, cal.add(""));
	}
	
	@Test
	public void add_�����ϳ�() {
		assertEquals(1, cal.add("1"));
	}
	
	@Test
	public void add_��ǥ������() {
		assertEquals(3, cal.add("1,2"));
	}
	
	@Test
	public void add_��ǥ_�Ǵ�_�ݷб�����() {
		assertEquals(6, cal.add("1,2:3"));
	}
	
	@Test
	public void add_Ŀ���ұ�����() {
		assertEquals(6, cal.add("//;\n1;2;3"));
	}
	
	@Test(expected = RuntimeException.class)
	public void add_����_����ó��() {
		cal.add("-1,2,3");
	}
}

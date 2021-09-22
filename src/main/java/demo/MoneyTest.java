package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testAddEuros() {
		Money m1 = new Money(20, "EUR");
		Money m2 = new Money(10, "EUR");
		
		Money expected = new Money(30,"EUR");
		
		assertEquals(expected,m1.add(m2));
	}
}

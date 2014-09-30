package UnitTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Banking.*;

public class CustomerTest {

	Customer c;
	int initialCash = 1000;
	String awesomePassword = "JamesBrownRocks";
	
	@Before
	public void setUp() throws Exception {
		c = new Customer(initialCash, awesomePassword);
	}

	@Test
	public void test() {
		int takeAmount = 100;
		int amountTaken = c.takeCash(takeAmount);
		
		assertTrue("Take equals Taken", takeAmount == amountTaken);
	}

}

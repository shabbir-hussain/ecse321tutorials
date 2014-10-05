package UnitTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Banking.*;
;

public class AccountTest extends Account {

	public AccountTest(int initCash, String newPassword) {
		super(initCash, newPassword);
		// TODO Auto-generated constructor stub
	}

	public  Account ac =new Account(100,"pass");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		
	}

}

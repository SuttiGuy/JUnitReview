import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest4 {

	Calculator c1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c1= new Calculator() ;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddNumberCase1() {
		Calculator c1= new Calculator() ;
		c1.addNumber(6, 6);
		assertEquals(12,c1.getResult());
	}

	@Test
	public void testAddNumberCase2() {
		Calculator c1= new Calculator() ;
		c1.addNumber(-5, 6);
		assertEquals(1,c1.getResult());
	}

}

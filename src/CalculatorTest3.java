import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest3 extends TestCase {

	Calculator c1;
	protected void setUp() throws Exception {
		c1= new Calculator() ;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
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

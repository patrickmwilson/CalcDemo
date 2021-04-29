package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import classes.Calculator;

public class CalcTest {
	
	private Calculator calc;
	
	@BeforeClass
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test
	public void addSuccess() {
		int result = calc.add(1, 1);
		Assert.assertEquals(result, 2);
	}
	
	
}

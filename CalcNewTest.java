package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcNewTest {

	@Test
	void additiontest() {
		CalcNew test1=new CalcNew();
		int case1=test1.addition(10, 20);
			assertEquals(30, case1);
		
		int case2=test1.addition(-100, -200);
			assertEquals(-300, case2);
	}
	
	void subtractiontest() {
		CalcNew test2=new CalcNew();
		int case1=test2.subtraction(200, 100);
				assertEquals(100, case1);
		
		int case2=test2.subtraction(-100, -200);
			assertEquals(-300, case2);
		
	}
	void multiplicationtest() {
		CalcNew test3=new CalcNew();
		int case1=test3.multiplication(20, 20);
		assertEquals(400, case1);
	}
	void divisiontest() {
		CalcNew test4=new CalcNew();
		int case1=test4.division(25, 5);
		assertEquals(5, case1);
		
		
		
		
	}

}

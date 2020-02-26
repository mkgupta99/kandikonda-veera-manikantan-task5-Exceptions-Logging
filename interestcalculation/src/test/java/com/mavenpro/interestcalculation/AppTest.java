package com.mavenpro.interestcalculation;
import junit.framework.TestCase;


import java.util.logging.Logger;
public class AppTest 
    extends TestCase
{

	final static Logger logger = Logger.getLogger("AppTest.java");
	public void test() {

		Interest i = new Interest();
		logger.info("Principal,rate,and time of Interest should be greater than zero");

		double answer = i.simpleInterest(500, 20, 5);

		assertEquals(500, answer,0.1);
		
		answer = i.compoundInterest(500, 10, 2);

		assertEquals(105,answer,0.1);

	}
}

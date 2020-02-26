package com.mavenpro.constructioncost;
import junit.framework.TestCase;
import java.util.logging.Logger;

public class AppTest 
    extends TestCase
{
	 final static Logger logger = Logger.getLogger("AppTest.java");
	public void test() {
		logger.info("material,area and automation should not be zero or null");
		Constructioncost cc = new Constructioncost();

		double answer = cc.costForMaterial("Standard", 500, false);

		assertEquals(600000,answer,0.001);

	}
}
package com.mavenpro.interestcalculation;
import java.util.logging.Logger;
import java.util.logging.*; 

public class Interest {
	final Logger logger = Logger.getLogger("Interest.java");
	
	public double simpleInterest(double principal,double rate,double time) {

		logger.info("Principal,rate,and time of Interest should be greater than zero");
		if(principal<0||rate<0||time<0)
		{
			logger.warning("Principal,rate and Time can't be less than Zero");
		}

		return (principal*rate*time)/100;

	}

	public double compoundInterest(double principal,double rate,double time) {

		logger.info("Principal,rate,and time of Interest should be greater than zero");
		if(principal<0||rate<0||time<0)
		{
			logger.warning("Principal,rate and Time can't be less than Zero");
		}
		return principal*(Math.pow(1+rate/100, time)-1);

	}

}

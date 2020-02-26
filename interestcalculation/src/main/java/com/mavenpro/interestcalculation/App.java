package com.mavenpro.interestcalculation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class App 
{

	private static final Logger Logger = LogManager.getLogger(App.class);
    public static void main(String[] args)
    {
    	Logger.info("Enter Principal,Rate and Time of interest\n");
       Interest test =new Interest();
        Scanner sc=new Scanner(System.in);
        double principal=sc.nextDouble();
        double rate=sc.nextDouble();
        if(rate==0)
		{
			Logger.error("Arithmetic Exception found \n Program Terminated");
			return;
		}
        double time=sc.nextDouble();
        Logger.debug(test.simpleInterest(principal,rate,time));
        Logger.debug(test.compoundInterest(principal,rate,time));
        sc.close();
    }
}
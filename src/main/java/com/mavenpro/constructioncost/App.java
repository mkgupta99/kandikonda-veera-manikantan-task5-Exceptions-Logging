package com.mavenpro.constructioncost;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
    public static void main( String[] args )
    {
    	final Logger Logger = LogManager.getLogger(App.class);
    	Constructioncost test= new Constructioncost();
        Scanner sc=new Scanner(System.in);
        Logger.info("Enter Standard or AboveStandard or HighStandard or FullyAutomated:\n"); 
        String material=sc.nextLine();
        Logger.info("Enter Area Value:\n");
        double Area = sc.nextDouble();
        Logger.info("Enter Automation value(True or False):\n");
        boolean automation=sc.nextBoolean();
        Logger.debug(test.costForMaterial(material,Area,automation));
        sc.close();
    }
}
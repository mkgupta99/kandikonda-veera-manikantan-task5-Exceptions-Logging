package com.mavenpro.constructioncost;

import java.util.logging.Logger;

public class Constructioncost {
	final static Logger logger = Logger.getLogger("Constructioncost.java");
		public double costForMaterial(String material,double area,boolean automation) {

			if(material==null||area<=0||automation!=(true&&false))
			{
		       logger.warning("material,area and automation can't be Null");
			}
			
			if(material.equals("Standard") && automation==false) {
				return 1200*area;
			}
			else if(material.equals("AboveStandard") && automation==false) {
				return 1500*area;
			}
			else if(material.equals("HighStandard") && automation==false) {
				return 1800*area;
			}
			else {
				return 2500*area;
			}
		}
}
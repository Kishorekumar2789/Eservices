package com.Eservices.BrowserFactory;

import java.util.Arrays;
import java.util.List;

public class InsuranceEnum {

	
	

		public enum insuranceTypes{
		Billing,
		PolicyDetails,
		Claims,
		Documents,
		}

		public static List<insuranceTypes> enumList(){
		  List<insuranceTypes> list = Arrays.asList(insuranceTypes.values());
		  return list;
		}
		}
	


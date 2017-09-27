package com.sample;

import java.text.SimpleDateFormat;
import java.util.Date;



public class TestMendixDate {
	
	
	public static void main(String[] args) throws Exception{
		
		/*J_CalculateDateInDays jC = new J_CalculateDateInDays(42735.00);
		jC.executeAction();*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		Date date = sdf.parse("12/12/2016");
		System.out.println(date);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd MM yyyy");		
		String newDateString = sdf2.format(date);
		System.out.println(newDateString);
		
		
		
	}
	
	
	
	
	

}

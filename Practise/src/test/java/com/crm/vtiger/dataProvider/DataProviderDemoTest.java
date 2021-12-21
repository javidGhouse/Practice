package com.crm.vtiger.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {
		
	@Test(dataProvider="bookTicketDataProvider")
	public void ticketBooking(String src,String destn)
	{
		System.out.println("Ticket Booking Confirmed From "+src+" to "+destn);
		System.out.println("Have asafe jour\ney");
	}
	@DataProvider Object[][] bookTicketDataProvider()
	{
		Object[][] obj=new Object[5][2];
		obj[0][0]="Chennai";
		obj[0][1]="Bangalore";
		
		obj[1][0]="Chennai";
		obj[1][1]="Pune";
		
		obj[2][0]="Chennai";
		obj[2][1]="Agra";
		
		obj[3][0]="Chennai";
		obj[3][1]="Jharkand";
		
		obj[4][0]="Chennai";
		obj[4][1]="Kerala";
		
		return obj;
	}
	
}

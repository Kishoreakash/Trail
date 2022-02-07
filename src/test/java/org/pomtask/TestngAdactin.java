package org.pomtask;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngAdactin extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
		maximize();
	}
		
	@Test
	public  void searchHotels() throws Exception {
		LoginPage login = new LoginPage();
		login.login("Kishoreakash", "C1PJQ9");
		
		SearchHotelPage srHotel = new SearchHotelPage();
		srHotel.searchHotelPage("Sydney","Hotel Creek","Standard","1 - One","01/02/2022","02/02/2022","1 - One","1 - One");
		
		SelectHotelPage sHotel= new SelectHotelPage();
		sHotel.selectHotel();
		
		BookingPage bPage= new BookingPage();
		bPage.bookingHotel("kishore","akash","thoraipakkam","1234567890987654","American Express","January","2012","1234");
		
		Thread.sleep(6000);
		CancelBookingPage cBooPage= new CancelBookingPage();
		cBooPage.cancelBooking();
		
		
		
		
	}


	}



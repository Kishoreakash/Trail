package org.pomtask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	
	public  SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "location")
	private WebElement dDnLocation;
	
	@FindBy(id= "hotels")
	private WebElement dDnHotels;
	
	@FindBy(id= "room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id= "room_nos")
	private WebElement dDnRoomNos;
	
	@FindBy(id= "datepick_in")
	private WebElement dDnDatePickIn;

	@FindBy(id= "datepick_out")
	private WebElement dDnDatePickOut;
	
	@FindBy(id= "adult_room")
	private WebElement dDnAdultRoom;
	
	@FindBy(id= "child_room")
	private WebElement dDnChildRoom;
	
	@FindBy(id= "Submit")
	private WebElement dDnSubmit;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNos() {
		return dDnRoomNos;
	}

	public WebElement getdDnDatePickIn() {
		return dDnDatePickIn;
	}

	public WebElement getdDnDatePickOut() {
		return dDnDatePickOut;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getdDnSubmit() {
		return dDnSubmit;
	}
	
	public void searchHotelPage(String location,String hotels,String roomType,String RoomNos,String DatePickIn,String DatePickOut,String AdultRoom,String ChildRoom )
	{
		selectOptionsByText(getdDnLocation(),location);
		selectOptionsByText(getdDnHotels(),hotels);
		selectOptionsByText(getdDnRoomType(),roomType);
		selectOptionsByText(getdDnRoomNos(),RoomNos);
		type(getdDnDatePickIn(),DatePickIn);
		type(getdDnDatePickOut(),DatePickOut);
		selectOptionsByText( getdDnAdultRoom(),AdultRoom);
		selectOptionsByText(getdDnChildRoom(),ChildRoom);
		click(getdDnSubmit());
		

	}
	
	
	

}

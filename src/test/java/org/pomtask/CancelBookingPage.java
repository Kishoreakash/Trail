package org.pomtask;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass{
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="my_itinerary")
	private WebElement itinerary;
	
	@FindBy(xpath= "(//*[@class='select_text'])[1]")
	private WebElement orderId;
	
	@FindBy(name="order_id_text")
	private WebElement oNo;
	
	@FindBy(id="search_hotel_id")
	private WebElement clickGo;
	
	@FindBy(xpath="(//*[@type='button'])[1]")
	private WebElement orderCancel;

	public WebElement getOrderCancel() {
		return orderCancel;
	}

	public WebElement getClickGo() {
		return clickGo;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getorderId () {
		return orderId;
	}
	public void cancelBooking() {
		click(getItinerary());
		String ordId = getAttributeValue(getorderId());
		System.out.println(ordId);
		type(oNo, ordId);
		click(clickGo);
		click(orderCancel);
		alertAccept();
		
	}

}

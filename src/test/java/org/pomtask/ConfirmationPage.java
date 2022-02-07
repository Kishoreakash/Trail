package org.pomtask;

import org.meta.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BaseClass1 {
	
	public ConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement oNo;

	public WebElement getoNo() {
		return oNo;
	}
	public void bookingPage() {
		click(getoNo());

	}
	
	

}

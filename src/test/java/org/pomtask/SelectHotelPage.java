package org.pomtask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement btnRadio;
	
	@FindBy(id="continue")
	private WebElement Continue;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
	public void selectHotel() {
		
		click (getBtnRadio());
		click(getContinue());

	}
	

}

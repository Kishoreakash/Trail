package org.pomtask;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass {
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "first_name")
	private WebElement fName;
	
	@FindBy(id= "last_name")
	private WebElement lName;
	
	@FindBy(id= "address")
	private WebElement add;
	
	@FindBy(id= "cc_num")
	private WebElement cNum;
	
	@FindBy(id= "cc_type")
	private WebElement cType;
	
	@FindBy(id= "cc_exp_month")
	private WebElement cExpMon;
	
	@FindBy(id= "cc_exp_year")
	private WebElement cExpYear;
	
	@FindBy(id= "cc_cvv")
	private WebElement cNum1;
	
	@FindBy(id= "book_now")
	private WebElement bNow;

	private String firstName;
	

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getcNum() {
		return cNum;
	}

	public WebElement getcType() {
		return cType;
	}

	public WebElement getcExpMon() {
		return cExpMon;
	}

	public WebElement getcExpYear() {
		return cExpYear;
	}

	public WebElement getcNum1() {
		return cNum1;
	}

	public WebElement getbNow() {
		return bNow;
	}

	
	public void bookingHotel(String firstName,String lastName,String address,String ccNum,String cType, String expMonth, String expYear, String ccv) {
		
		type(getfName(),firstName);
		type(getlName(),lastName);
		type(getAdd(),address);
		type(getcNum(),ccNum);
		selectOptionsByText(getcType(),cType);
		selectOptionsByText(getcExpMon(),expMonth);
		selectOptionsByText(getcExpYear(),expYear);
		type(getcNum1(),ccv);
		click(getbNow());
		
		
	}
	
	

}

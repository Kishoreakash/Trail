package org.pomtask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
//locators	
	@FindBy(id= "username")
	private WebElement txtUserName;
	
	@FindBy(id= "password")
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	//generate getters

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String username, String password) {
		
		type(getTxtUserName(), username);
		type(getTxtPass(),password);
		click(getBtnLogin());
		
	}
}





package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	@CacheLookup
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@type='text']")})
	private WebElement txtUser;
	
	
	@CacheLookup
	@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@placeholder='Password']")})
	private WebElement txtPass;
	@CacheLookup
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
		
		
	

}

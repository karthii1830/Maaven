package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage extends BaseClass {
	
        public CreatePage() {
        	
        	PageFactory.initElements(driver,this);
			
		}
        @FindBy(xpath="//a[text()='Create new account']")
        private WebElement crebtn; 
        
        @FindBy(xpath="//input[@name='firstname']")
        private WebElement firstname;
        
        @FindBy(xpath="//input[@name='lastname']")
        private WebElement surname;
        
        @FindBy(xpath="//option[@value='18']")
        private WebElement date;
        
        @FindBy(xpath="//option[text()='Feb']")
        private WebElement month;
        
        @FindBy(xpath="//option[text()='1994']")
        private WebElement year;
        
        @FindBy(xpath="//label[text()='Male']")
        private WebElement gender;
        
        @FindBy(xpath="//input[@name='reg_email__']")
        private WebElement moblie;
        
        @FindBy(xpath="//input[@name='reg_passwd__']")
        private WebElement password;
        
        @FindBy(xpath="//button[text()='Sign Up']")
        private WebElement signup;
        
		public WebElement getCrebtn() {
			return crebtn;
		}
		public WebElement getFirstname() {
			return firstname;
		}
		public WebElement getSurname() {
			return surname;
		}
		public WebElement getDate() {
			return date;
		}
		public WebElement getMonth() {
			return month;
		}
		public WebElement getYear() {
			return year;
		}
		public WebElement getGender() {
			return gender;
		}
		public WebElement getMoblie() {
			return moblie;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getSignup() {
			return signup;
		}
			

		 
        
}

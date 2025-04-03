package org.sample;

import org.base.BaseClass;
import org.pom.CreatePage;
import org.pom.LoginPage;




public class Sample extends BaseClass{

	public static void main(String[] args) {
		
		browserLaunch("chrome");
		
		urlLaunch("https://www.facebook.com/");
		
		implicitWait(10);
		
		LoginPage l=new LoginPage();
		
		sendKeys(l.getTxtUser(),"kingmaker535@gmail.com");
		sendKeys(l.getTxtPass(),"535makerking");
		click(l.getBtnLogin());
		
		CreatePage c=new CreatePage();
		
				
		
		click(c.getCrebtn());
		sendKeys(c.getFirstname(), "Karthik");
		sendKeys(c.getSurname(), "Ayyasamy");
		click(c.getDate());
		click(c.getMonth());
		click(c.getYear());
		click(c.getGender());
		sendKeys(c.getMoblie(), "9876543210");
		sendKeys(c.getPassword(),"123456789");
        click(c.getSignup()); 		
		
	
		
		

		
		
		
		

	}

}

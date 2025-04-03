package org.juniit;

import org.base.BaseClass;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.pom.CreatePage;
import org.pom.LoginPage;



public class Sample extends BaseClass {
	
	LoginPage l=new LoginPage();
	CreatePage c=new CreatePage();
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		LaunchBrowser("chrome");
		urlLaunch("https://www.facebook.com/");
		implicitWait(10);
		System.out.println("Before Class");	

	}
	
	@AfterClass
	public static void afterclass() {
		quit();
		System.out.println("After Class");

	}
	@Before
	public  void before() {
		System.out.println("Before");

	}	
	
	@After
	public void after() {
		System.out.println("After");
		
	}
	
	@Test
	public  void test1() {

		urlLaunch("https://www.facebook.com/");
		String url = getCurrentUrl();
		boolean con = url.contains("facebook");
		Assert.assertTrue("verify url", con);
        
		sendKeys(l.getTxtUser(),"kingmaker535@gmail.com");
		
		String atu = getAttribute(l.getTxtUser());
		Assert.assertEquals("verify user","kingmaker535@gmail.com" , atu);
		
		sendKeys(l.getTxtPass(),"555makerking");
		String atp = getAttribute(l.getTxtPass());
		Assert.assertEquals("verify pass", "555makerking", atp);
		
		click(l.getBtnLogin());
	    String url1 = getCurrentUrl();
	    boolean lgn = url1.contains("facebook");
		Assert.assertTrue("facebook", lgn);
		
		System.out.println("Test 1");

	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("Test 2");
		
	}
	@Test
	public void test3() {
		urlLaunch("https://www.facebook.com/");
		click(c.getCrebtn());
		sendKeys(c.getFirstname(), "karthik");
		sendKeys(c.getSurname(),"Ayyasamy");
		click(c.getDate());
		click(c.getMonth());
		click(c.getYear());
		click(c.getGender());
		click(c.getMoblie());
		click(c.getPassword());
		click(c.getSignup());
		System.out.println("Test 3");
		
	}
	

}

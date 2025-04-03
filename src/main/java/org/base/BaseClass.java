package org.base;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriver LaunchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			
				
		 driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		return driver;
		}
	public static WebDriver browserLaunch(String browser) {
		switch (browser) {
		case "chrome":
			driver =new ChromeDriver();
			break;
		case "edge":
			driver =new EdgeDriver();
		break;
		case "firefox":
			driver =new FirefoxDriver();
			break;
			default:
				System.out.println("INVALID");
		}
		return driver;
	}
		

	
	
	public static void urlLaunch(String url) {
		
	driver.get(url);
	driver.manage().window().maximize();
	}
	
	public static void implicitWait(long sec) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public static void sendKeys(WebElement e,String value) {
		e.sendKeys(value);

	}
	public static void click(WebElement e) {
		 
		e.click();

	}
	public static void quit() {
		driver.quit();

	}
	
	public static String getCurrentUrl() {
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
		
    }
	
	public static String getText(WebElement e) {
		
		String text = e.getText();
		System.out.println(text);
		return text;

	}
	
	public static String getAttribute(WebElement e) {
		String att = e.getAttribute("value");
		System.out.println(att);
		return att;
		

	}
	public static void close() {
		driver.close();
		

	}
	//Actions
	
	public static void moveToElement(WebElement tar) {
		Actions a=new Actions(driver);
		a.moveToElement(tar).perform();

	}
	//Drag and Drop
	
	
	
	public static void dragAndDrop(WebElement src,WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).build().perform();

	}
	public static void doubleclick(WebElement txt) {
		Actions a=new Actions(driver);
		a.doubleClick(txt).perform();
	}
	public void contextClick(WebElement txt) {
		Actions a=new Actions(driver);
		a.contextClick(txt).perform();
    }
	//Alert
	public void a		() {
		Alert a=driver.switchTo().alert();
		a.sendKeys("");

	}
		

	
	
	//selectbyindex
	
	public static void selectByValue(WebElement e,String index) {
		Select s=new Select(e);
		s.selectByValue("value");
	}
	public static void selectByVisibleText(WebElement e,String index) {
		Select s=new Select(e);
		s.deselectByVisibleText("text");
	}
	public static void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	//getOption
	public static void getoption(WebElement e) {
	     Select s=new Select(e);
	     s.getOptions();
	}
//	getallselectedoptions
	public static void GetAllSelectedOptions(WebElement e) {
		Select s=new Select(e);
		s.getAllSelectedOptions();
	}
//	GetFirstSelectedOption
	public static void GetFirstSelectedOption(WebElement e) {
		Select s=new Select(e);
		s.getFirstSelectedOption();
	}
	//isMultiple
	public static void IsMulitiple(WebElement e ) {
         Select s=new Select(e);    	
         s.isMultiple();   
	}
	//
    //deselect	
	public static void deselectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.deselectByIndex(index);	
	}
	public static void deselectByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.deselectByValue("value");
	}
	public static void deselectByVisibleText(WebElement e,String text) {
		Select s=new Select(e);
		s.deselectByVisibleText("text");	
	}
	public static void deselectAll(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();	
	}
	//TakeScreenshot
	public static void GetScreenshot() {
		TakesScreenshot ts=(TakesScreenshot) driver;
		ts.getScreenshotAs(OutputType.FILE);
	}
	//JavaScriptExecutor
	public static void ExecuteScript(String arg0,String arg1) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript(arg0, arg1);
	}
	

	}



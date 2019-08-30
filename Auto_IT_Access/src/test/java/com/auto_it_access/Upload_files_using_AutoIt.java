package com.auto_it_access;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Upload_files_using_AutoIt 
{

	public static void main(String[] args) throws Exception
	{
		
// 1. Upload file using SendKeys method in Selenium WebDriver:
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		Thread.sleep(1000);
	    WebElement browse =driver.findElement(By.id("uploadfile"));
	    browse.sendKeys("C:\\Users\\deshanr\\Desktop\\upload.txt");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(5000);
	    driver.close();
	   // ("user.dir")+"\\src\\main\\resources\\main\\resources\\Executables\\chromedriver.exe"
	*/
	

//	2. Upload file AutoIt Script in Selenium WebDriver:
	
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeOptions option=new ChromeOptions();
	option.addArguments("---disable-notification---");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
	WebElement browse =driver.findElement(By.id("uploadfile"));
    browse.click();
   
   // Runtime.getRuntime().exec("C:\\Users\\deshanr\\Desktop\\AutoITScript.exe");
    
    // (or)

    Process process = new ProcessBuilder("C:\\Users\\deshanr\\Desktop\\AutoITScript.exe",
    "C:\\Users\\deshanr\\Desktop\\abc.txt", "Open").start();
    
   
   /* AutoIT Script:
    	
    	ControlFocus("Open","","Edit1")
    	ControlSetText("Open","","Edit1","C:\Users\deshanr\Desktop\abc.txt")
    	ControlClick("Open","","Button1")*/
   
    
    
	}
		
}
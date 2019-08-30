package com.auto_it_access;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Download_files_using_AutoIt 
{

	public static void main(String[] args) throws Exception 
	{
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notification---");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		WebElement downloadButton=driver.findElement(By.xpath("//a[contains(text(),'Download Text File')]"));
		String sourceLocation=downloadButton.getAttribute("href");
		String wget_cmd="cmd /d ‪D:\\Software\\Softwares\\wget.exe -P D: --no-check-certificate " + sourceLocation;
		try
		{
			Process exec=Runtime.getRuntime().exec(wget_cmd);
			int exitVal=exec.waitFor();
			System.out.println("Exit value:" + exitVal);
		}
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}*/
		
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		String downloadpath="D:\\download";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadpath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		WebElement downloadButton=driver.findElement(By.xpath("//a[contains(text(),'Download Text File')]"));
		downloadButton.click();
		Thread.sleep(10000);
		driver.close();
		driver.quit();*/
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "D:\\download");
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(caps);
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		WebElement downloadButton=driver.findElement(By.xpath("//a[contains(text(),'Download Text File')]"));
		downloadButton.click();
		Thread.sleep(10000);
		driver.close();
		driver.quit();
		



	}

}

package com.qait.mobile_Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NewTest {
	AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setUp() throws MalformedURLException {
		
	DesiredCapabilities caps=new DesiredCapabilities();
	
	caps.setCapability("deviceName", "emulator-5554"); 
	caps.setCapability("platformName", "Android");
//	caps.setCapability("app", "C:/Users/rambhuwanrajpoot/Downloads/flipkart.apk");
	caps.setCapability("platformVersion", "7.0");
	caps.setCapability("browserName", "CHROME");
	caps.setCapability("automationName", "Appium");
	//caps.setCapability("appPackage", "com.android.chrome");
	//caps.setCapability("appActivity", "com.android.chrome.com.android.chrome");
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\rambhuwanrajpoot\\Downloads\\chromedriver.exe");
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,caps);
	}
	@Test
	public void test() {
		
		driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("www.qainfotech.com");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("first test");
	}
	@AfterTest
	public void qait() {
		driver.quit();
	}

 }

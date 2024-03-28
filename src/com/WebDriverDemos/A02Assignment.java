package com.WebDriverDemos;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02Assignment {

	public static void main(String[] args) 
	{
		@BeforeTest
	    public Void setup() 
		{
			driver.manage().window().maximize();
	        WebDriver = new ChromeDriver();
	        driver.get("https://www.google.co.in//");
	    }

	    @Test
	    public void loginTest()
	    {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterUsername("username");
	        loginPage.enterPassword("password");
	        loginPage.clickLoginButton();
	        assertTrue(loginPage.isPageOpened());
	    }

	    @AfterTest
	    public void teardown() 
	    {
	        if (driver != null) 
	        {
	            driver.quit();
	        }
	    }
	}
}
 

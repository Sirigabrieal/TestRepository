package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DLocateByName {

	public static void main(String[] args) {
	/*	WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement emailId= driver.findElement(By.name("email"));
			emailId.sendKeys("sirigabireal123@gmail.com");
			WebElement password=driver.findElement(By.name("pass"));
			password.sendKeys("123456");
			WebElement loginBtn=driver.findElement(By.name("login"));
			loginBtn.click();*/
			
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			WebElement username=driver.findElement(By.name("username"));
			username.sendKeys("Siriansh");
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys("123456");

			}

}

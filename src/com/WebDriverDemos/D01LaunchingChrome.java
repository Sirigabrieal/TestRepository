package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Open blank browser
		driver.manage().window().maximize();
		//Maximise the browser
		driver.get("https://www.google.co.in//");
		//Open the URL
		driver.close();
		//Close the browser windows which is opened by WD object
	}

}

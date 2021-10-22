package com.guru99.bank.prueba.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

static WebDriver driver;
	
	public void  setUp() {
		System.setProperty("webdriver.chrome.driver",
				"src/main/resources/driver/chromedriver.exe");
		     driver = new ChromeDriver();
	}
}

package com.guru99.bank.pruebas.pages;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeGuru99BankPOM {
	
	
	WebDriver driver;
	By txtUser=By.name("uid");
	By txtPass=By.name("password");
	By btnLogin=By.name("btnLogin");
	By linkManager=By.xpath("//*/tr/td/table/tbody/tr/td[text()='Manger Id : mngr360656']");
	By paginaNew=By.xpath("//a[contains(text(),'New Customer')]");
	

	public HomeGuru99BankPOM(WebDriver driver1) {
		driver = driver1;;
	}
	
	public void escribirUsuario(String usuario) {
		driver.findElement(txtUser).sendKeys(usuario);
	}
	
	public void escribirPassword(String pass) {
		driver.findElement(txtPass).sendKeys(pass);
	}
	
	public void clickLogIn() {
		driver.findElement(btnLogin).click();
	}
	
	public void validarMenagerId() {
		assertThat(driver.findElement(linkManager).isDisplayed(), Matchers.is(true));
	}
	
	public void clickPaginaNew() {
		driver.findElement(paginaNew).click();
	}

}

package com.guru99.bank.pruebas.pages;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewCustomerPOM {
	
	WebDriver driver;
	
	By linkNew=By.xpath("//a[contains(text(),'New Customer')]");
	By txtCustomer=By.name("name");
	By btnMale=By.xpath("//input[@value='m']");
	By txtDate=By.id("dob");
	By txtAddress=By.name("addr");
	By txtCity=By.name("city");
	By txtState=By.name("state");
	By txtPin=By.name("pinno");
	By txtMobile=By.name("telephoneno");
	By txtEmail=By.name("emailid");
	By txtPassword=By.name("password");
	By btnSubmit=By.name("sub");
	By successful= By.xpath("//*/tr/td/p[text()='Customer Registered Successfully!!!']");
	
    // Estos Localizadores hacen parte de editar nuevo cliente..
	 String dato;

	By costumer=By.xpath("//*[@id='customer']/tbody/tr[4]/td[2]");
	
	
	public  NewCustomerPOM(WebDriver driver1){
		driver= driver1;
		
	}
	
	public void clickNew() {
		driver.findElement(linkNew).click();
	}
	
	public void escribirCliente(String cliente) {
		driver.findElement(txtCustomer).sendKeys(cliente);
	}
	
	public void clicSobreTipoDeGenero(String tipoGenero) {
		if(tipoGenero.equals("Male")) {
			driver.findElement(btnMale).click();
		}

	}
	
	public void escribirLaFecha(String date) {
		driver.findElement(txtDate).sendKeys(date);
	}
	
	
	public void escribirDireccion(String direccion) {
		driver.findElement(txtAddress).sendKeys(direccion);
	}
	
	
	public void escribirCiudad(String ciudad) {
		driver.findElement(txtCity).sendKeys(ciudad);
	}
	
	public void escribirEstado(String estado) {
		driver.findElement(txtState).sendKeys(estado);
	}
	
	public void escribirPin(String pin) {
		driver.findElement(txtPin).sendKeys(pin);
	}
	
	public void escribirTelefono(String telefono) {
		driver.findElement(txtMobile).sendKeys(telefono);
	}
	
	public void escribirEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	public void escribirClave(String clave) {
		driver.findElement(txtPassword).sendKeys(clave);
	}
	
	public void clickSubmit() {
		driver.findElement(btnSubmit).click();
	}
	
	public void Successful() {
		assertThat(driver.findElement(successful).isDisplayed(), Matchers.is(true));
	}
	
	
	public void Custome() {
		dato= driver.findElement(costumer).getText();
	}
	
	

}

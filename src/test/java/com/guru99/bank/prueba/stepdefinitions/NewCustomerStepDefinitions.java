package com.guru99.bank.prueba.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.guru99.bank.pruebas.pages.NewCustomerPOM;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewCustomerStepDefinitions {

	WebDriver driver;
	NewCustomerPOM customerPOM;
	
	@When("entered the form data")
	public void enteredTheFormData(io.cucumber.datatable.DataTable dataTable) {
		
		driver=Hook.driver;
		List<String> listaDatos = dataTable.asList();
		customerPOM=new NewCustomerPOM(driver);
		customerPOM.clickNew();
		customerPOM.escribirCliente(listaDatos.get(0));
		customerPOM.clicSobreTipoDeGenero(listaDatos.get(1));
		customerPOM.escribirLaFecha(listaDatos.get(2));
		customerPOM.escribirDireccion(listaDatos.get(3));
		customerPOM.escribirCiudad(listaDatos.get(4));
		customerPOM.escribirEstado(listaDatos.get(5));
		customerPOM.escribirPin(listaDatos.get(6));
		customerPOM.escribirTelefono(listaDatos.get(7));
		customerPOM.escribirEmail(listaDatos.get(8));
		customerPOM.escribirClave(listaDatos.get(9));
		customerPOM.clickSubmit();
		

		customerPOM.Custome();
	}

	@Then("Validate the message from Customer Registered Successfully!!!")
	public void validateTheMessageFromCustomerRegisteredSuccessfully() {
		
		customerPOM.Successful();
		
		driver.quit();
	}

}

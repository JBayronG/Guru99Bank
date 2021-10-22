package com.guru99.bank.prueba.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.guru99.bank.pruebas.pages.HomeGuru99BankPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	
	WebDriver driver;
	HomeGuru99BankPOM  home;
	Hook hook= new Hook();
	
	
	@Given("that I am on the page GuruBank")
	public void thatIAmOnThePageGuruBank() {
		hook.setUp();
		driver=Hook.driver;
		home= new HomeGuru99BankPOM(driver);
		driver.get("http://demo.guru99.com/V4/index.php");
	}

	@When("entered your user and password")
	public void enteredYourUserAndPassword(io.cucumber.datatable.DataTable dataTable) {
		List<String> listaDatos=dataTable.asList();
		home.escribirUsuario(listaDatos.get(0));
		home.escribirPassword(listaDatos.get(1));
		home.clickLogIn();
	}

	@Then("should see the text Welcome To Manager s Page of Guru99 Bank")
	public void shouldSeeTheTextWelcomeToManagerSPageOfGuru99Bank() {
		home.validarMenagerId();
		  driver.quit();
	}


	

}

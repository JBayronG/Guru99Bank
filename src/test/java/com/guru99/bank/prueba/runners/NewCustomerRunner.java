package com.guru99.bank.prueba.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/guru99/bank/prueba/features/NewCustomer.feature",
                 glue = "com.guru99.bank.prueba.stepdefinitions",
                 snippets = SnippetType.CAMELCASE,
                 monochrome = true)
public class NewCustomerRunner {

}

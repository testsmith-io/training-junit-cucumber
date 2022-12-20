package org.examples;

import io.cucumber.java.en.Given;

public class RegularExpressionsExamplesSteps {

    @Given("^I have entered (\\d+) into the calculator$")
    public void i_have_entered_into_the_calculator(int number) {
    }

    @Given("^(Maserati|Ferrari) is an Italian car brand$")
    public void is_an_italian_car_brand(String brandName) {
    }

    @Given("^I have (\\d+) apples?$")
    public void i_have_apples(int numberOfApples) {
    }
}

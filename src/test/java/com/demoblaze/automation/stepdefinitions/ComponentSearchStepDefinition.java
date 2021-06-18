package com.demoblaze.automation.stepdefinitions;


import com.demoblaze.automation.models.Data;
import com.demoblaze.automation.questions.theConfirmationMessage;
import com.demoblaze.automation.tasks.*;
import com.demoblaze.automation.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.Matchers.equalTo;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComponentSearchStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private HomePage homePage;

    private Actor buyer = Actor.named("Buyer");

    @Before
    public void setUp(){
        buyer.can(BrowseTheWeb.with(hisBrowser));
        buyer.wasAbleTo(OpenTheBrowser.on(homePage));
    }


    @Given("^the buyer logs in$")
    public void theBuyerLogsIn(List<Data> dataList) throws Exception {
       buyer.attemptsTo(logInTo.thePage(dataList.get(0)));

    }

    @And("^look for the component in the indicated category$")
    public void lookForTheComponentInTheIndicatedCategory(List<Data> dataList) throws Exception {
        buyer.attemptsTo(searchThe.electronicComponent(dataList.get(0)));
    }

    @When("^added to the shopping cart$")
    public void addedToTheShoppingCart() throws Exception {
        buyer.attemptsTo(addComponent.toCart());
    }

    @Then("^see an added product message$")
    public void seeAnAddedProductMessage() throws Exception {
        buyer.should(seeThat(theConfirmationMessage.value(), equalTo("Product added.")));
    }
}

package com.demoblaze.automation.stepdefinitions;

import com.demoblaze.automation.models.Data;
import com.demoblaze.automation.models.PayComponentData;
import com.demoblaze.automation.questions.successfulPurchase;
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

public class PayComponentStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private HomePage homePage;

    private Actor buyer = Actor.named("Buyer");

    @Before
    public void setUp(){
        buyer.can(BrowseTheWeb.with(hisBrowser));
        buyer.wasAbleTo(OpenTheBrowser.on(homePage));
    }

    @Given("^that the buyer log in$")
    public void thatTheBuyerLogIn(List<Data> dataList) throws Exception {
        buyer.attemptsTo(logInTo.thePage(dataList.get(0)));
    }

    @And("^The buyer wants to pay for the component added to the cart$")
    public void theBuyerWantsToPayForTheComponentAddedToTheCart() throws Exception {
        buyer.attemptsTo(
                goTo.cartOption(),
                confirm.theRequest());
    }

    @When("^the buyer enters the data to place the order$")
    public void theBuyerEntersTheDataToPlaceTheOrder(List<PayComponentData> dataList) throws Exception {
       buyer.attemptsTo(confirmPurchase.inForm(dataList));
    }

    @Then("^the buyer should see a message of congratulations on the purchase$")
    public void theBuyerShouldSeeAMessageOfCongratulationsOnThePurchase(List<PayComponentData> dataList) throws Exception {
      buyer.should(seeThat("the display confirmation message",
               successfulPurchase.Message(dataList.get(0)), equalTo(true)));
    }
}

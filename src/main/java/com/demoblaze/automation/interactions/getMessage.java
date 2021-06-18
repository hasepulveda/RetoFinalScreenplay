package com.demoblaze.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.demoblaze.automation.utils.executionData.*;

public class getMessage implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).waitFor(ExpectedConditions.alertIsPresent());
        WarningMessage= BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();

    }

    public static getMessage theAlert() {
        return instrumented(getMessage.class);
    }
}

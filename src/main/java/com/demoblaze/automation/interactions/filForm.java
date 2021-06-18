package com.demoblaze.automation.interactions;

import static com.demoblaze.automation.userinterface.CartPage.*;

import com.demoblaze.automation.models.PayComponentData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class filForm implements Interaction {
    private PayComponentData payComponentData;

    public filForm(PayComponentData payComponentData) {
        this.payComponentData = payComponentData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FIELD_NAME,isVisible()),
                Enter.theValue(payComponentData.getName()).into(FIELD_NAME),
                Enter.theValue(payComponentData.getCountry()).into(FIELD_COUNTRY),
                Enter.theValue(payComponentData.getCity()).into(FIELD_CITY),
                Enter.theValue(payComponentData.getCreditCard()).into(FIELD_CARD),
                Enter.theValue(payComponentData.getMonth()).into(FIELD_MONTH),
                Enter.theValue(payComponentData.getYear()).into(FIELD_YEAR)

        );

    }

    public static filForm thePurchases(PayComponentData payComponentData) {
        return instrumented(filForm.class, payComponentData);
    }
}

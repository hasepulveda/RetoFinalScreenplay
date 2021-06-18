package com.demoblaze.automation.questions;

import static com.demoblaze.automation.userinterface.CartPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.demoblaze.automation.models.PayComponentData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;




public class successfulPurchase implements Question<Boolean> {

    private PayComponentData data;

    public successfulPurchase(PayComponentData data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(PURCHASE_MESSAGE,isVisible()));
        String[] fullMessage = PURCHASE_TEXT.resolveFor(actor).getText().split("\n");
        String message = fullMessage[2]+fullMessage[3];
        return message.equals("Card Number: "+data.getCreditCard()+"Name: "+data.getName());
    }

    public static successfulPurchase Message(PayComponentData data) {
        return new successfulPurchase(data);
    }
}

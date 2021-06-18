package com.demoblaze.automation.tasks;

import static com.demoblaze.automation.userinterface.CartPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class confirm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               WaitUntil.the(PLACE_ORDER_PICTURE,isVisible()),
               Click.on(PLACE_ORDER_BUTTON)
       );

    }

    public static confirm theRequest() {
        return instrumented(confirm.class);
    }

}

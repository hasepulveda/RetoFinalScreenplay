package com.demoblaze.automation.interactions;


import static com.demoblaze.automation.userinterface.HomePage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class enterThe implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOG_IN_OPTION));
    }

    public static enterThe logIn() {
        return instrumented(enterThe.class);
    }
}

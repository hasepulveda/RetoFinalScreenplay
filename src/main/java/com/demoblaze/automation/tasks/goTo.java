package com.demoblaze.automation.tasks;

import com.demoblaze.automation.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.demoblaze.automation.userinterface.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class goTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CART_OPTION,isVisible()),
                Click.on(CART_OPTION)
        );
    }

    public static goTo cartOption() {
        return instrumented(goTo.class);
    }
}

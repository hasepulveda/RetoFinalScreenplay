package com.demoblaze.automation.tasks;


import static com.demoblaze.automation.userinterface.ComponentPage.*;

import com.demoblaze.automation.interactions.getMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;

public class addComponent implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_ADD_TO_CART),
                getMessage.theAlert()
        );

    }

    public static addComponent toCart() {
        return instrumented(addComponent.class);
    }
}

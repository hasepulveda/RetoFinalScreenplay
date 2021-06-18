package com.demoblaze.automation.tasks;

import com.demoblaze.automation.interactions.enterData;
import com.demoblaze.automation.interactions.enterThe;
import com.demoblaze.automation.models.Data;
import com.demoblaze.automation.models.PayComponentData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.*;

public class logInTo implements Interaction {
    private Data data;

    public logInTo(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                enterThe.logIn(),
                enterData.inForm(data)
                );
    }

    public static logInTo thePage(Data data) {
        return instrumented(logInTo.class, data);
    }
}

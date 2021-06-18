package com.demoblaze.automation.interactions;

import static com.demoblaze.automation.userinterface.HomePage.*;

import com.demoblaze.automation.models.Data;
import com.demoblaze.automation.models.PayComponentData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class enterData implements Interaction {

    private String userName, password;

    public enterData(String userName, String password){
        this.userName = userName;
        this.password = password;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOG_IN_USERNAME,isVisible()),
                Enter.theValue(userName).into(LOG_IN_USERNAME),
                Enter.theValue(password).into(LOG_IN_PASSWORD),
                Click.on(LOG_IN_BUTTON)
        );

    }

    public static enterData inForm(Data data) {
        return Tasks.instrumented(enterData.class, data.getUserName(), data.getPassword());
    }

}

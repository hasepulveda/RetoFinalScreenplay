package com.demoblaze.automation.questions;

import static com.demoblaze.automation.utils.executionData.WarningMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class theConfirmationMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return WarningMessage;
    }

    public static theConfirmationMessage value() {
        return new theConfirmationMessage();
    }
}

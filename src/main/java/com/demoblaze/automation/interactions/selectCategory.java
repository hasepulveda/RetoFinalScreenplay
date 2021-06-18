package com.demoblaze.automation.interactions;

import com.demoblaze.automation.models.Data;
import com.demoblaze.automation.exceptions.Exceptions;
import static com.demoblaze.automation.userinterface.LoginPage.*;

import static com.demoblaze.automation.userinterface.CategoryPage.*;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class selectCategory implements Interaction {
    private Target OPTION_CATEGORIES;
    private Target ELECTRONIC_COMPONENT;

    public selectCategory(String category, String component) {
        this.OPTION_CATEGORIES = CATEGORIES.locatedBy("//a[@class =\"list-group-item\" and text()=\""+category+"\"]");
        this.ELECTRONIC_COMPONENT = COMPONENT.locatedBy("//a[@class=\"hrefch\" and text()=\""+component+"\"]");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(OPTION_CATEGORIES,isVisible()),
                Click.on(OPTION_CATEGORIES));
        actor.should(
                seeThat(WebElementQuestion.the(ELECTRONIC_COMPONENT), WebElementStateMatchers.isVisible()).orComplainWith(
                        Exceptions.class, Exceptions.electronicComponentNotFound
                )
        );
        actor.attemptsTo(
               WaitUntil.the(ELECTRONIC_COMPONENT,isVisible()),
                Click.on(ELECTRONIC_COMPONENT)
                );
    }

    public static selectCategory andComponent(Data data) {
        return instrumented(selectCategory.class, data.getCategories(), data.getComponent());
    }
}

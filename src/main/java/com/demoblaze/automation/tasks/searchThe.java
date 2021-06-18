package com.demoblaze.automation.tasks;

import com.demoblaze.automation.interactions.selectCategory;
import com.demoblaze.automation.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class searchThe implements Task {
    private Data data;

    public searchThe(Data data){
        this.data=data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(selectCategory.andComponent(data));
    }

    public static searchThe electronicComponent(Data data) {
        return instrumented(searchThe.class, data);
    }

}

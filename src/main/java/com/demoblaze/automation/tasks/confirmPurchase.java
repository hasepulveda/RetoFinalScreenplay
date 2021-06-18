package com.demoblaze.automation.tasks;

import com.demoblaze.automation.interactions.filForm;

import static com.demoblaze.automation.userinterface.CartPage.*;

import com.demoblaze.automation.models.PayComponentData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class confirmPurchase implements Task {
    private List<PayComponentData> dataList;

    public confirmPurchase(List<PayComponentData> dataList) {
        this.dataList = dataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                filForm.thePurchases(dataList.get(0)),
                Click.on(PURCHASE_BUTTON)
        );

    }

    public static confirmPurchase inForm(List<PayComponentData> dataList) {
        return instrumented(confirmPurchase.class,dataList);
    }
}

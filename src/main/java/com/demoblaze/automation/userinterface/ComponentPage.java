package com.demoblaze.automation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComponentPage extends PageObject {
    public static final Target BUTTON_ADD_TO_CART = Target.the("Button add to cart:").locatedBy("//a[@class =\"btn btn-success btn-lg\" and text()=\"Add to cart\"]");

}

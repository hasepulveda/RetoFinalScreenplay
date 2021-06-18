package com.demoblaze.automation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {

    public static final Target LOG_IN_OPTION = Target.the("Option the Log in:").located(By.id("login2"));
    public static final Target LOG_IN_USERNAME = Target.the("Username login form field:").located(By.id("loginusername"));
    public static final Target LOG_IN_PASSWORD = Target.the("Password login form field:").located(By.id("loginpassword"));
    public static final Target LOG_IN_BUTTON = Target.the("Log in Button:").locatedBy("(//div[@class=\"modal-footer\"])[3]/button[@class=\"btn btn-primary\"]");
    public static final Target CART_OPTION = Target.the("Option the cart:").located(By.id("cartur"));
}

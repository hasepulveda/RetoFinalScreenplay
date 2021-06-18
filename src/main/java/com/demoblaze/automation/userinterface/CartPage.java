package com.demoblaze.automation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class CartPage extends PageObject {

    public static final Target PLACE_ORDER_BUTTON = Target.the("Place order button:").locatedBy("//div[@class=\"col-lg-1\"]/button");
    public static final Target FIELD_NAME= Target.the("Name place order form field:").located(By.id("name"));
    public static final Target FIELD_COUNTRY= Target.the("Country place order form field:").located(By.id("country"));
    public static final Target FIELD_CITY= Target.the("city place order form field:").located(By.id("city"));
    public static final Target FIELD_CARD= Target.the("card place order form field:").located(By.id("card"));
    public static final Target FIELD_MONTH= Target.the("Month place order form field:").located(By.id("month"));
    public static final Target FIELD_YEAR= Target.the("Year place order form field:").located(By.id("year"));
    public static final Target PURCHASE_BUTTON = Target.the("Purchase button:").locatedBy("(//div[@class=\"modal-footer\"])[3]/button[@class=\"btn btn-primary\"]");
    public static final Target PURCHASE_MESSAGE = Target.the("Purchase message button:").locatedBy("//div[@class=\"sweet-alert  showSweetAlert visible\"]/h2");
    public static final Target PLACE_ORDER_PICTURE = Target.the("Place order picture:").locatedBy("//tbody[@id=\"tbodyid\"]//img");
    public static final Target PURCHASE_TEXT = Target.the("Purchase tex:").locatedBy("//p[@class=\"lead text-muted \"]");

}

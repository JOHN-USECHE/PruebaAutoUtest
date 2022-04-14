package co.com.UtestWebj.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestWebPage extends PageObject {

    public static final Target JOINTODAY = Target.the("log start button" )
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}


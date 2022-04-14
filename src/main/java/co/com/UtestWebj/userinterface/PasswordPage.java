package co.com.UtestWebj.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordPage {

    public static final Target CREATE_PASSWORD  =  Target.the("create password")
            .located(By.xpath("//*[@id=\"password\"]"));

    public static final Target  CONFIRM_PASSWORD  =  Target.the("confirm password")
            .located(By.id("confirmPassword"));

    public static final Target  UTEST_TERMS  =  Target.the("Accept utest terms")
            .located(By.id("termOfUse"));

    public static final Target  PRIVACY_SECURITY  =  Target.the("Accept the privacy y security policy")
            .located(By.id("privacySetting"));

    public static final Target  BOTTON_SETUP  =  Target.the("Complete Setup")
            .located(By.id("laddaBtn"));


}

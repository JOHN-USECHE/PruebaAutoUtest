package co.com.UtestWebj.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalinformationPage {

    public static final Target FIRSTNAME = Target.the("Deligence First name")
            .located(By.id("firstName"));

    public static final Target LASTNAME = Target.the("Deligence last name")
            .located(By.id("lastName"));

    public static final Target EMAIL =  Target.the("Deligence email")
            .located(By.id("email"));

    public static final Target MONTHBIRTH =  Target.the("Select  month birth")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));

    public static final Target DAYBIRTH =  Target.the("Select day birth")
            .located(By.xpath("//*[@id=\"birthDay\"]"));

    public static final Target YEARBIRTH =  Target.the("Select year birth")
            .located(By.xpath("//*[@id=\"birthYear\"]"));

    public static final Target BOTTONNEXT =  Target.the("Clic botton next:location")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}

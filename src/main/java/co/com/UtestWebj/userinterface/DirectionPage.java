package co.com.UtestWebj.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DirectionPage {

    public static final Target SELECTCITY =  Target.the("Deligence City")
            .located(By.id("city"));

    public static final Target  SELECTPOSTAL =  Target.the("Deligence postal code")
            .located(By.id("zip"));

    public static final Target  SELECTCONTAINERCOUNTRY =  Target.the("Container country")
    .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));

    public static final Target  SELECTCOUNTRY =  Target.the("Select country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target   BOTTONNEXTDEVICES =  Target.the("Clic botton next:devices")
            .located(By.xpath("//a[@class = 'btn btn-blue pull-right' ]"));

}

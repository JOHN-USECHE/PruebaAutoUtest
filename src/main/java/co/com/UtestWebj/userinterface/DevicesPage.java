package co.com.UtestWebj.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {


    public static final Target  SELECTCONTACOMPUTER =  Target.the("Container country")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div"));

    public static final Target  SELECTCOMPUTER  =  Target.the("Select country")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target  SELECTCONTAVERSION =  Target.the("Container country")
          .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div"));

    public static final Target  SELECTVERSION  =  Target.the("Select country")
           .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target  SELECTCONTALANGUAGE =  Target.the("Container country")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div"));

    public static final Target  SELECTLANGUAGE  =  Target.the("Select country")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target  SELECTCONTMOVIL =  Target.the("Container country")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div"));

    public static final Target  SELECTMOVIL  =  Target.the("Select country")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target  SELECTCONTMODEL =  Target.the("Container country")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div"));

    public static final Target  SELECTMODEL  =  Target.the("Select country")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target  SELECTCONTSYSTEM =  Target.the("Container country")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div"));

    public static final Target  SELECTSYSTEM  =  Target.the("Select country")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target  BOTTONSTEP  =  Target.the("Botton Version")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}

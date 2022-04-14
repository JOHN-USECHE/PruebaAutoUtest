package co.com.UtestWebj.tasks;

import co.com.UtestWebj.model.UtestData;
import co.com.UtestWebj.userinterface.DirectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.UtestWebj.userinterface.DirectionPage.*;


public class PersonalAddress implements Task {
    private List<UtestData> data;

    public PersonalAddress(List<UtestData> data) {
        this.data = data;
    }

    public static PersonalAddress thePage(List<UtestData> data) {
        return Tasks.instrumented(PersonalAddress.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(data.get(0).getsCity()).into(SELECTCITY),
                Hit.the(Keys.ARROW_DOWN).into(SELECTCITY),
                Hit.the(Keys.ENTER).into(SELECTCITY),
                Enter.theValue(data.get(0).getsPostal()).into(SELECTPOSTAL),
                Click.on(SELECTCONTAINERCOUNTRY),
                Enter.theValue(data.get(0).getsCountry()).into(SELECTCOUNTRY).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BOTTONNEXTDEVICES)
        );

    }
}

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
import static co.com.UtestWebj.userinterface.DevicesPage.*;
import static co.com.UtestWebj.userinterface.DirectionPage.BOTTONNEXTDEVICES;


public class Devices implements Task {
    private List<UtestData> data;

    public Devices(List<UtestData> data) {
        this.data = data;
    }

    public static Devices thePage(List<UtestData> data) {
        return Tasks.instrumented(Devices.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Click.on(SELECTCONTACOMPUTER),
                Enter.theValue(data.get(0).getsComputer()).into(SELECTCOMPUTER).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(SELECTCONTAVERSION),
                Enter.theValue(data.get(0).getsVersion()).into(SELECTVERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(SELECTCONTALANGUAGE),
                Enter.theValue(data.get(0).getsLanguage()).into(SELECTLANGUAGE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(SELECTCONTMOVIL),
                Enter.theValue(data.get(0).getsDevice()).into(SELECTMOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(SELECTCONTMODEL),
                Enter.theValue(data.get(0).getsModel()).into(SELECTMODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(SELECTCONTSYSTEM),
                Enter.theValue(data.get(0).getsLanguage()).into(SELECTSYSTEM).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BOTTONSTEP)
        );

    }
}
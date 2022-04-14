package co.com.UtestWebj.tasks;

import co.com.UtestWebj.userinterface.UtestWebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUtest implements Task {

    private UtestWebPage page;

    public static OpenUtest thePage() {
        return  Tasks.instrumented(OpenUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(page),
                Click.on(UtestWebPage.JOINTODAY));


    }
}

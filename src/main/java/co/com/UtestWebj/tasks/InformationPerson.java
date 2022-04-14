package co.com.UtestWebj.tasks;

import co.com.UtestWebj.model.UtestData;
import co.com.UtestWebj.userinterface.PersonalinformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import static co.com.UtestWebj.userinterface.PersonalinformationPage.*;
public class InformationPerson implements Task {

    private List<UtestData> data;

    public InformationPerson(List<UtestData> data) {
        this.data = data;
    }

    public static InformationPerson thePage(List<UtestData> data) {
        return  Tasks.instrumented(InformationPerson.class, data);

    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Enter.theValue(data.get(0).getsFirstName()).into(FIRSTNAME),
                Enter.theValue(data.get(0).getsLastName()).into(LASTNAME),
                Enter.theValue(data.get(0).getsEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getsMonthBirth()).from(MONTHBIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getsDayBirth()).from(DAYBIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getsYearBirth()).from(YEARBIRTH),
                Click.on(BOTTONNEXT)


        );
    }
}

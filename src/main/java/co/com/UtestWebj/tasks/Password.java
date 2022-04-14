package co.com.UtestWebj.tasks;

import co.com.UtestWebj.userinterface.PasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Password implements Task {

     PasswordPage passwordPage  ;

    public static  Password EndThePage() {
        return Tasks.instrumented( Password.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("John123456._.").into(  PasswordPage.CREATE_PASSWORD),
                Enter.theValue("John123456._.").into(  PasswordPage.CONFIRM_PASSWORD),
                Click.on(PasswordPage.UTEST_TERMS),
            Click.on(PasswordPage.PRIVACY_SECURITY),
            Click.on(PasswordPage.BOTTON_SETUP)
        );

}
}

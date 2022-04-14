package co.com.UtestWebj.stepdefinitions;

import co.com.UtestWebj.model.UtestData;
import co.com.UtestWebj.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestWebStepDefinition {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^John wants to register with Utest$")
    public void johnWantsToRegisterWithUtest() throws Exception {
      OnStage.theActorCalled("John").wasAbleTo(OpenUtest.thePage());
    }


    @When("^The user enters the data required by the system$")
    public void theUserEntersTheDataRequiredByTheSystem(List<UtestData> data) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(InformationPerson.thePage(data), PersonalAddress.thePage(data), Devices.thePage(data));

    }

    @Then("^Registration is complete when you see the Complete Setup button$")
    public void registrationIsCompleteWhenYouSeeTheCompleteSetupButton() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Password.EndThePage());
    }
}

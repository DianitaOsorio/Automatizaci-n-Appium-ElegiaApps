package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.AppiumAndroidDriver;
import testing.sqa.tasks.PlanNoIncluido;

public class PlanNoIncluidoStepsDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^el usario da click en planes a la medida$")
    public void elUsarioDaClickEnPlanesALaMedida() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^direccione al pop-up$")
    public void direccioneAlPopUp() {
        OnStage.theActorInTheSpotlight().attemptsTo(PlanNoIncluido.socialMedia ());
    }

    @Entonces("^se visualiza  el pop-up  con el mensaje$")
    public void seVisualizaElPopUpConElMensaje() {

    }



}


package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.AppiumAndroidDriver;
import testing.sqa.tasks.Seleccionar_Linea;

public class IngresoLineaStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^el usuario ingrese a la aplicacion$")
    public void elUsuarioIngreseALaAplicacion() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }


    @Cuando("^da click en opcion de linea$")
    public void daClickEnOpcionDeLinea() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar_Linea.socialMedia());
    }

    @Entonces("^selecciona la linea$")
    public void seleccionaLaLinea() {

    }


}





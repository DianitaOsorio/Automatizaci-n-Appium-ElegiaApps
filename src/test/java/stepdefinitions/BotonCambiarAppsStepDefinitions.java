package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.AppiumAndroidDriver;
import testing.sqa.tasks.BotonNoContinuar;
import testing.sqa.tasks.CambiarApps;

public class BotonCambiarAppsStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingrese a la pantalla de resumen$")
    public void queElUsuarioIngreseALaPantallaDeResumen() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^da click en boton cambiar apps$")
    public void daClickEnBotonCambiarApps() {
        OnStage.theActorInTheSpotlight().attemptsTo(CambiarApps.socialMedia());
    }

    @Entonces("^regrese a la pantalla de las ultimas apps seleccionadas$")
    public void regreseALaPantallaDeLasUltimasAppsSeleccionadas() {

    }
}



package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.AppiumAndroidDriver;
import testing.sqa.tasks.Ilimidatos;
import testing.sqa.tasks.LineaNoActiva;

public class ModalEstadoNoActivoStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^el usuario ingrese a la app mi movistar$")
    public void elUsuarioIngreseALaAppMiMovistar() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^da click en boton de elegiapps$")
    public void daClickEnBotonDeElegiapps() {
        OnStage.theActorInTheSpotlight().attemptsTo(LineaNoActiva.socialMedia());

    }

    @Entonces("^se visualiza  el popup  de linea no activa$")
    public void seVisualizaElPopupDeLineaNoActiva() {

    }
}

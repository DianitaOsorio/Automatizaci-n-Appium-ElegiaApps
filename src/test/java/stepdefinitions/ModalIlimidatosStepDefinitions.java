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
import testing.sqa.tasks.Seleccionar_Linea;

public class ModalIlimidatosStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^el usuario ingrese a servicios$")
    public void elUsuarioIngreseAServicios() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^da click en elegiapps$")
    public void daClickEnElegiapps() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ilimidatos.socialMedia());

    }

    @Entonces("^se visualiza  el pop-up  de ilimidatos$")
    public void seVisualizaElPopUpDeIlimidatos() {

    }
}

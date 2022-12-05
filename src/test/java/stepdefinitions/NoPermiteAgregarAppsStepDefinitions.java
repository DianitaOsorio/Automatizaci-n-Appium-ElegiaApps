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
import testing.sqa.tasks.NoAgregarApps;

public class NoPermiteAgregarAppsStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario visualice las apps precargadas$")
    public void queElUsuarioVisualiceLasAppsPrecargadas() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^realice el cambio de apps$")
    public void realiceElCambioDeApps() {
        OnStage.theActorInTheSpotlight().attemptsTo(NoAgregarApps.socialMedia());
    }

    @Entonces("^valida el mensaje Tu plan no permite agregar mas apps$")
    public void validaElMensajeTuPlanNoPermiteAgregarMasApps() {

    }

    @Entonces("^direccione a sitio web de planes pospago$")
    public void direccioneASitioWebDePlanesPospago() {

    }

}

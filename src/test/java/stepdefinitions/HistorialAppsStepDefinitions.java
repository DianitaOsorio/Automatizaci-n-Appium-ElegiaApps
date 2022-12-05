package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.AppiumAndroidDriver;
import testing.sqa.tasks.HistorialApps;

public class HistorialAppsStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario este en la pantalla de elegiapps$")
    public void queElUsuarioEsteEnLaPantallaDeElegiapps() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^da click en boton ver hsitorial de apps$")
    public void daClickEnBotonVerHsitorialDeApps() {
        OnStage.theActorInTheSpotlight().attemptsTo(HistorialApps.socialMedia());

    }

    @Entonces("^ingrese al hsitorico de apps elegidas$")
    public void ingreseAlHsitoricoDeAppsElegidas() {

    }


}

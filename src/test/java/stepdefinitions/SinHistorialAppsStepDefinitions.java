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
import testing.sqa.tasks.SinHistorial;

public class SinHistorialAppsStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario ingrese a la app de  elegiapps$")
    public void queElUsuarioIngreseALaAppDeElegiapps() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^da click en boton ver historial de apps$")
    public void daClickEnBotonVerHistorialDeApps() {
        OnStage.theActorInTheSpotlight().attemptsTo(SinHistorial.socialMedia());
    }

    @Entonces("^visualice popup no tienes historial$")
    public void visualicePopupNoTienesHistorial() {

    }


}

package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.AppiumAndroidDriver;
import testing.sqa.tasks.LimiteCambios;
import testing.sqa.tasks.Seleccionar_Linea;

public class LimiteCambiosStepsDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario le hayan hecho cambios$")
    public void queElUsuarioLeHayanHechoCambios() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^llegue al limite de modificaciones de apps$")
    public void llegueAlLimiteDeModificacionesDeApps() {
        OnStage.theActorInTheSpotlight().attemptsTo(LimiteCambios.socialMedia());
    }

    @Entonces("^se visualiza popoup de Limite de cambios en el ciclo$")
    public void seVisualizaPopoupDeLimiteDeCambiosEnElCiclo() {

    }



}








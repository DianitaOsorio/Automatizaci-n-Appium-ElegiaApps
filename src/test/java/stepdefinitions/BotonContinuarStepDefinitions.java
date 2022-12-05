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
import testing.sqa.tasks.Ilimidatos;

public class BotonContinuarStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario modifique las apps$")
    public void queElUsuarioModifiqueLasApps() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^quede una app pendiente por seleccionar$")
    public void quedeUnaAppPendientePorSeleccionar() {
        OnStage.theActorInTheSpotlight().attemptsTo(BotonNoContinuar.socialMedia());
    }

    @Entonces("^el boton continuar no se habilite$")
    public void elBotonContinuarNoSeHabilite() {

    }


}



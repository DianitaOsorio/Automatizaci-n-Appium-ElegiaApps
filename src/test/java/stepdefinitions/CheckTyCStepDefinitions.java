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
import testing.sqa.tasks.CheckTyC;

public class CheckTyCStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario actualice las apps$")
    public void queElUsuarioActualiceLasApps() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^da click en boton continuar$")
    public void daClickEnBotonContinuar() {
        OnStage.theActorInTheSpotlight().attemptsTo(CheckTyC.socialMedia());
    }

    @Entonces("^no debe permitir seguir sin aceptar TyC$")
    public void noDebePermitirSeguirSinAceptarTyC() {

    }


}

package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.AppiumAndroidDriver;
import testing.sqa.tasks.CheckTyC;
import testing.sqa.tasks.UrlTyC;

public class UrlCheckTyCStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario relice cambios de apps$")
    public void queElUsuarioReliceCambiosDeApps() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^da click en el link de TyC$")
    public void daClickEnElLinkDeTyC() {

            OnStage.theActorInTheSpotlight().attemptsTo(UrlTyC.socialMedia());
        }


        @Entonces("^direcciona a landing page de TyC$")
        public void direccionaALandingPageDeTyC () {

        }


    }

package testing.sqa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import testing.sqa.interactions.ExplicitWait;
import testing.sqa.interactions.ScrollDown;
import testing.sqa.interactions.ScrollUp;

import static testing.sqa.userinterfaces.Selecc_Linea.BTN_LINEA_SEL;
import static testing.sqa.userinterfaces.Selecc_Linea.LST_LINEAS;
import static testing.sqa.userinterfaces.UrlTyC.*;

public class UrlTyC implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ExplicitWait.here(20),
                ExplicitWait.here(20),
                Click.on(LST_LINEAS),
                ExplicitWait.here(10),
                Click.on(BTN_LINEA_SEL),
                ExplicitWait.here(10),
                ScrollDown.on(),
                Click.on(BTN_ELEGIAPPS),
                ExplicitWait.here(10),
                ScrollDown.on(),
                Click.on(BTN_MESSENGER),
                Click.on(BTN_MOVISTARMUSIC),
                ScrollUp.on(),
                ExplicitWait.here(6),
                Click.on(BTN_CONTINUAR),
                ExplicitWait.here(5),
                Click.on(URL_TYC),
                ExplicitWait.here(5)

        );
    }
    public static UrlTyC socialMedia() {
        return Instrumented.instanceOf(UrlTyC.class).withProperties();
    }


}



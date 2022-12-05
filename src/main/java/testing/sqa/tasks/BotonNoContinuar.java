package testing.sqa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.sqa.interactions.ExplicitWait;
import testing.sqa.interactions.ScrollDown;
import testing.sqa.interactions.ScrollUp;

import static testing.sqa.userinterfaces.BotonNoContinuar.*;


public class BotonNoContinuar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ExplicitWait.here(20),
                Click.on(LST_LINEAS),
                ExplicitWait.here(10),
                ScrollDown.on(),
                Click.on(BTN_LINEA_SEL),
                ExplicitWait.here(10),
                ScrollDown.on(),
                Click.on(BTN_ELEGIAPPS),
                ExplicitWait.here(10),
                ScrollDown.on(),
                ExplicitWait.here(10),
                Click.on(BTN_SPOTIFY),
                ExplicitWait.here(10),
                ScrollUp.on()

        );

    }

    public static BotonNoContinuar socialMedia() {
        return Instrumented.instanceOf(BotonNoContinuar.class).withProperties();
    }
}
package testing.sqa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.sqa.interactions.ExplicitWait;
import testing.sqa.interactions.ScrollDown;

import static testing.sqa.userinterfaces.HistorialApps.*;

public class HistorialApps implements Task {
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
                Click.on(BTN_HISTORIALAPPS),
                ExplicitWait.here(10)

        );
    }

    public static HistorialApps socialMedia() {
        return Instrumented.instanceOf(HistorialApps.class).withProperties();

    }
}
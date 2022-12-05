package testing.sqa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.sqa.interactions.ExplicitWait;
import testing.sqa.interactions.ScrollDown;

import static testing.sqa.userinterfaces.Ilimidatos.*;

public class Ilimidatos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ExplicitWait.here(20),
                Click.on(LST_LINEAS),
                ExplicitWait.here(10),
                Click.on(BTN_LINEA_SEL),
                ExplicitWait.here(10),
                ScrollDown.on(),
                Click.on(BTN_OTROS_SERVICIOS),
                ExplicitWait.here(10),
                ScrollDown.on(),
                Click.on(BTN_ElEGIAPPS),
                ExplicitWait.here(20),
                Click.on(BTN_CERRAR),
                ExplicitWait.here(10)
        );
}
    public static Ilimidatos socialMedia() {
        return Instrumented.instanceOf(Ilimidatos.class).withProperties();
    }
}
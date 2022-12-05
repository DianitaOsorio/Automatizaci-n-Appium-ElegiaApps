package testing.sqa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.sqa.interactions.ExplicitWait;
import testing.sqa.interactions.ScrollDown;
import testing.sqa.interactions.ScrollUp;


import static testing.sqa.userinterfaces.LimiteCambios.*;


public class LimiteCambios implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ExplicitWait.here(20),
                Click.on(LST_LINEAS),
                ScrollDown.on(),
                Click.on(BTN_LINEA_SEL),
                ExplicitWait.here(10),
                ScrollDown.on(),
                Click.on(BTN_ElEGIAPPS),
                ExplicitWait.here(10),
                ScrollDown.on(),
                Click.on(BTN_PINTEREST),
                Click.on(BTN_LINKEDIN),
                ScrollUp.on(),
                Click.on(BTN_CONTINUAR),
                ExplicitWait.here(15),
                Click.on(BTN_CERRAR)


        );
    }

    public static LimiteCambios socialMedia() {
        return Instrumented.instanceOf(LimiteCambios.class).withProperties();
    }
}


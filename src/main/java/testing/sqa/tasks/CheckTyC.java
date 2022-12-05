package testing.sqa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.sqa.interactions.ExplicitWait;
import testing.sqa.interactions.ScrollDown;
import testing.sqa.interactions.ScrollUp;


import static testing.sqa.userinterfaces.CheckTyC.*;


public class CheckTyC implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ExplicitWait.here(20),
                ExplicitWait.here(15),
                ScrollDown.on(),
                Click.on(BTN_ELEGIAPPS),
                ExplicitWait.here(10),
                ScrollDown.on(),
                Click.on(BTN_MESSENGER),
                ExplicitWait.here(10),
                ScrollUp.on(),
                Click.on(BTN_RSOCIALES),
                ExplicitWait.here(6),
                ScrollDown.on(),
                Click.on(BTN_MOVISTARMUSIC),
                ExplicitWait.here(6),
                ScrollUp.on(),
                Click.on(BTN_RSOCIALES),
                ScrollDown.on(),
                Click.on(BTN_TIKTOK),
                ScrollUp.on(),
                ExplicitWait.here(6),
                Click.on(BTN_CONTINUAR),
                ExplicitWait.here(5)

                );


    }

    public static CheckTyC socialMedia() {
        return Instrumented.instanceOf(CheckTyC.class).withProperties();
    }


}
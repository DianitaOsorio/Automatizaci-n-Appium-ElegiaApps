package testing.sqa.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.sqa.interactions.ExplicitWait;
import testing.sqa.interactions.ScrollDown;
import testing.sqa.interactions.ScrollUp;

import testing.sqa.userinterfaces.Selecc_Linea;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import static testing.sqa.userinterfaces.NoAgregarApps.*;



public class NoAgregarApps implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ExplicitWait.here(20),
                Click.on(LST_LINEAS),
                ScrollDown.on(),
                ExplicitWait.here(10),
                Click.on(BTN_LINEA_SEL),
                ExplicitWait.here(10),
                ScrollDown.on(),
                Click.on(BTN_ElEGIAPPS),
                ExplicitWait.here(10),
                ScrollDown.on(),
                ExplicitWait.here(10),
                Click.on(BTN_PINTEREST),
                Click.on(BTN_SNAPCHAT),
                Click.on(BTN_TWITTER),
                ScrollUp.on(),
                ExplicitWait.here(5),
                ScrollDown.on(),
                ScrollUp.on(),
                Click.on(BTN_AQUI),
                ExplicitWait.here(15)


        );
    }

    public static NoAgregarApps socialMedia() {
        return Instrumented.instanceOf(NoAgregarApps.class).withProperties();
    }
}
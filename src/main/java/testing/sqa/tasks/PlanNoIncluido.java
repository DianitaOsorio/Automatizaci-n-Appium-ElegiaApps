package testing.sqa.tasks;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import testing.sqa.interactions.ExplicitWait;
import testing.sqa.interactions.ScrollDown;
import testing.sqa.interactions.ScrollUp;

import static testing.sqa.userinterfaces.PlanNoIncluido.BTN_CERRAR;
import static testing.sqa.userinterfaces.PlanNoIncluido.BTN_ElEGIAPPS;
import static testing.sqa.userinterfaces.PlanNoIncluido.BTN_LINEA_SEL;
import static testing.sqa.userinterfaces.Selecc_Linea.BTN_POPUP;
import static testing.sqa.userinterfaces.Selecc_Linea.LST_LINEAS;

public class PlanNoIncluido implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ExplicitWait.here(20),
                Check.whether(WebElementQuestion.stateOf(BTN_POPUP), WebElementStateMatchers.isVisible()).andIfSo(Click.on(LST_LINEAS)).otherwise(),
                ScrollDown.on(),
                ExplicitWait.here(10),
                Click.on(BTN_LINEA_SEL),
                ScrollDown.on(),
                Click.on(BTN_ElEGIAPPS),
                ExplicitWait.here(10),
                ScrollDown.on(),
                ExplicitWait.here(10),
                Click.on(BTN_CERRAR),
                ExplicitWait.here(10)

        );

    }

    public static PlanNoIncluido socialMedia() {
        return Instrumented.instanceOf(PlanNoIncluido.class).withProperties();
    }
}


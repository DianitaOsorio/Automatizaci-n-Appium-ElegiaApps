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


import static testing.sqa.userinterfaces.Selecc_Linea.*;

public class Seleccionar_Linea implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ExplicitWait.here(20),
                Click.on(LST_LINEAS),
                ExplicitWait.here(10),
                Click.on(BTN_LINEA_SEL),
                ExplicitWait.here(10)


        );

    }

    public static Seleccionar_Linea socialMedia() {
        return Instrumented.instanceOf(Seleccionar_Linea.class).withProperties();
    }
}

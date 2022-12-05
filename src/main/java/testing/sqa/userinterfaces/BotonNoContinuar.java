package testing.sqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BotonNoContinuar {
    public static final Target LST_LINEAS = Target.the("lista desplegable con las lineas a usar")
            .locatedBy("//android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView");
    public static final Target BTN_LINEA_SEL = Target.the("linea a seleccionar")
            .locatedBy("//android.view.View[9]/android.view.View//android.view.View//*[contains(@text,'3156494675')]");
    public static final Target BTN_ELEGIAPPS = Target.the("botton elegiapps")
            .locatedBy("//*[contains(@text,'ElegiApps')]");
    public static final Target BTN_RSOCIALES = Target.the("botton redes sociales")
            .locatedBy("//android.view.View[3]/android.widget.Button");
    public static final Target BTN_SIGNAL = Target.the("botton signal")
            .locatedBy("//android.view.View[7]");

    public static final Target BTN_SPOTIFY = Target.the("botton spotify")
            .locatedBy("//android.view.View[@resource-id='mat-slide-toggle-14'and @index='2']");
}

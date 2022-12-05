package testing.sqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Ilimidatos {
    public static final Target LST_LINEAS = Target.the("lista desplegable con las lineas a usar")
            .locatedBy("//android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView");
    public static final Target BTN_LINEA_SEL = Target.the("linea a seleccionar")
            .locatedBy("//android.view.View[3]/android.view.View//android.view.View//*[contains(@text,'3153974253')]");
    public static final Target BTN_OTROS_SERVICIOS = Target.the("botton otros servicios")
            .locatedBy("//*[contains(@text,'Otros servicios')]");
    public static final Target BTN_ElEGIAPPS = Target.the("botton elegiapps")
            .locatedBy("//*[contains(@text,'ElegiApps')]");
    public static final Target BTN_CERRAR = Target.the("botton para cerrar modal")
            .locatedBy("//android.widget.Button");
}


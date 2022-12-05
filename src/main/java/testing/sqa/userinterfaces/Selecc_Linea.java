package testing.sqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Selecc_Linea {

    public static final Target LST_LINEAS = Target.the("lista desplegable con las lineas a usar")
            .locatedBy("//android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView");
    public static final Target BTN_LINEA_SEL = Target.the("linea a seleccionar")
            .locatedBy("//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[2]");

    public static final Target BTN_POPUP = Target.the("cerrar popup")
            .locatedBy("//android.view.View[3]/android.view.View/android.widget.Button");

}

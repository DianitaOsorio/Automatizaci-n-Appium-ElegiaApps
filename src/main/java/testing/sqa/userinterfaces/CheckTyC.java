package testing.sqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckTyC {
    public static final Target LST_LINEAS = Target.the("lista desplegable con las lineas a usar")
            .locatedBy("//android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView");
    public static final Target BTN_LINEA_SEL = Target.the("linea a seleccionar")
            .locatedBy("//android.view.View[9]/android.view.View//android.view.View//*[contains(@text,'3156494675')]");
    public static final Target BTN_OTROS_SERVICIOS = Target.the("botton otros servicios")
            .locatedBy("//*[contains(@text,'Otros servicios')]");
    public static final Target BTN_ELEGIAPPS = Target.the("botton elegiapps")
            .locatedBy("//*[contains(@text,'ElegiApps')]");
    public static final Target BTN_RSOCIALES = Target.the("botton redes sociales")
            .locatedBy("//android.view.View[3]/android.widget.Button");
    public static final Target BTN_MESSENGER = Target.the("botton messenger")
            .locatedBy("//android.view.View[8]");

    public static final Target BTN_MOVISTARMUSIC = Target.the("botton movistar music")
            .locatedBy("//android.view.View[@resource-id='mat-slide-toggle-15'and @index='5']");
    public static final Target BTN_TIKTOK = Target.the("botton tiktok")
            .locatedBy("//android.view.View[@resource-id='mat-slide-toggle-1'and @index='2']");
    public static final Target BTN_CONTINUAR= Target.the("botton continuar")
            .locatedBy("//*[contains(@text,'Continuar')]");
}

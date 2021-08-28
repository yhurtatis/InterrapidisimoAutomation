package steps;

import net.thucydides.core.annotations.Step;
import pages.CotizaEnvioPage;
import pages.HomePage;

public class CotizaEnvioPageSteps {

    private CotizaEnvioPage CotizaEnvio;

    @Step
    public void  goToHomePage(){
        CotizaEnvio.open();
    }
}

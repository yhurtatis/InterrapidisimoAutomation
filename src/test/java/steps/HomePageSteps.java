package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomePageSteps {
    private HomePage home;

    @Step
    public void  goToHomePage(){
        home.open();
    }

    @Step
    public void goToCotizaEnvioPage(){
        home.clickBtnCotizaEnvio();
    }

    @Step
    public void closeAlert() {
        home.closeInitAlert();
    }
}
package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomePageSteps {
    private HomePage Home;

    @Step
    public void  goToHomePage(){
        Home.open();
    }

    @Step
    public void goToCotizaEnvioPage(){
        Home.getBtnCotizaEnvio().click();
    }


}

package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://www.interrapidisimo.com/")

public class HomePage extends PageObject {
    public HomePage() {
    }

    private String btnCotizaEnvio= "//*[@href='https://www.interrapidisimo.com/cotiza-tu-envio/']";

    public WebElementFacade getBtnCotizaEnvio(){
        return  findBy(btnCotizaEnvio);
    }



}

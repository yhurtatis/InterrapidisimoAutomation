package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import utils.UtilsElement;


@DefaultUrl("https://www.interrapidisimo.com/")

public class HomePage extends UtilsElement {
    public HomePage() {
    }

    private String btnCotizaEnvio = "//*[@href='https://www.interrapidisimo.com/cotiza-tu-envio/']";

    public void clickBtnCotizaEnvio() {
        click(btnCotizaEnvio);
    }
}

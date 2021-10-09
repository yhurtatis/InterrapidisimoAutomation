package steps;

import net.thucydides.core.annotations.Step;
import pages.CotizaEnvioPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CotizaEnvioSteps {
    private CotizaEnvioPage cotizaEnvioPage;

    @Step
    public void validateTitlePage() {
        String title = cotizaEnvioPage.getTextTitle();
        System.out.println("validatetitle page" + title);
        assertThat(title, containsString("COTIZA TU ENVÍO"));

    }

    @Step
    public void swithToIframe(){
        cotizaEnvioPage.swithToIframe();
    }


    @Step
    public void clickQuoteShipping(){
        cotizaEnvioPage.scrollForPixel("250");
        cotizaEnvioPage.clickBtnCotizar();
    }

    @Step
    public void closeModalIniCotiza(){
        cotizaEnvioPage.closeModalIni();
    }


}

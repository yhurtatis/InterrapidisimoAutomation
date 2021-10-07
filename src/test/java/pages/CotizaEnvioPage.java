package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import utils.UtilsElement;

public class CotizaEnvioPage extends UtilsElement {

    public CotizaEnvioPage(){

    }

    private String lblTitulo = "//h2[text()='COTIZA TU ENVÍO']";
    private String inputDate = "//input[@id='date']";
    private String SelectOrigen = "//select[@id='Origen']";
    private String SelectDestino = "//select[@id='Destino']";
    private String inputPesoKilos = "//input[@id='pesokilos']";
    private String inputPesoReal = "//input[@id='pesoreal']";
    private String inputValorComercial = "//input[@id='valorcomercial']";
    private String inputTipoEntrega = "//select[@id='tipoentrega']";
    private String btnCotizar = "//a[@id='xcotizar']/img[1]";
    private String btnCloseModal="//*[@id='elementor-popup-modal-92384']/div/div[4]";

    public String getTextTitle() {
        return getTextElements(lblTitulo);

    }

    public void setInputDate(String input) {
        typeInput(inputDate, input);
    }

    public void clickBtnCotizar() {
        WebElementFacade element=element(btnCotizar);
        element.waitUntilClickable();
        click(btnCotizar);
    }

    public void closeModalIni(){click(btnCloseModal);}


}

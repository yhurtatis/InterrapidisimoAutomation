package definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CotizaEnvioSteps;
import steps.HomePageSteps;

public class CotizaEnvioDefinition {

    public CotizaEnvioDefinition() {

    }

    @Steps
    private HomePageSteps home;
    @Steps
    private CotizaEnvioSteps cotizaEnvioSteps;


    @Given("^Estoy en la página de inicio de Interrapidisimo$")
    public void estoy_en_la_página_de_inicio_de_Interrapidisimo() {
        home.goToHomePage();

    }

    @When("^voy a la sección 'Cotiza tu envío'$")
    public void voy_a_la_sección_Cotiza_tu_envío() {
        home.goToCotizaEnvioPage();

    }

    @Then("^valido que se muestre correctamente la página 'Cotiza tu envío'$")
    public void valido_que_se_muestre_correctamente_la_página_Cotiza_tu_envío() {
        cotizaEnvioSteps.validateTitlePage();

    }


    @When("^cotizo el envío$")
    public void cotizo_el_envío() {
        cotizaEnvioSteps.validateTitlePage();
        cotizaEnvioSteps.closeModalIniCotiza();
        cotizaEnvioSteps.clickQuoteShipping();
    }

    @Then("^se muestra un mensaje de validación de obligatoriedad para los campos$")
    public void se_muestra_un_mensaje_de_validación_de_obligatoriedad_para_los_campos() {

    }

    @When("^diligencio el formulario sin llenar el campo 'Ciudad Origen'$")
    public void diligencio_el_formulario_sin_llenar_el_campo_Ciudad_Origen() {

    }

    @Then("^se muestra un mensaje de validación de obligatoriedad para el campo 'Ciudad Origen'$")
    public void se_muestra_un_mensaje_de_validación_de_obligatoriedad_para_el_campo_Ciudad_Origen() {

    }

    @Then("^se muestra un mensaje de validación de obligatoriedad para el campo 'Ciudad Destino'$")
    public void se_muestra_un_mensaje_de_validación_de_obligatoriedad_para_el_campo_Ciudad_Destino() {

    }
}
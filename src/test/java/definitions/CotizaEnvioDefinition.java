package definitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import steps.HomePageSteps;

public class CotizaEnvioDefinition {

    @Steps
    private HomePageSteps home;

    @Given("^Estoy en la página de inicio de Interrapidisimo$")
    public void estoy_en_la_página_de_inicio_de_Interrapidisimo() {
//        home.goToHomePage();
    }

    @When("^voy a la sección 'Cotiza tu envío'$")
    public void voy_a_la_sección_Cotiza_tu_envío() {
    }

    @Then("^valido que se muestre correctamente la página \"([^\"]*)\"$")
    public void valido_que_se_muestre_correctamente_la_página(String arg1) {
    }

    @Given("^voy a la sección \"([^\"]*)\"$")
    public void voy_a_la_sección(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @When("^cotizo el envío$")
    public void cotizo_el_envío() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();

    }
    @Then("^se muestra un mensaje de validación de obligatoriedad para los campos$")
    public void se_muestra_un_mensaje_de_validación_de_obligatoriedad_para_los_campos() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @When("^diligencio el formulario sin llenar el campo \"([^\"]*)\"$")
    public void diligencio_el_formulario_sin_llenar_el_campo(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Then("^se muestra un mensaje de validación de obligatoriedad para el campo 'Ciudad Origen'$")
    public void se_muestra_un_mensaje_de_validación_de_obligatoriedad_para_el_campo_Ciudad_Origen() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Then("^se muestra un mensaje de validación de obligatoriedad para el campo 'Ciudad Destino'$")
    public void se_muestra_un_mensaje_de_validación_de_obligatoriedad_para_el_campo_Ciudad_Destino() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



}

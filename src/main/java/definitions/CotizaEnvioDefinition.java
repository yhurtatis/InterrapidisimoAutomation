package definitions;

import cucumber.api.PendingException;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import steps.HomePageSteps;

public class CotizaEnvioDefinition {
    @Steps
    HomePageSteps homeSteps;
    @Given("^Estoy en la página de inicio de Interrapidisimo$")
    public void estoy_en_la_página_de_inicio_de_Interrapidisimo() {
            homeSteps.goToHomePage();
    }


    @When("^entro a la sección 'Cotiza tu envío'$")
    public void entro_a_la_sección_Cotiza_tu_envío() {

    }

    @Then("^valido que se muestre correctamente la página \"([^\"]*)\"$")
    public void valido_que_se_muestre_correctamente_la_página(String arg1) {

    }

}

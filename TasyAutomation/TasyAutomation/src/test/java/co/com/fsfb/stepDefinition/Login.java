package co.com.fsfb.stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class Login {
    //CREAR VARIABLES DE NAVEGADOR Y ACTOR

    @Managed(driver = "chrome")
    WebDriver driver;
    //private WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("ok");
    }

    @Given("que el cliente debe ingresar con credenciales")
    public void que_el_cliente_debe_ingresar_con_credenciales() {

        theActorInTheSpotlight().wasAbleTo(Open.url("https://mvnrepository.com/"));

        /*actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(Open.browserOn(loginPage));
        getDriver().manage().window().maximize();*/

    }
    @When("cuente con un pass y user")
    public void cuente_con_un_pass_y_user() {

    }
    @Then("aprecera habilitadas las funciones del rol")
    public void aprecera_habilitadas_las_funciones_del_rol() {

    }

}

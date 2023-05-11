package co.com.fsfb.stepDefinition;

import co.com.fsfb.task.AutenticacionLogin;
import co.com.fsfb.task.BuscarEspecialidad;
import co.com.fsfb.task.BuscarPaciente;
import co.com.fsfb.task.VacunasPaciente;
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

    @Managed(driver= "chrome")
    WebDriver driver;
    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Global");
    }
    @Given("^el usuario ingresa a la web de Tasy$")
    public void el_usuario_ingresa_a_la_web_de_Tasy() {
        theActorInTheSpotlight().wasAbleTo(Open.url("http://10.1.0.145:7019/#/login"));
    }


    @When("^el usuario ingrese los datos (.*) y (.*)$")
    public void el_usuario_ingrese_los_datos_daniel_sanchez_y_Test(String user,String pass) {
        theActorInTheSpotlight().attemptsTo(AutenticacionLogin.loginUser(user,pass));
        theActorInTheSpotlight().attemptsTo(BuscarEspecialidad.buscarEspecialidad());
        theActorInTheSpotlight().attemptsTo(BuscarPaciente.buscarPaciente());
        theActorInTheSpotlight().attemptsTo(VacunasPaciente.vacunasPaciente());
    }

    @Then("^la sesion inicia correctamente al rol de usuarioArea$")
    public void la_sesion_inicia_correctamente_al_rol_de_usuarioArea() {

    }
}

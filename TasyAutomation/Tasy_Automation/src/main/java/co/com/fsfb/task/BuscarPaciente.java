package co.com.fsfb.task;

import co.com.fsfb.userInterface.BuscarEspecialidadPage;
import co.com.fsfb.userInterface.BuscarPacientePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.remote.DriverCommand;

public class BuscarPaciente implements Task
{
    private int num = 320;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BuscarPacientePage.btnLupa, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BuscarPacientePage.btnLupa),
                Click.on(BuscarPacientePage.btnAtencion),
                WaitUntil.the(BuscarPacientePage.txtNombre, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                SendKeys.of("Pedrito jose Vargas zamudio").into(BuscarPacientePage.txtNombre),
                WaitUntil.the(BuscarPacientePage.btnFiltrar, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BuscarPacientePage.btnFiltrar),
                Click.on(BuscarPacientePage.btnOkPaciente)

        );
    }
    public static  BuscarPaciente buscarPaciente(){

        return Tasks.instrumented(BuscarPaciente.class);
    }
}

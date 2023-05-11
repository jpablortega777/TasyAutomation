package co.com.fsfb.task;

import co.com.fsfb.userInterface.LoginPage;
import com.sun.javafx.scene.control.skin.TableCellSkin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AutenticacionLogin implements Task
{
    private String user;
    private String pass;
    public AutenticacionLogin(String user,String pass)
    {
        this.user=user;
        this.pass=pass;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(user).into(LoginPage.txtuserName),
                SendKeys.of(pass).into(LoginPage.txtpassWord),
                WaitUntil.the(LoginPage.btnInicioSesion, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LoginPage.btnInicioSesion)


        );

    }

    public static  AutenticacionLogin loginUser(String user,String pass){

        return Tasks.instrumented(AutenticacionLogin.class,user,pass);
    }
}

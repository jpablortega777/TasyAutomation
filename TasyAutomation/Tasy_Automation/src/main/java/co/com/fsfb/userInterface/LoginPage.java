package co.com.fsfb.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage
{
public static final Target txtuserName = Target.the("usuario").
        locatedBy("//input[@id='loginUsername']");
    public static final Target txtpassWord = Target.the("password").
            locatedBy("//input[@id='loginPassword']");
    public static final Target btnInicioSesion = Target.the("boton on sesion").
            locatedBy("(//input[@type='submit'])[1]");
    public static final Target btnOk = Target.the("boton Ok ventana emergente").
            locatedBy("//button[normalize-space()='Ok']");
    //span[normalize-space()='Ver']
}

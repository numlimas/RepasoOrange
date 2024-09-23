package opensource.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import opensource.UI.LoginPage;

public class Loguearse implements Task {
    private final String usuario;
    private final String contrasena;

    public Loguearse(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginPage.TXT_USUARIO),
                Enter.theValue(contrasena).into(LoginPage.TXT_CONTRASENA),
                Click.on(LoginPage.BTN_ENTRAR));
    }

    public static Loguearse conCredenciales(String usuario, String contrasena) {
        return new Loguearse(usuario, contrasena);
    }
}

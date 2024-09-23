package opensource.acciones;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import opensource.UI.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IngresarCredenciales implements Task {
    private final String usuario;
    private final String contasena;

    public IngresarCredenciales(String usuario, String contasena) {
        this.usuario = usuario;
        this.contasena = contasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginPage.TXT_USUARIO),
                Enter.theValue(contasena).into(LoginPage.TXT_CONTRASENA),
                Click.on(LoginPage.BTN_ENTRAR)
        );
    }

    public static IngresarCredenciales with(String usuario, String contrasena) {
        return instrumented(IngresarCredenciales.class, usuario, contrasena);
    }



}

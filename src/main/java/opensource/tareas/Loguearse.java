package opensource.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import opensource.acciones.IngresarCredenciales;

public class Loguearse implements Task {
    private final String usuario;
    private final String contrasena;

    public Loguearse(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(IngresarCredenciales.with(usuario, contrasena));
    }

    public static Loguearse conCredenciales(String usuario, String contrasena) {
        return new Loguearse(usuario, contrasena);
    }
}

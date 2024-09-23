package opensource.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import opensource.utils.VariableGlobal;


public class NavegarA implements Task {

    private final String url;

    public NavegarA(String url) {
        this.url = url;
    }

    public static NavegarA PaginaLogin() {
        return new NavegarA(VariableGlobal.urlOpensource);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}

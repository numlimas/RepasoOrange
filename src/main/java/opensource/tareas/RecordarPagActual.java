package opensource.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import opensource.habilidades.BuscarElSitio;

public class RecordarPagActual implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String currentUrl = BuscarElSitio.as(actor).getDriver().getCurrentUrl();
        actor.remember("currentUrl", currentUrl); // Guardar la URL actual en la memoria del actor
    }

    public static RecordarPagActual url() {
        return new RecordarPagActual();
    }
}

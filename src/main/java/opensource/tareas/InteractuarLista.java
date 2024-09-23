package opensource.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.waits.WaitUntil;
import opensource.UI.DatosCandidatosPage;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InteractuarLista implements Task {

    private final String opcionTexto;

    public InteractuarLista(String opcionTexto) {
        this.opcionTexto = opcionTexto;
    }

    public static InteractuarLista opcion(String opcionTexto) {
        return new InteractuarLista(opcionTexto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(DatosCandidatosPage.BTN_LISTA));

        actor.attemptsTo(Click.on(DatosCandidatosPage.BTN_LISTA));

        actor.attemptsTo(WaitUntil.the(DatosCandidatosPage.LISTA_OPTIONES, isVisible()).forNoMoreThan(5).seconds());

        actor.attemptsTo(WaitUntil.the(DatosCandidatosPage.LISTA_OPTIONES, isVisible()).forNoMoreThan(5).seconds());

        List<String> opciones = TextContent.of(DatosCandidatosPage.LISTA_OPTIONES).viewedBy(actor).asList();

        for (String opcion : opciones) {
            if (opciones.equals(opcionTexto)) {
                actor.attemptsTo(Click.on(DatosCandidatosPage.LISTA_OPTIONES.of(String.valueOf(opcion))));
                break;
            }
        }


    }
}
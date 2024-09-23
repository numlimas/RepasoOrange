package opensource.acciones;

import net.serenitybdd.screenplay.Action;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import opensource.habilidades.BuscarElSitio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SubirArchivo implements Action {

    private final String filePath;
    private final Target localizador;

    public SubirArchivo(String filePath, Target localizador) {
        this.filePath = filePath;
        this.localizador = localizador;
    }

    public static SubirArchivo conRuta(String filePath, Target localizador) {
        return instrumented(SubirArchivo.class, filePath, localizador);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BuscarElSitio.as(actor).getDriver();
        String absolutePath = Paths.get(filePath).toAbsolutePath().toString();
        String xpath = localizador.getCssOrXPathSelector();
        WebElement inputFile = driver.findElement(By.xpath(xpath));
        inputFile.sendKeys(absolutePath);
    }
}

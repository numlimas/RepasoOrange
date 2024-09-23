package opensource.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import opensource.UI.DatosCandidatosPage;
import opensource.driver.Navegacion;
import opensource.habilidades.BuscarElSitio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SubirArchivo implements Task {

    private final String filePath;

    public SubirArchivo(String filePath) {
        this.filePath = filePath;
    }

    public static SubirArchivo conRuta(String filePath) {
        return instrumented(SubirArchivo.class, filePath);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BuscarElSitio.as(actor).getDriver();

        // Convertir la ruta del archivo a una ruta absoluta
        String absolutePath = Paths.get(filePath).toAbsolutePath().toString();

        // Localizar el input de tipo 'file' y usar sendKeys para subir el archivo
        WebElement inputFile = driver.findElement(By.xpath("//input[@class='oxd-file-input']"));
        inputFile.sendKeys(absolutePath);
    }
}

package opensource.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/opensource.features/Login.feature",
        glue = "opensource/stepDefinitions",
        tags = "@Funcional",
        snippets = SnippetType.CAMELCASE
)

public class loginRunner {
}
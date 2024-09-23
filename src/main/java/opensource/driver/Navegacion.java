package opensource.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navegacion {
    public static WebDriver driver;



    public WebDriver iniciar() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("chrome-win64/chrome.exe");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        return driver;
    }

    public void terminar() {
        if (driver != null) {
            driver.quit();
        }
    }
}

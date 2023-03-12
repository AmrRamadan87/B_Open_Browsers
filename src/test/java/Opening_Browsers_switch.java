import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Opening_Browsers_switch {
    public static void main(String[] args) {
        WebDriver driver;
        switch ("Edge") {
            case "firefox":
               driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
                driver.navigate().to("https://the-internet.herokuapp.com/login");
                driver.quit();
                break;
            case "Chrome":
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
                driver.navigate().to("https://the-internet.herokuapp.com/login");
                driver.quit();
                break;

            case "Edge":
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
                driver.navigate().to("https://the-internet.herokuapp.com/login");
                driver.quit();
                break;
        }
    }

}

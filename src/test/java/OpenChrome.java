import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class OpenChrome {
    public static void main(String[] args) {

        String browserType = "firefox";
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            driver.navigate().to("https://the-internet.herokuapp.com/login");
        } else if (browserType == "firefox") {
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            driver.navigate().to("https://the-internet.herokuapp.com/login");

        }

    }


}
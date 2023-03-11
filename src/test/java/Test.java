
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test {
    public static void main(String[] args) {
        // Open Google Chrome
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Replace with your actual path
        WebDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.manage().window().maximize(); // Optional: Open browser window in maximized mode
        chromeBrowser.get("https://www.google.com");
}}


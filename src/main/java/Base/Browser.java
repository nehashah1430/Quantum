package Base;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.util.Locale;

public class Browser {
    public static WebDriver driver;
    public void LaunchBrowser (String browser){
        switch (browser.toLowerCase(Locale.ROOT)){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--remote-allow-origins=*","start-maximized");
                DesiredCapabilities cp=new DesiredCapabilities();
                cp.setCapability(ChromeOptions.CAPABILITY,options);
                options.merge(cp);
                driver=new ChromeDriver(options);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                driver=null;
                break;
        }
    }
}

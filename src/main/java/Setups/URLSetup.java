package Setups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class URLSetup extends Browser {
    WebDriverWait wait;
    public URLSetup(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void enterURL(String url){
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

}

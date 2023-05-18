package Helpers;

import Base.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper extends Browser {
    public WaitHelper(WebDriver driver){
        Browser.driver =driver;
    }
    public void waitForElementPresent(WebDriver driver, WebElement element, int timeout)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
        //System.out.println("Element found..."+element.getText());
    }


}

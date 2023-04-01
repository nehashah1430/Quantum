package TestCase;

import Setups.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login extends Browser {
    WebDriverWait wait;

    public Login(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @FindBy(xpath = "//input[@id='Username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(id = "loginButton")
    WebElement loginbtn;
    public void logincreds(String element, String element1){
        username.sendKeys(element);
        password.sendKeys(element1);
        loginbtn.click();
    }
}

package TestCase;

import Base.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesDashboard extends Browser {
    public SalesDashboard (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@aria-label='Sales Dashboard']")
    WebElement salesDashboardbtn;

}

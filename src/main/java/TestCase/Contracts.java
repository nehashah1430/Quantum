package TestCase;

import Base.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Contracts extends Browser{
    WebDriverWait wait;
    public Contracts(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait =  new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    @FindBy(xpath = "//a[@aria-label='Contracts']")
    WebElement contractbtn;
    @FindBy(xpath = "//span[@translate='Button.Search']/span[contains(text(),'Search')]")
    WebElement contractSearch;
    @FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/md-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]")
    public WebElement results;
    @FindBy(xpath = "//tr[@class='ng-scope']//td[@role='gridcell']//button[@type='button']//span[@class='ng-scope']//span[@class='ng-scope'][normalize-space()='Edit']")
    WebElement editContractbtn;

 /*   @FindBy(xpath = "//span[contains(text(),'New Contract')]")
    WebElement newcontract;
    @FindBy(xpath = "//button[@aria-label='Select Advertiser / Client']")
    WebElement advertiser;*/
 /*   public void navigateContracts(){
        contractbtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'New Contract')]")));
        newcontract.click();
    }
    public void newContract(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        advertiser.click();
    }*/
    public void searchContract(){
        wait.until(ExpectedConditions.visibilityOf(contractbtn));
        contractbtn.click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(contractSearch));
        contractSearch.click();
    }
    public void editContract(){
        wait.until(ExpectedConditions.visibilityOf(editContractbtn));
        editContractbtn.click();
    }

}

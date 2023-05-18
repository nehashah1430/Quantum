package ExecuteCase;

import Base.Browser;
import Helpers.WaitHelper;
import TestCase.Contracts;
import TestCase.Login;
//import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class QuantumModules extends Browser {
    Login login;
    Contracts contracts;
    WaitHelper waitHelper;
    Boolean expectedResult = true;

    @BeforeClass
    public void setup(){
        String browser="chrome";
        LaunchBrowser(browser);
        login = new Login(driver);
        contracts = new Contracts(driver);
        waitHelper=new WaitHelper(driver);
    }
    @Test(priority = 1)
    public void credsLogin(){
        login.logincreds("http://jcdecauxssoqa.billboardplanet.com/account/login?returnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3D8111797110116117109%26redirect_uri%3Dhttp%253A%252F%252Fjcdecauxqa.billboardplanet.com%252Fsignin-oidc%26response_type%3Dcode%2520id_token%26scope%3Dopenid%2520profile%2520offline_access%26response_mode%3Dform_post%26nonce%3D637702138510445076.OTE4YTRkOTAtYmMyMS00N2JmLTk2MGEtYzAzZjI3YzdlYTY0NWI4NmZjNDQtODhiNC00M2E5LThjMWUtOGQ5MTM2NTI0MDQ5%26state%3DCfDJ8CYAbHvAkJlJsmPnXQDpaNLTK3Zp_505BGik23J4jHDa0NMPquUb9Juz_qTwOFKeoGigca40fFqba80iTCloIYqauTJxc3fMJI0BdkY3-xB_jWfQE6DHK6OfzVy-aNQ5sIoCTttmOwvIFRTlNfKvismTnbgSx7ECvoVOn4jBP8kMubNrTRa1eBqsgF1dMQoZvHqLRqEkJNDHP17FaZ8qYpStHt1SNd3LPhfqEw_1W5TTb0gxpXdJzyEO44qToOf1g2V78kOGpd702joLgTXCacuoQV7GPg182unnTxqwT5gt7VSMi4f-Y5VnIpy6F7eott2hNjDDsdujVevuFpl5vjbwct07ENO9CkxSTB2vvO8E%26x-client-SKU%3DID_NET451%26x-client-ver%3D5.2.0.0","rashim","stage@BBP20");
    }
    @Test(priority = 2)
    public void contractSearch(){
        contracts.searchContract();
        waitHelper.waitForElementPresent(driver, contracts.results, 10);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Boolean searchResults = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/md-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]")).isDisplayed();
        Boolean searchResults = contracts.results.isDisplayed();

        Assert.assertEquals(searchResults,expectedResult,"Results are not displayed.");
        //System.out.println(searchResults);
    }
    @Test(priority = 3)
    public void contractForm(){
        contracts.editContract();
        Boolean contractno = driver.findElement(By.xpath("//span[@ng-class=\"{'redVoidColor': vm.ContractEdit.Style=='Voided'}\"]")).isDisplayed();
        //System.out.println(contractno);
        Assert.assertEquals(contractno,expectedResult,"Contract form not opened.");
    }
   /* @Test(priority = 3)
    public void contractsclick(){contracts.navigateContracts();}
    @Test(priority = 4)
    public void createContract(){contracts.newContract();}
*//*    public static void main(String[] args) {
        Execute le = new Execute();
        le.setup();
        le.gotoURL();
        le.credsLogin();
        le.contractsclick();
    }*/
}

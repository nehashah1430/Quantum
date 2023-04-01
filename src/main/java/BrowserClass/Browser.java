package BrowserClass;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.time.Duration;
import java.util.Locale;

public class Browser {
    public static WebDriver driver;
    public void LaunchBrowser (String browser){
        switch (browser.toLowerCase(Locale.ROOT)){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--remote-allow-origins=*","start-maximized");
                /*DesiredCapabilities cp=new DesiredCapabilities();
                cp.setCapability(ChromeOptions.CAPABILITY,options);
                options.merge(cp);*/
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
        driver.get("http://jcdecauxssoqa.billboardplanet.com/account/login?returnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3D8111797110116117109%26redirect_uri%3Dhttp%253A%252F%252Fjcdecauxqa.billboardplanet.com%252Fsignin-oidc%26response_type%3Dcode%2520id_token%26scope%3Dopenid%2520profile%2520offline_access%26response_mode%3Dform_post%26nonce%3D637702138510445076.OTE4YTRkOTAtYmMyMS00N2JmLTk2MGEtYzAzZjI3YzdlYTY0NWI4NmZjNDQtODhiNC00M2E5LThjMWUtOGQ5MTM2NTI0MDQ5%26state%3DCfDJ8CYAbHvAkJlJsmPnXQDpaNLTK3Zp_505BGik23J4jHDa0NMPquUb9Juz_qTwOFKeoGigca40fFqba80iTCloIYqauTJxc3fMJI0BdkY3-xB_jWfQE6DHK6OfzVy-aNQ5sIoCTttmOwvIFRTlNfKvismTnbgSx7ECvoVOn4jBP8kMubNrTRa1eBqsgF1dMQoZvHqLRqEkJNDHP17FaZ8qYpStHt1SNd3LPhfqEw_1W5TTb0gxpXdJzyEO44qToOf1g2V78kOGpd702joLgTXCacuoQV7GPg182unnTxqwT5gt7VSMi4f-Y5VnIpy6F7eott2hNjDDsdujVevuFpl5vjbwct07ENO9CkxSTB2vvO8E%26x-client-SKU%3DID_NET451%26x-client-ver%3D5.2.0.0");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


    }
}

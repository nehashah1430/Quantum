package ExecuteCase;

import BrowserClass.Browser;
import TestCase.Login;


public class LoginExec extends Browser {
    Login login;

    public void setup(){
        String browser="chrome";
        LaunchBrowser(browser);
        login = new Login(driver);
    }
    public void credsLogin(){
        login.logincreds("rashim","stage@BBP20");
    }
    public void clickloginbtn(){
        login.loginBTN();
    }

    public static void main(String[] args) {
        LoginExec le = new LoginExec();
        le.setup();
        le.credsLogin();
        le.clickloginbtn();
    }
}

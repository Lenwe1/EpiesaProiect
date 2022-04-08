package test.CreateAccountTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;

public class CreateAccountTest extends BaseTest {
    private String newUrl = getBaseUrl();

    @Test
    public void MyAccount(){
        driver.get(newUrl);
        createAccount.clickMyAccount();
        sleep(1000);
        createAccount.clickNewAccount();
        sleep(1000);
        createAccount.CreateNewAccount();
        sleep(1000);
    }

}

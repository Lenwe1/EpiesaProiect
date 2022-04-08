package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.CreateAccount.CreateAccount;
import pages.ClickFooter.ClickFooter;
import pages.HomePage.HomePage;


public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public CreateAccount createAccount = CreateAccount.getInstance();
    public ClickFooter clickFooter = ClickFooter.getInstance();


    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }



}

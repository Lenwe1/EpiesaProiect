package pages.CreateAccount;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import static pages.BasePage.getBaseUrl;
import static pages.HomePage.HomePage.instance;

public class CreateAccount extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(CreateAccount.class);
    public static CreateAccount instance;
    private String newUrl = getBaseUrl();

//    Accessing MyAccount section to create New Account
    private By MyAccount = By.xpath("//*[@id='myNavbar']/ul[2]/li/a");
    private By CreateNewAccount = By.xpath("//*[@id='myNavbar']/ul[2]/li/ul/li/a");

//    Filling the create account form
    private By email =By.xpath("//input[@name='email']");
    private By lname =By.xpath("//input[@name='nume']");
    private By fname = By.xpath("//input[@name='prenume']");
//

    private CreateAccount(){

    }



    public static pages.CreateAccount.CreateAccount getInstance(){
        if(instance==null){
            instance=new pages.CreateAccount.CreateAccount();
        }
        return instance;
    }

    public void clickMyAccount(){
        LOG.info("Click MyAccount button");
        driver.findElement(MyAccount).click();
    }

    public void clickNewAccount(){
        LOG.info("Create New Account");
        driver.findElement(CreateNewAccount).click();
    }

    public void CreateNewAccount(){
        LOG.info("complete account form");
        driver.findElement(email).sendKeys("abc@abc.com");
        driver.findElement(lname).sendKeys("Cescu");
        driver.findElement(fname).sendKeys("Ab");
    }
}

package pages.ClickFooter;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ClickFooter extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(ClickFooter.class);
    public static ClickFooter instance;

    private By Waranty = By.xpath("//a[@title='garantie si retur']");
    private By Magazin = By.xpath("//a[@href='/magazin-piese-auto-sibiu']");
    private By Contact = By.xpath("//a[@title='contact epiesa.ro']");
    private By Terms = By.xpath("//a[@title='termeni si conditii']");



    private ClickFooter(){

    }

    public static ClickFooter getInstance(){
        if (instance == null){
            instance = new ClickFooter();
        }
        return instance;
    }

    public void ClickGarantii(){
        LOG.info("Click Garantii Footer section");
        driver.findElement(Waranty).click();
    }

    public void clickMagazin(){
        LOG.info("Click Magazin Footer section");
        driver.findElement(Magazin).click();
    }

    public void contact(){
        LOG.info("Click on Contact Footer");
        driver.findElement(Contact).click();
    }

    public void termeni(){
        LOG.info("click Termeni si conditii");
        driver.findElement(Terms).click();
    }
}

package pages.HomePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(pages.HomePage.HomePage.class);
    public static pages.HomePage.HomePage instance;

    private HomePage() {

    }

    private By MeniuPieseUniversale = By.xpath("/html/body/nav[2]/div/div[2]/div/span[3]");
    private By clickRotiMeniu = By.xpath("//a[@class='a-tab-menu test'][@href='/accesorii-auto/roti/']");
    private By clickAnvelopeAuto = By.xpath("//img[@src='/images/42.jpg']");
    private By cartAnvelope = By.xpath("//button[@onclick=\"document.getElementById('adauga_piesa_cos_4708').submit();\"]");
    private By CosulMeu = By.xpath("/html/body/nav[2]/div/ul[1]/li/a/span[2]");


    public static pages.HomePage.HomePage getInstance() {
        if (instance == null) {
            instance = new pages.HomePage.HomePage();
        }
        return instance;
    }

    public void clickPieseUniversale() {
        LOG.info("Click Meniu Piese Universale");
        driver.findElement(MeniuPieseUniversale).click();
    }

    public void clickRotiMeniu() {
        LOG.info("Click Roti din Meniu Piese Universale");
        driver.findElement(clickRotiMeniu).click();

    }

    public void Anvelope() {
        LOG.info("Click Anvelope image");
        driver.findElement(clickAnvelopeAuto).click();
    }

    public void addCartAnvelope() {
        LOG.info("Click to add Anvelope to Cart");
        driver.findElement(cartAnvelope).click();
    }

    public void viewCosulMeu(){
        LOG.info("Access Cosul Meu / Cart ");
        driver.findElement(CosulMeu).click();
    }


//            public void clickMyAccount(){
//                LOG.info("Click MyAccount button");
//                driver.findElement(MyAccount).click();
//            }
//
//            public void clickNewAccount(){
//                LOG.info("Create New Account");
//                driver.findElement(CreateNewAccount).click();
//    }
}

package pages.HomePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {
            private static final Logger LOG = LoggerFactory.getLogger(pages.HomePage.HomePage.class);
            public static pages.HomePage.HomePage instance;

//            private By MyAccount = By.xpath("//*[@id='myNavbar']/ul[2]/li/a");
//            private By CreateNewAccount = By.xpath("//*[@id='myNavbar']/ul[2]/li/ul/li/a");


            public static pages.HomePage.HomePage getInstance(){
                if(instance==null){
                    instance=new pages.HomePage.HomePage();
                }
                return instance;
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

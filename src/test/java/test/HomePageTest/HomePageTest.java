package test.HomePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.sleep;

public class HomePageTest extends BaseTest {
    @Test
    public void MyAccount(){
//        homePage.clickMyAccount();
//        homePage.clickNewAccount();
        homePage.clickPieseUniversale();
        homePage.clickRotiMeniu();
        sleep(1000);
        homePage.Anvelope();
        homePage.addCartAnvelope();
        sleep(1000);
        homePage.viewCosulMeu();
        sleep(1000);

    }

}

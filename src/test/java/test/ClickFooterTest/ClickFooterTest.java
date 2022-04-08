package test.ClickFooterTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;

public class ClickFooterTest extends BaseTest {
    private String newUrl = getBaseUrl();

    @Test
    public void Footer(){
        driver.get(newUrl);
        clickFooter.ClickGarantii();
        sleep(1000);
        clickFooter.clickMagazin();
        sleep(1000);
        clickFooter.contact();
        sleep(1000);
        clickFooter.termeni();
        sleep(1000);

    }
}

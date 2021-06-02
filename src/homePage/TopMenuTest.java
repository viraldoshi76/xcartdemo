package homePage;

import browserTesting.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]"));
        verifyMessage("user is not navigated", "Shipping",By.xpath("//h1[@id='page-title']"));

    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
        verifyMessage("user is not navigated to new link", "New arrivals",By.xpath("//h1[@id='page-title']"));
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]"));
        verifyMessage("user is not navigated to comingsoon page","Coming soon",By.xpath("//h1[@id='page-title']"));
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]"));
        Thread.sleep(3000);
        verifyMessage("user is not navigated to contact us page", "Contact us",By.xpath("//h1[@id='page-title']"));
    }
}

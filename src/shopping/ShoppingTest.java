package shopping;

import browserTesting.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ShoppingTest extends BaseTest {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        Thread.sleep(3000);
        verifyMessage("user in not on sale page", "Sale", By.xpath("//h1[@id='page-title']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//div[@class='sort-box']"));
        Thread.sleep(5000);
        clickOnElement(By.xpath("//a[contains(text(),'Name A - Z')]"));
        Thread.sleep(5000);
        mouseHoverAndClickElement(By.xpath("(//span[text()='Add to cart'])[1]"));
        verifyMessage("message is not verified", "Product has been added to your cart", By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//a[@class='close']"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[4]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
        verifyMessage("its not right quantity", "Your shopping cart - 1 item", By.xpath("//h1[@id='page-title']"));
        Thread.sleep(3000);
        clearTextSendText(By.xpath("//input[@id='amount16']"), "2");
        verifyMessage("its not 2 qty", "Your shopping cart - 2 items", By.xpath("Your shopping cart - 2 items"));
        Thread.sleep(3000);
        verifyMessage("there is no subtotal", "$29.98", By.xpath("(//span[@class='cart-subtotal']//span[@class='surcharge-cell'])[1]"));
        verifyMessage("there is no total", "$36.00", By.xpath("//li[@class='total']//span[@class='surcharge-cell']"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[5]/button[1]"));
        verifyMessage("there is no login message", "Log in to your account", By.xpath("//h3[contains(text(),'Log in to your account')]"));
        sendTextToElement(By.xpath("//input[@id='email']"), "prime@gmail.com");
        clickOnElement(By.xpath("//tbody/tr[2]/td[1]/button[1]"));
        verifyMessage("there is no message", " Secure Checkout", By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]"));
        sendTextToElement(By.xpath("//input[@id='shippingaddress-firstname']"), "viral");
        Thread.sleep(3000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-lastname']"), "chokshi");
        Thread.sleep(3000);
        Thread.sleep(3000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-street']"), "123 churchil road");
        clearTextSendText(By.xpath("//input[@id='shippingaddress-city']"), "london");
        Thread.sleep(3000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-custom-state']"), "england");
        clearTextSendText(By.xpath("//input[@id='shippingaddress-zipcode']"), "w12 3kl");
        Thread.sleep(3000);
        clickOnElement(By.xpath("//input[@id='create_profile']"));
        sendTextToElement(By.xpath("//input[@id='create_profile']"), "lkjh1234");
        Thread.sleep(3000);
        mouseHoverAndClickElement(By.xpath("//label[@title='Local shipping']//input[@id='method128']"));
        mouseHoverAndClickElement(By.xpath("//input[@value='6']"));
        Thread.sleep(3000);
        verifyMessage("the total doesnt match", "$37.03", By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]/span[1]/span[1]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]"));
        verifyMessage("there is no thankyou message", "Thank you for your order", By.xpath("//h1[@id='page-title']"));

    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        mouseHoverAndClickElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        verifyMessage("there is no message","Bestsellers",By.xpath("//h1[@id='page-title']"));
        Thread.sleep(5000);
        clickOnElement(By.xpath("//a[contains(text(),'Name A - Z')]"));
        mouseHoverAndClickElement(By.xpath("(//span[text()='Add to cart'])[7]"));
        verifyMessage("message is not verified", "Product has been added to your cart", By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        clickOnElement(By.xpath("//a[@class='close']"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[4]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
        verifyMessage("its not right quantity", "Your shopping cart - 1 item", By.xpath("//h1[@id='page-title']"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));
        alertAccept();
        Thread.sleep(3000);
        verifyMessage("there is no such message displayed","Item(s) deleted from your cart",By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]"));
        verifyMessage("there is no empty cart message","Your cart is empty",By.xpath("//h1[@id='page-title']"));



    }


}

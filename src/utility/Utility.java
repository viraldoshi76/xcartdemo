package utility;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility {

    public WebDriver driver;


    public void clickOnElement(By by){
        driver.findElement(by).click();

    }

    public String getTextFromElement(By by){
        return driver.findElement(by).getText();// or you can write like String text = driver.findElement(by)   //te
    }


    public void sendTextToElement(By by,String text){

        driver.findElement(by).sendKeys(text);
    }


    public void selectByValueDropDown(By by, String value){
        Select select =new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public void verifyMessage(String message, String expctedMessage, By by ){

        String actualMessage = getTextFromElement(by);
        Assert.assertEquals(message,expctedMessage,actualMessage);

    }

    public void mouseHoverToElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }


    public void clearTextSendText(By by, String text){

        WebElement changeText = driver.findElement(by);
        changeText.clear();
        changeText.sendKeys(text);
    }

    public void mouseHoverAndClickElement(By by) {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();

    }
    public void alertAccept() {

        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.accept();
    }



}

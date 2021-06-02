package hotdeals;

import browserTesting.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HotDealsTest extends BaseTest {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
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
        List <WebElement> productName = driver.findElements(By.xpath("//ul[@class='products-grid grid-list']/descendant::h5"));
        verifyProductNameSortedAscendingAlphabeticalOrder("(//ul[@class='products-grid grid-list']/descendant::h5)",productName);


    }


    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        Thread.sleep(3000);
        verifyMessage("user in not on sale page", "Sale", By.xpath("//h1[@id='page-title']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//div[@class='sort-box']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//a[contains(text(),'Price Low - High')]"));
        List <WebElement> productPrice = driver.findElements(By.xpath("//ul[@class='products-grid grid-list']/descendant::span[@class='price product-price']"));
        verifyProductSortedAsPerPriceLowToHighFilter("(//ul[@class='products-grid grid-list']/descendant::span[@class='price product-price'])",productPrice);

    }


    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        Thread.sleep(3000);
        verifyMessage("user in not on sale page", "Sale", By.xpath("//h1[@id='page-title']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//div[@class='sort-box']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//a[contains(text(),'Rates ')]"));
        List <WebElement> productPrice = driver.findElements(By.xpath("//ul[@class='products-grid grid-list']/descendant::span[@class='price product-price']"));
        verifyProductSortedAsPerPriceLowToHighFilter("(//ul[@class='products-grid grid-list']/descendant::span[@class='price product-price'])",productPrice);

    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        Thread.sleep(3000);
        verifyMessage("user in not on sale page", "Bestsellers", By.xpath("//h1[@id='page-title']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//div[@class='sort-box']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//a[contains(text(),'Name Z - A')]"));
        List <WebElement> productName = driver.findElements(By.xpath("//ul[@class='products-grid grid-list']/descendant::h5"));
       verifyProductSortedAsPerZToAFilter("(//ul[@class='products-grid grid-list']/descendant::h5)",productName);

    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        Thread.sleep(3000);
        verifyMessage("user in not on sale page", "Bestsellers", By.xpath("//h1[@id='page-title']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//div[@class='sort-box']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//a[contains(text(),'Price High - Low')]"));
        List <WebElement> productPrice = driver.findElements(By.xpath("//ul[@class='products-grid grid-list']/descendant::span[@class='price product-price']"));
        verifyProductSortedAsPerPriceHighToLowFilter("(//ul[@class='products-grid grid-list']/descendant::span[@class='price product-price'])",productPrice);

    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        Thread.sleep(3000);
        verifyMessage("user in not on sale page", "Bestsellers", By.xpath("//h1[@id='page-title']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//div[@class='sort-box']"));
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//a[contains(text(),'Rates ')]"));
        List <WebElement> productRating = driver.findElements(By.xpath("//ul[@class='products-grid grid-list']/descendant::div[contains(text(),'Score')]"));
        verifyProductSortedAsPerRatesFilter("(//ul[@class='products-grid grid-list']/descendant::div[contains(text(),'Score')])",productRating);

    }

    public void verifyProductSortedAsPerZToAFilter(String xPath, List<WebElement> productList) throws InterruptedException {

        int size = productList.size();
        boolean result = false;
        List<String> sortedProductNameList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Thread.sleep(500);
            int xPathIndex = i + 1;
            String product = driver.findElement(By.xpath(xPath + "[" + xPathIndex + "]")).getText();
            sortedProductNameList.add(product);
        }
        List<String> actualProductNameList = new ArrayList<>(sortedProductNameList);
        Collections.sort(sortedProductNameList);
        Collections.reverse(sortedProductNameList);
        for (int i = 0; i < size; i++) {
            if (!actualProductNameList.get(i).equals(sortedProductNameList.get(i))) {
                System.out.println("Products does not sorted as per Z to A filter");
                System.out.println("Expected result:" + sortedProductNameList.get(i) + "\tActual result:\t" + actualProductNameList.get(i));
                result = true;
            }
        }
    }

    public void verifyProductSortedAsPerPriceHighToLowFilter(String xpath, List<WebElement> priceList) throws InterruptedException {

        int size = priceList.size();
        boolean result = false;
        List<Double> actualList = new ArrayList<>();
        for (int i = 0, j = i + 1; i < size; i++) {
            Thread.sleep(500);

            String price = driver.findElement(By.xpath(xpath + "[" + j + "]")).getText();
            String newPrice1 = price.replace("$", " ");
            double newPrice = Double.parseDouble(newPrice1);

            actualList.add(newPrice);
        }
        List<Double> sortedList = new ArrayList<>(actualList);

        Collections.sort(sortedList);
        Collections.reverse(sortedList);

        for (int i = 0; i < size; i++) {
            if (!actualList.get(i).equals(sortedList.get(i))) {
                System.out.println("Products does not sorted as per Price:High to Low filter");
                System.out.println("Expected result:" + sortedList.get(i) + "\tActual result:\t" + actualList.get(i));
                result = true;
            }
        }

    }

    public void verifyProductSortedAsPerRatesFilter(String xPath, List<WebElement> productRatesList) throws InterruptedException {

        int size = productRatesList.size();
        List<String> actualList = new ArrayList<>();
        boolean result = false;
        for (int i = 0; i < size; i++) {

            Thread.sleep(500);
            int j = i + 1;
            WebElement element = driver.findElement(By.xpath(xPath + "[" + j + "]"));
            actualList.add(element.getAttribute("style"));
        }
        List<String> tempActualList = new ArrayList<>(actualList);
        Collections.sort(tempActualList);
        Collections.reverse(tempActualList);
        List<String> sortedList = new ArrayList<>(tempActualList);
        for (int i = 0; i < size; i++) {
            if (!actualList.get(i).equals(sortedList.get(i))) {
                System.out.println("Products does not sorted as per Rates filter");
                System.out.println("Expected list:\t" + sortedList.get(i) + "\tActual list:\t" + actualList.get(i));
                result = true;
            }
        }
    }

    public void verifyProductSortedAsPerPriceLowToHighFilter(String xPath, List<WebElement> productPriceList) throws InterruptedException {

        int size = productPriceList.size();
        boolean result = false;
        String[] actualPriceList = new String[size];
        String[] sortedPriceList = new String[size];
        for (int i = 0; i < size; i++) {
            Thread.sleep(1000);
            int j = i + 1;
            actualPriceList[i] = sortedPriceList[i] = driver.findElement(By.xpath(xPath + "[" + j + "]")).getText();
        }
        Arrays.sort(sortedPriceList);
        for (int i = 0; i < size; i++) {
            if (!actualPriceList[i].equals(sortedPriceList[i])) {
                System.out.println("Products does not sorted as per Price :Low to High");
                System.out.println("Expected List:\t" + sortedPriceList[i] + "Actual List:\t" + actualPriceList[i]);
                result = true;
            }
        }
    }
    public void verifyProductNameSortedAscendingAlphabeticalOrder(String xpath, List<WebElement> productName) throws InterruptedException {

        int size = productName.size();
        boolean result = false;
        String[] actual = new String[size];
        String[] sorted = new String[size];
        for (int i = 0; i < size; i++) {

            Thread.sleep(2000);
            int xpath_index = i + 1;
            actual[i] = sorted[i] = driver.findElement(By.xpath(xpath + "[" + xpath_index + "]")).getText();
        }
        Arrays.sort(sorted);
        for (int i = 0; i < size; i++) {

            if (!actual[i].equals(sorted[i])) {

                System.out.println("Products does not sorted as per A to Z filter");
                System.out.println("Expected result: \t" + sorted[i] + "\tActual result:\t" + actual[i]);
                result = true;
            }
        }
    }





}
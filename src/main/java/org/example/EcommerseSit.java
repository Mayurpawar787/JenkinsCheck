package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EcommerseSit {

    public static void main(String[] args) throws InterruptedException {

        //Flipkart
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com/");
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        WebElement womenEle = driver.findElement(By.xpath("//*[@class='_16rZTH']//following::a[@class='_1BJVlg' and contains(text(),'Women Ethnic')]"));
        actions.moveToElement(womenEle).build().perform();
        WebElement saree = driver.findElement(By.xpath("//*[@class='_16rZTH']//following::a[@class='_3490ry' and contains(text(),'Women Sarees')]"));
        saree.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        WebElement priceMax = driver.findElement(By.xpath("//*[@class='suthUA']//following::select"));
        Select select = new Select(priceMax);
        List<WebElement> alldropdownValues=select.getOptions();
        alldropdownValues.stream().map(WebElement::getText).forEach(System.out::println);

        select.selectByValue("700");
        //Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='zg-M3Z' and contains(text(),'Newest First')]"))).click();
        /*WebElement sort = driver.findElement(By.xpath("//div[@class='zg-M3Z' and contains(text(),'Newest First')]"));
        sort.click();*/




        //driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']")).click();


    }

}

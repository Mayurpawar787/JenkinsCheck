package org.example.seleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://www.nseindia.com/";
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get(baseUrl);
        /*String expectedTooltip = "Github";
        // Find the Github icon at the top right of the header
        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
        //get the value of the "title" attribute of the github icon
        String actualTooltip = github.getAttribute("title");
        //Assert the tooltip's value is as expected
        System.out.println("Actual Title of Tool Tip"+actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }*/
        driver.findElement(By.xpath("//a[@id='Derivatives']")).click();
        driver.findElement(By.xpath("//input[@id='radioClear_derivativeEqTab']/following::label[@id='market-lakh'][1]")).click();

        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rest-assured.io/");

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();

        //Scroll Using JS
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");*/

    }
}

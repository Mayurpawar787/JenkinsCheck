package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class JavaScriptExe {
    public static void main(String[] args) {
        /*// Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }*/


        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        driver.get("https://www.geeksforgeeks.org/");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        String sText = (String) js.executeScript("return document.title;");

        System.out.println(sText);
        /*js.executeScript("window.scrollBy(0,550)");*/

        WebElement java = driver.findElement(
                By.xpath("//*[starts-with(@class,'HomePageSearchContainer_homePageSearchContainer_container_input')]"));

        // Create a referen

        // Call the JavascriptExecutor methods
        js.executeScript("arguments[0].click();", java);
        java.sendKeys("Java Subject");
        js.executeScript("location.reload()");


        WebDriverWait wait = new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath(""))));


    }
}
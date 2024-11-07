package org.example.practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCSS {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        /*driver.get("https://bstackdemo.com/");
        driver.findElement(By.cssSelector("a#offers")).click();

        driver.findElement(By.cssSelector("#username > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder")).sendKeys("demouser");
        driver.findElement(By.cssSelector("#password")).sendKeys("testingisfun99");

        driver.findElement(By.cssSelector("#login-btn")).click();*/


        /*driver.get("https://www.htmlelements.com/demos/fileupload/shadow-dom/");
        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement testUpload = driver.findElement(By.cssSelector(".smart-ui-component"));
        //WebElement element = (WebElement) jse.executeScript("return document.querySelector('smart-ui-file-upload').shadowRoot.querySelector('#button64f3')");
        WebElement element = (WebElement) jse.executeScript("return arguments[0].shadowRoot", testUpload);
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);
        WebElement cont = element.findElement(By.cssSelector(""));*/


        //
        /*driver.get("http://watir.com/examples/shadow_dom.html");
        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        WebElement shadowRoot = (WebElement) jsDriver.executeScript("return arguments[0].shadowRoot", shadowHost);
        //WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#shadow_content"));
        WebElement shadow2nd = shadowHost.findElement(By.cssSelector("#nested_shadow_content"));
        WebElement shadowContent = (WebElement) jsDriver.executeScript("return arguments[0].shadowRoot", shadow2nd);
        //WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#nested_shadow_content"));
        System.out.println(shadowContent.getText());*/

        // With New Selenium 4+ feature
        driver.get("http://watir.com/examples/shadow_dom.html");
        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#shadow_content"));
        System.out.println(shadowContent.getText());

        // With JavaScript Executor for Nested Shadow Root Elements
        //document.querySelector('#shadow_host').shadowRoot.querySelector('#nested_shadow_host')
        //.shadowRoot.getElementById('nested_shadow_content')
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement element = (WebElement) jse.executeScript("return document.querySelector('#shadow_host').shadowRoot.querySelector('#nested_shadow_host').shadowRoot.getElementById('nested_shadow_content')");
        System.out.println(element.getText());


    }

}

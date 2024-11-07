package org.example.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

    static WebDriver driver;

    public static WebDriver getChromeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return driver= new ChromeDriver(options);
    }
}

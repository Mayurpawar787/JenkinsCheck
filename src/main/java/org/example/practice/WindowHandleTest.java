package org.example.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleTest {

    public static void main(String[] args) throws InterruptedException {


        // we are using chrome driver
       // System.setProperty("webdriver.chrome.driver", "Path of chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // entering the URL
        driver.get("https://www.geeksforgeeks.org/");
        // to maximize the window
        driver.manage().window().maximize();
        // to delete all cookies
        driver.manage().deleteAllCookies();
        // to Scroll the screen to locate element
        JavascriptExecutor je = (JavascriptExecutor)driver;
        //je.executeScript("window.scrollBy(0, 200)");
        //driver.findElement(By.xpath("(//span[text()='Courses at GeeksforGeeks'])[2]")).click();
        driver.findElement(By.xpath("//*[text()='DSA to Development: A Complete Guide']")).click();

        // to select a particular course
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//h4[text()='Data Structures and Algorithms - Self Paced'])[1]")).click();

        // it will open with new tab

        // getWindowHandle method to get ID of main window(parent window)
        String Parent_id = driver.getWindowHandle();
        System.out.println(Parent_id);

        // getWindowHandle method to get ID of new window (child window)
        Set<String> Child_id = driver.getWindowHandles();

        // for each loop
        for (String a : Child_id) {
            // it will print IDs of both window
            System.out.println(a);

            // condition to change the focus of selenium
            if (Parent_id.equals(a)) {
            }
            else { // to change focus on new window
                driver.switchTo().window(a);
                Thread.sleep(2000);
                System.out.println(driver.getTitle());
                // to handle the popup regarding cookies
                /*driver.findElement(By.xpath("//button[text()='Got it!']")).click();

                // to click on (Read more here)
                je.executeScript("window.scrollBy(0, 600)");
                driver.findElement(By.xpath("(//a[text()='(Read more here)'])[1]")).click();*/

                // statement to understand that operation is performed on new window
                System.out.println("operation is performed on new window");
                driver.switchTo().window(Parent_id);
                System.out.println(driver.getTitle());

            }
        }

    }
}

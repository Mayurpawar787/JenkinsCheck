package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiWindowHandle {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        driver.get("https://www.imdb.com/title/tt1877830/fullcredits?ref_=tt_cl_wr_sm");

        List<Map<?,?>> allFetchedData = new ArrayList<>();
        List<WebElement> list = driver.findElements(By.xpath("//h4[@id='costume_designer']//following::table[1]/tbody/tr"));
        List<?> columnHeaders = Arrays.asList("Actor","middle","Role");
        for(int i=1;i< list.size();i++){
            String xpath_row = "//h4[@id='production_manager']//following::table[1]/tbody/tr["+i+"]/td";
            List<WebElement> rowlist = driver.findElements(By.xpath(xpath_row));
            List<?> rowData = rowlist.stream().map(WebElement::getText).toList();
            Map<?,?> map = IntStream.range(0, rowData.size()).boxed().collect(Collectors.toMap(columnHeaders::get,rowData::get));
            //map.forEach((k,v)->System.out.println(k+" : "+v));
            allFetchedData.add(map);
        }
        allFetchedData.forEach(System.out::println);
        //h4[@id='production_manager']//following::table[1]/tbody/tr
        //h4[@id='production_manager']//following::table[1]/tbody/tr[1]/td

        //test For Multi Window Switch
        /*driver.get("https://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String MainWindow = driver.getWindowHandle();
        System.out.println(MainWindow);
        Set<String> s1 = driver.getWindowHandles();

        Iterator<String> i1=s1.iterator();
        while(i1.hasNext())
        {
            String ChildWindow=i1.next();
            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("gaurav.3n@gmail.com");

                //Switching Back to Main Window
                driver.switchTo().window(MainWindow);
                System.out.println(driver.findElement(By.xpath("//*[@title='Home' and contains(text(),'Demo')]")).getText());

                //Switching Again to Child Window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("btnLogin")).click();

                List<WebElement> listRes = driver.findElements(By.xpath("//*[@class='accpage']"));
                List<String> data = listRes.stream().map(WebElement::getText).toList();
                data.forEach(System.out::println);

                //Swicthing back to Main Window Again
                driver.switchTo().window(MainWindow);
                System.out.println(driver.findElement(By.xpath("//*[@title='Home' and contains(text(),'Demo')]")).getText());

                // Closing the Child Window.
                driver.switchTo().window(ChildWindow);
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);*/
    }

}

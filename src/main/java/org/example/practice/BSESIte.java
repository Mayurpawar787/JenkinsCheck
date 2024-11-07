package org.example.practice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BSESIte extends BaseClass {


    public static void main(String[] args) throws InterruptedException {


        /*List<Object> tList = new ArrayList<>();
        tList.add("+74.25");
        tList.add("+254.10");
        tList.add("+74.27");

        tList.stream().sorted().collect(Collectors.toList());*/


        WebDriver driver = getChromeDriver();
        //driver.get("https://www.bseindia.com/EQStreamer/StreamerMarketwatch.html?flag=2");
        driver.get("https://www.bseindia.com/index.html");

        driver.findElement(By.xpath("//h5[@id='exampleModalLabel']/following::button[1]")).click();
        /*Alert alert = driver.switchTo().alert();
        alert.dismiss();*/


        //testing for Another Table
        WebElement element = driver.findElement(By.xpath("//div[@class='responsive-tabs-container accordion-xs accordion-sm']//ul[@role='tablist']/following::ul[1]//a[@id='gainer' and contains(text(),'Gainers')]"));
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Thread.sleep(3000);
        element.click();*/

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);

        List<Map<String,Object>> allData = new ArrayList<>();
        //driver.findElement(By.xpath("//div[@class='responsive-tabs-container accordion-xs accordion-sm']//ul[@role='tablist']/following::ul[1]//a[@id='gainer' and contains(text(),'Gainers')]")).click();
        List<WebElement> list = driver.findElements(By.xpath("//div[@id='gain']/table/tbody[1]/tr[1]/td"));
        List<String> col = list.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println(col);
        List<WebElement> totalRows = driver.findElements(By.xpath("//div[@id='gain']/table/tbody"));
        for(int i=2;i< totalRows.size();i++) {
            List<WebElement> gainersColHeaders = driver.findElements(By.xpath("//div[@id='gain']/table/tbody["+i+"]/tr[1]/td"));
            List<String> gainColHeadList = gainersColHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
            //gainColHeadList.remove(gainColHeadList.size());
            Map<String,Object> map = IntStream.range(0, col.size()).boxed().collect(Collectors.toMap(col::get,gainColHeadList::get));
            allData.add(map);
            System.out.println(gainColHeadList);
        }
        //All Data fetched un List of Map
        System.out.println(allData);

        List<Object> data = allData.stream().flatMap(map -> map.entrySet().stream())
                .filter(entry -> entry.getKey().equals("Security"))
                .map(Map.Entry::getValue).collect(Collectors.toList());

        List<Object> valList = allData.stream().flatMap(map -> map.entrySet().stream())
                .filter(entry -> entry.getKey().equals("Change")).map(Map.Entry::getValue).collect(Collectors.toList());

        Map<Object,Object> tMap = IntStream.range(0, data.size()).boxed().collect(Collectors.toMap(data::get,valList::get));
        System.out.println(tMap.entrySet().stream().sorted());

        //System.out.println("Highest changed : ");

        /*List<Object> tList = new ArrayList<>();
        tList.add("+74.25");
        tList.add("+254.10");
        tList.add("+74.27");*/


        System.out.println(data);


        /*List<WebElement> list = driver.findElements(By.xpath("//div[@class='mktwatchtable']/table/thead/tr/th"));
        List<String> columns = list.stream().map(WebElement::getText).collect(Collectors.toList());
        columns.remove(0);
        System.out.println(columns);
        //To get All Rows Data from table:
        List<Map<String, String>> allData = new ArrayList<>();
        //Number of Rows Iteration:
        List<WebElement> rows = driver.findElements(By.xpath("//div[@class='mktwatchtable']/table/tbody/tr"));
        for(int i =1;i< rows.size();i++){
            String rowXpath = "//div[@class='mktwatchtable']/table/tbody/tr["+i+"]/td";
            List<WebElement> rowEle = driver.findElements(By.xpath(rowXpath));
            List<String> rowData = rowEle.stream().map(WebElement::getText).collect(Collectors.toList());
            Map<String, String> map = IntStream.range(0, columns.size()).boxed().collect(Collectors.toMap(columns::get,rowData::get));
            allData.add(map);
        }
        //System.out.println(allData.get(1));
        List<String> securities = allData.stream().flatMap( map -> map.entrySet().stream())
                .filter( entry -> entry.getKey().equals("Security"))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        List<String> putList = securities.stream().filter(s -> s.contains("PE")).map(String::toString).collect(Collectors.toList());
        //Getting stock having max Selling Price in the chart
        Map<String, Double> valueMap = new HashMap<>();
        for( String str : putList){
            for(int i =0;i< allData.size();i++){
                if(allData.get(i).containsValue(str)){
                    valueMap.put(str, Double.valueOf(allData.get(i).get("Sell(Rs)")));
                }
            }
        }

        String maxValue = String.valueOf(valueMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
        System.out.println(maxValue);*/
        //System.out.println(valueMap);

        //System.out.println(securities);



        //




    }
}

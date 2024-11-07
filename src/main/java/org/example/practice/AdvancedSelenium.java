package org.example.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdvancedSelenium {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0;Win64; x64) AppleWebKit/537.36(KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

        Thread.sleep(3000);
        List<WebElement> columnsEle = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
        List<String> columnHeaders = columnsEle.stream().map(WebElement::getText).collect(Collectors.toList());
        columnHeaders.remove(0);
        //columnHeaders.remove(columnHeaders.size()-1);
        System.out.println(columnHeaders);

        //Table Rows:
        List<WebElement> bodyRows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
        List<Map<String, String>> allData = new ArrayList<>();
        for(int i=1;i<= bodyRows.size();i++){
            String xpathSample = "//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td";
            List<WebElement> list = driver.findElements(By.xpath(xpathSample));
            List<String> rowData = list.stream().map(WebElement::getText).collect(Collectors.toList());
            Map<String, String> map = IntStream.range(0, columnHeaders.size()).boxed().collect(Collectors.toMap(columnHeaders::get,rowData::get));
            allData.add(map);
        }

        List<String> allCities = allData.stream().flatMap( map -> map.entrySet().stream())
                .filter(entry -> entry.getKey().equals("City"))
                .map(Map.Entry::getValue).collect(Collectors.toList());
        System.out.println(allCities);

        for( String str : allCities){
            for(int i =0; i<allData.size();i++){
                if(allData.get(i).containsValue(str)){
                    System.out.println("Citi is : "+str+ " and Year is : "+allData.get(i).get("Built"));
                }
            }
        }

    }
}

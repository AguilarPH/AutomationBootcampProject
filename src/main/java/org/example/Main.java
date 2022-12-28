package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "/Users/pa0822/Documents/Automation Bootcamp/Project1/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/#");
        WebElement categories = driver.findElement(By.xpath("//div[@class='list-group']"));
//        WebElement categories = driver.findElement(By.className("list-group"));
        List<String> expectedCategories = new ArrayList<>(Arrays.asList("Phones", "Laptops", "Monitors"));
        List<WebElement> categoriesList = categories.findElements(By.xpath("./child::*"));
        for (WebElement children : categoriesList) {
            System.out.println(children.getText());
        }


        WebElement phones = driver.findElement(By.xpath("//div[@class='list-group']/a[contains(text(), 'Phones')]"));
//        WebElement phones = categories.findElement(By.xpath(".//a[contains(text(), 'Phones')]"));
        System.out.println(phones.getText());

        WebElement laptops = driver.findElement(By.xpath("//div[@class='list-group']/a[contains(text(), 'Laptops')]"));
        System.out.println(laptops.getText());

        WebElement monitors = driver.findElement(By.xpath("//div[@class='list-group']/a[contains(text(), 'Monitors')]"));
        System.out.println(monitors.getText());

//        List<WebElement> items = driver.findElements(By.xpath("//div[@class='card h-100']"));
        WebElement mainBody = driver.findElement(By.id("tbodyid"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement nextBtn = driver.findElement(By.id("next2"));
        WebElement previousBtn = driver.findElement(By.id("prev2"));
        nextBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement galaxyS6 = driver.findElement(By.xpath("//div[@id='tbodyid']//a[@href='prod.html?idp_=1']"));
        galaxyS6.click();
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }

}
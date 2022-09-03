package ru.gb.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AvitoExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.avito.ru/");
        WebElement agreeCity = webDriver.findElement(By.xpath("//button[@data-marker='location/tooltip-agree']"));
        agreeCity.click();
        WebElement inputSearch = webDriver.findElement(By.xpath("//input [@placeholder='Поиск по объявлениям']"));
       // inputSearch.click();
        inputSearch.sendKeys("Котята");
        //не вводится в инпут текст поиска
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        webDriver.findElement(By.xpath("//input[@type='text' and @value]")).click();

        Thread.sleep(5000);
        //webDriver.quit();

    }
}

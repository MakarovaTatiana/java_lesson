package ru.gb.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AvitoExamples2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.avito.ru/");
        WebElement agreeCity = webDriver.findElement(By.xpath("//*[@data-marker='navigation/link' and text()='Работа']"));
        agreeCity.click();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement inputSearch = webDriver.findElement(By.xpath("//input[@placeholder='Должность']"));
        //inputSearch.click();
        inputSearch.sendKeys("Тести");
        //хотела чтобы был выбран саджест который выпадет в единственном варианте, но не получается выбрать. не пойму почему
        webDriver.findElement(By.xpath("//ul[contains(@class,'styles-dropdown')]"));
        inputSearch.click();

        Thread.sleep(5000);
        //webDriver.quit();

    }
}

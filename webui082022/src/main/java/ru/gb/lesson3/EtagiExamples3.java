package ru.gb.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EtagiExamples3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.etagi.com/");
        WebElement entrance = webDriver.findElement(By.xpath("//*[text()='Войти']"));
        entrance.click();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(6));
        WebElement entranceGosuslugi = webDriver.findElement(By.xpath("//span[text()='Войти через Госуслуги']"));
        //xpath проверен вручную, он найходится на странице, но появляется exception на его счет
        entranceGosuslugi.click();
        Thread.sleep(5000);
        //webDriver.quit();

    }
}

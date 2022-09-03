package ru.gb.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumStart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://edo.72to.ru/programs/?localityGUID=9ae64229-9f7b-4149-b27a-d1f6ec74b5ce&age=5&kind=1&page=3");
        Thread.sleep(5000);
        driver.quit();

        WebDriverManager.firefoxdriver().setup();
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.avito.ru/");
        Thread.sleep(5000);
        firefoxDriver.quit();
    }
}

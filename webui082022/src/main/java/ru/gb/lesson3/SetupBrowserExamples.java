package ru.gb.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupBrowserExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("user-agent=Googlebot/2.1 (+http://www.google.com/bot.html)");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://edo.72to.ru/programs/?localityGUID=9ae64229-9f7b-4149-b27a-d1f6ec74b5ce&age=5&kind=1&page=3");
        Thread.sleep(5000);
        driver.quit();

    }
}

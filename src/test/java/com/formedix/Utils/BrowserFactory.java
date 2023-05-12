package com.formedix.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class BrowserFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    static String rm;

    private static void openChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");

        driver.set(new ChromeDriver(co));

    }

    private static void openEdge() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--remote-allow-origins=*");

        driver.set(new EdgeDriver(eo));

    }

    private static void openFireFox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions fi = new FirefoxOptions();
        fi.addArguments("--remote-allow-origins=*");

        driver.set(new FirefoxDriver(fi));

    }


    public static WebDriver getBrowser() {
        return driver.get();
    }

    public static WebDriver getBrowser(String browserName) {

        switch (browserName.toLowerCase().intern()) {
            case "chrome":
                openChrome();
                break;
            case "edge":
                openEdge();
                break;
            case "firefox":
                break;

        }
        return driver.get();
    }


    public static void launchApplication(String url) {
        driver.get().get(url);
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get().manage().window().maximize();
    }

    public static void closeCurrentWindow() {
        driver.get().close();
    }

    public static void closeAllWindow() {
        driver.get().quit();
    }


}

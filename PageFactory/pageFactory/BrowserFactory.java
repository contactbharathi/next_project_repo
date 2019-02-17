package com.mavenit.selenium1.pageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class BrowserFactory {

    public static WebDriver openBrowser(WebDriver driver,String browsername, String url) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        Thread.sleep(2000);
        driver  = new FirefoxDriver();
       // BrowserFactory browserfactoryObj =  PageFactory.initElements(driver,BrowserFactory.class);
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
    public static void quitBrowser(WebDriver driver)
    {
        driver.quit();
    }


}

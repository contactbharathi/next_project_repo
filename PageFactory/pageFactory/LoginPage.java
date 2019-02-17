package com.mavenit.selenium1.pageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

     WebDriver driver;

     public LoginPage(WebDriver ldriver)
     {
         this.driver = ldriver;
     }

    @FindBy(how = How.XPATH,using = "//a[@data-link-id='DataLinkId']")
    WebElement my_account;
    @FindBy(how = How.ID,using = "EmailOrAccountNumber")
    WebElement emailId;
    @FindBy(how = How.ID,using = "Password")
    WebElement password;
    @FindBy(how = How.ID,using = "SignInNow")
    WebElement signin;


    public void loginArgosPage(String userName , String passWord) {


        my_account.click();
        emailId.sendKeys(userName);
        password.sendKeys(passWord);
        waitUntilClick(signin).click();

        //signin.click();
        //waitUntilClickable(signin).click();
    }

    public  WebElement waitUntilClick(WebElement element){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element1  =  (wait.until(ExpectedConditions.elementToBeClickable(element)));

        //waitUntilClickable(signin).click();
        return element1;

       // waitUntilClickable(driver.findElement(By.id("SignInNow"))).click();

    }
}

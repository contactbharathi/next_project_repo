//package com.mavenit.selenium1.pageFactory;
//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class SearchPage {
//
//    WebDriver driver;
//
//    public SearchPage(WebDriver ldriver)
//    {
//        this.driver = ldriver;
//    }
//
//    @FindBy(how = How.ID,using = "sli_search_1")
//    WebElement searchBox;
//    @FindBy(how = How.ID,using = "SearchButton")
//    WebElement magnify;
//
//
//    public void searchInArgosPage(String searchItem , String passWord) {
//
//        searchBox.sendKeys(searchItem);
//        magnify.click();
//    }
//
////    public  WebElement waitUntilClick(WebElement element){
////
////        WebDriverWait wait = new WebDriverWait(driver, 10);
////        WebElement element1  =  (wait.until(ExpectedConditions.elementToBeClickable(element)));
//
////        //waitUntilClickable(signin).click();
////        return element1;
////
////        // waitUntilClickable(driver.findElement(By.id("SignInNow"))).click();
////
////    }
//}

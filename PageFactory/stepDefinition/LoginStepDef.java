package com.mavenit.selenium1.stepDefinition;

import com.mavenit.selenium1.pageFactory.BrowserFactory;
import com.mavenit.selenium1.pageFactory.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginStepDef {

    WebDriver driver;

    @Given("^I open firefox and enter My account$")

    public void i_open_firefox_and_enter_My_account() throws Throwable {

        driver = BrowserFactory.openBrowser(driver, "Firefox", "https://www2.next.co.uk/");

    }

    @When("^I enter the valid  \"([^\"]*)\" and valid \"([^\"]*)\"$")

    public void i_enter_the_valid_username_and_valid_password(String username, String pwd) throws Throwable {

        LoginPage loginPageObj = PageFactory.initElements(driver, LoginPage.class);
        loginPageObj.loginArgosPage(username, pwd);
        // loginPageObj.waitUntilClick();
    }

    @Then("^I should  able to Login$")
    public void i_should_able_to_Login() throws Throwable {

        BrowserFactory.quitBrowser(driver);
    }
}



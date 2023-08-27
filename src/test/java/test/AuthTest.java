package test;

import com.codeborne.selenide.logevents.SelenideLogger;
import data.TestData;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import steps.AuthSteps;

import static com.codeborne.selenide.Configuration.*;

public class AuthTest {

    AuthSteps authSteps = new AuthSteps();

// TODO реализовать кросс-браузерное тестирование, добавив переменную browser в .xml
    @BeforeSuite
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        baseUrl = "file:///C:/Users/4eji4/Downloads/qa-test.html";
        browser = "firefox";
        holdBrowserOpen = false;
    }

//TODO изменить ассерты, передавать в тестовых данных простое, но не лучшее решение

    @Test(dataProvider = "invalidAuthData", dataProviderClass = TestData.class)
    public void case1 (String email, String password, String error){
        authSteps.invalidAuth(email, password, error);
    }

    @Test(dataProvider = "validAuthData", dataProviderClass = TestData.class)
    public void case2 (String email, String password){
        authSteps.validAuth(email, password);
    }

}

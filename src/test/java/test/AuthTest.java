package test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.Test;
import steps.AuthSteps;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class AuthTest {

    public static String email = "test@protei.ru";
    public static String password = "test";


    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        baseUrl = "file:///C:/Users/4eji4/Downloads/qa-test.html";
        browser = "firefox";
        holdBrowserOpen = true;


    }

    @Test
    public void debug() {
        AuthSteps authSteps = new AuthSteps();

        setUp();
        step("Открыть страницу", () -> open(baseUrl));
        step("email input", () -> authSteps.inputEmail(email));
        step("password input", () -> authSteps.inputPassword(password));
        step("submit",()->authSteps.loginButton());

    }


}

package test;

import com.codeborne.selenide.logevents.SelenideLogger;
import data.TestData;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import steps.FormSteps;

import static com.codeborne.selenide.Configuration.*;

public class FormTest {

    @BeforeSuite
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        baseUrl = "file:///C:/Users/4eji4/Downloads/qa-test.html";
        browser = "chrome";
        holdBrowserOpen = true;
    }

    FormSteps f = new FormSteps();

    @Test(dataProvider = "formErrorData", dataProviderClass = TestData.class)
    public void case3(String email, String name, String errorMassage) {
        AuthTest auth = new AuthTest();
        auth.case2("test@protei.ru", "test");
        f.invalidData(email, name, errorMassage);
    }

    @Test(dataProvider = "pairwiseData",dataProviderClass = TestData.class)
    public void case4(String email, String name, String gender, String option1, String option2) {
        AuthTest auth = new AuthTest();
        auth.case2("test@protei.ru", "test");
        f.pairwiseTest(email, name, gender, option1, option2);
        }
}

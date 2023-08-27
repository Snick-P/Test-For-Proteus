package steps;

import com.codeborne.selenide.Condition;
import page.AuthPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class AuthSteps {

    AuthPage authPage = new AuthPage();


    public void inputEmail(String email) {
        authPage.getEmailInput().val(email);
    }

    public void inputPassword(String password) {
        authPage.getPasswordInput().val(password);
    }

    public void pushLoginButton() {
        authPage.getAuthButton().click();
    }

    public String errorMassage() {
        return authPage.getErrorMassage().getText();
    }

    public boolean authPageIsHide(){
        return authPage.getAPage().is(Condition.hidden);
    }

    public void invalidAuth(String email, String password, String error) {

        step("Открыть базовую страницу", () -> open(baseUrl));
        step("email input", () -> inputEmail(email));
        step("password input", () -> inputPassword(password));
        step("submit", () -> pushLoginButton());
        step("assert", () -> assertThat(errorMassage().equals(error)));
    }

    public void validAuth(String email, String password) {
        AuthSteps authSteps = new AuthSteps();
        step("Открыть базовую страницу", () -> open(baseUrl));
        step("email input", () -> inputEmail(email));
        step("password input", () -> inputPassword(password));
        step("submit", () -> pushLoginButton());
        step("assert", () -> assertThat(authPageIsHide()));
    }

}

package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class AuthPage {

    SelenideElement aPage = $("#authPage"),
            emailInput = $x("//input[@id='loginEmail']"),
            passwordInput = $x("//input[@id='loginPassword']"),
            authButton = $x("//button[@id='authButton']"),
            errorMassage = $x("//div[@class='uk-alert uk-alert-danger']"),
            closeAlertButton = $x("//a[@class='uk-alert-close uk-close']");
}

package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class AuthPage {

    SelenideElement emailInput = $x("//input[@id='loginEmail']"),
            passwordInput = $x("//input[@id='loginPassword']"),
            authButton = $x("//button[@id='authButton']"),
            emailFormatErrorMessage = $x("//div[@id='emailFormatError']"),
            invalidEmailPassword = $x("//div[@id='invalidEmailPassword']"),
            closeAlertButton = $x("//a[@class='uk-alert-close uk-close']");
}

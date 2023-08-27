package steps;

import page.AuthPage;

public class AuthSteps {

    AuthPage authPage = new AuthPage();

//    мб переделать в лямбды

    public void inputEmail(String email) {
        authPage.getEmailInput().val(email);
    }

    public void inputPassword(String password) {
        authPage.getPasswordInput().val(password);
    }

    public void loginButton() {
        authPage.getAuthButton().click();
    }

}

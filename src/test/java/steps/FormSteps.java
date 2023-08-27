package steps;

import page.FormPage;

import java.util.ArrayList;
import java.util.List;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class FormSteps {

    FormPage formPage = new FormPage();

    public void emailDataInput(String emailData) {
        formPage.getEmail().val(emailData);
    }

    public void nameInput(String name) {
        formPage.getName().val(name);
    }

    public void genderInput(String gender) {
        formPage.getGender().selectOption(gender);
    }


    public void selectOpt1(String opt1) {
        if (opt1.equals("1.1")) {
            formPage.getOptions11().click();
        } else if (opt1.equals("1.1, 1.2")) {
            formPage.getOptions11().click();
            formPage.getOptions12().click();
        } else formPage.getOptions12().click();
    }

//TODO очень не нравится мне такая реализация, но в 01:56 ничего лучше в голову не пришло. Позже заменю на selectRadio

    public void selectOpt2(String opt2) {
        if (opt2.equals("2.1")) {
            formPage.getOptions21().click();
        } else if (opt2.equals("2.2")) {
            formPage.getOptions22().click();
        } else
            formPage.getOptions23().click();
    }

    public void pushAddButton() {
        formPage.getAddButton().click();
    }

    public List<String> result() {
        List<String> res = new ArrayList<>();
        formPage.getResult().forEach(x -> res.add(x.getText()));
        return res;
    }

    public String errorMassage() {
        return formPage.getErrorMassage().getText();
    }

    public void invalidData(String email, String name, String error) {
        step("email input", () -> emailDataInput(email));
        step("name input", () -> nameInput(name));
        step("submit", () -> pushAddButton());
        step("assert", () -> assertThat(errorMassage().equals(error)));
    }

    public void pairwiseTest(String email, String name, String gender, String option1, String option2) {
        step("email input", () -> emailDataInput(email));
        step("name input", () -> nameInput(name));
        step("choose gender", () -> genderInput(gender));
        step("select option 1", () -> selectOpt1(option1));
        step("select option 2", () -> selectOpt2(option2));
        step("submit", () -> pushAddButton());
        List<String> expect = List.of(email, name, gender, option1, option2);
        step("assert", () -> assertThat(expect.containsAll(result())));
    }


}

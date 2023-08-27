package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class FormPage {
//TODO добавить элементы для проверки наименования полей

    SelenideElement email = $x("//input[@id='dataEmail']"),
            name = $x("//input[@id='dataName']"),
            gender = $x("//select[@id='dataGender']"),

    options11 = $x("//input[@id='dataCheck11']"),
            options12 = $x("//input[@id='dataCheck12']"),

    options21 = $x("//input[@id='dataSelect21']"),
            options22 = $x("//input[@id='dataSelect22']"),
            options23 = $x("//input[@id='dataSelect23']"),

    errorMassage = $x("//div[@class='uk-alert uk-alert-danger']"),
            successMassage = $x("//div[@class='uk-margin uk-modal-content']"),

    okButton = $x("//button[@class='uk-button uk-button-primary uk-modal-close']"),
            addButton = $x("//button[@id='dataSend']");

    ElementsCollection result = $$x("//tbody/tr/td");

}

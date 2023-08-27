package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FormPage {
//TODO добавить элементы для наименования полей

SelenideElement email =$x("//input[@id='dataEmail']"),
                name = $x("//input[@id='dataName']"),
                gender = $x("//select[@id='dataGender']"),


                options11 = $x("//input[@id='dataCheck11']"),
                options12 = $x("//input[@id='dataCheck12']"),


                options21 = $x("//input[@id='dataSelect21']"),
                options22 = $x("//input[@id='dataSelect22']"),
                options23 = $x("//input[@id='dataSelect23']");


}

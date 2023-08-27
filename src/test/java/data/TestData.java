package data;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider
    public Object[][] invalidAuthData() {
        return new Object[][]{
//              {"test@protei.ru", "test", ""},
                {"protei", "test", "Неверный формат E-Mail"},
                {"test@protei.ru", "", "Неверный E-Mail или пароль"},
                {"", "test", "Неверный формат E-Mail"},
                {"protei@test.ru", "", "Неверный E-Mail или пароль"},
                {"", "protei", "Неверный формат E-Mail"},
                {"", "", "Неверный формат E-Mail"},
                {"protei@test.ru", "test", "Неверный E-Mail или пароль"},
                {"test@protei.ru", "protei", "Неверный E-Mail или пароль"},
                {"protei@test.ru", "protei", "Неверный E-Mail или пароль"}
        };

    }

    @DataProvider
    public Object[][] validAuthData() {
        return new Object[][]{
                {"test@protei.ru", "test"}
        };
    }

    @DataProvider
    public Object[][] formErrorData(){
        return new Object[][]{
                {"test", "name", "Неверный формат E-Mail"},
                {"","name", "Неверный формат E-Mail"},
                {"test@test.ru", "", "Поле имя не может быть пустым"}
        };
    }

    @DataProvider
    public Object[][] pairwiseData(){
        return new Object[][]{
                {"test@test.ru", "name", "Мужской", "1.1", "2.1"},
                {"test@test.ru", "name", "Мужской", "1.2", "2.2"},
                {"test@test.ru", "name", "Мужской", "1.1, 1.2", "2.3"},
                {"test@test.ru", "name", "Женский", "1.2", "2.3"},
                {"test@test.ru", "name", "Женский", "1.1, 1.2", "2.1"},
                {"test@test.ru", "name", "Женский", "1.1", "2.2"},
                {"test@test.ru", "name", "Мужской", "1.1, 1.2", "2.2"},
                {"test@test.ru", "name", "Мужской", "1.1", "2.3"},
                {"test@test.ru", "name", "Мужской", "1.2", "2.1"}
        };
    }
}

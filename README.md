# Test-For-Proteus
Данный проект является тестовым заданием для собеседования.

Для реализации проекта был выбран паттерн Page Object Model.

Реализуемые функционал проекта:

Проверка формы авторизации:
1. При вводе валидных данных для входа;
2. При вводе невалидного формата в поле email (в дальнейшем email);
3. При вводе валидного email и пустого поля пароль (в дальнейшем password) ;
4. При вводе пустого email и валидного password;
5. При вводе невалидного email и пустого password
6. При вводе пустого email и невалидного password;
7. При вводе пустого email и пустого password;
8. При вводе невалидного email и валидного password;
9. При вводе валидного email и невалидного password;
10. При вводе невалидного email и невалидного password

| Сценарий                                 | 1 | 2  | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
|------------------------------------------|---|----|---|---|---|---|---|---|---|----|
| email                                    | В | НФ | В | П | Н | П | П | Н | В | Н  |
| password                                 | В | В  | П | В | П | Н | П | В | Н | Н  |
| Успешный вход                            | + | -  | - | - | - | - | - | - | - | -  |
| Ошибка <br/>"Неверный формат E-Mail"     |   | +  |   | + |   | + | + |   |   |    |
| Ошибка <br/>"Неверный E-Mail или пароль" |   |    | + |   | + |   |   | + | + | +  |
* В - Валидные данные
* НФ - Невалидный формат
* П - Пустое поле
* Н - Невалидные данные
 

Проверка формы анкеты:
1. При вводе невалидного email
2. При пустом email
3. При пустом имени
4. Тест-кейс, собранный в соответствии с техникой попарного тестирования 

|   | Gender  | Option 1                      | Option 2    |
|---|---------|-------------------------------|-------------|
| 1 | Мужской | Вариант 1.1                   | Вариант 2.1 |
| 2 | Мужской | Вариант 1.2                   | Вариант 2.2 |
| 3 | Мужской | Вариант 1.1, <br/>Вариант 1.2 | Вариант 2.3 |
| 4 | Женский | Вариант 1.2                   | Вариант 2.3 |
| 5 | Женский | Вариант 1.1, <br/>Вариант 1.2 | Вариант 2.1 |
| 6 | Женский | Вариант 1.1                   | Вариант 2.2 |
| 7 | Мужской | Вариант 1.1, <br/>Вариант 1.2 | Вариант 2.2 |
| 8 | Мужской | Вариант 1.1                   | Вариант 2.3 |
| 9 | Мужской | Вариант 1.2                   | Вариант 2.1 |




Стек проекта:
1. Maven - сборщик проекта;
2. TestNG - тестовый движок;
3. Selenide - WebDriver;
4. Lombok - сокращение шаблонного кода;
5. AssertJ - реализация проверок;
6. Allure -  построения отчетов;
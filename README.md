# Mayflower exercise
## Task:
1.	Написать три автотеста с негативным ожидаемым результатом и проверить их. Автотесты должны содержать действия на стартовой форме.
2.	Автотесты должны быть написаны с использованием на Maven + Java + Cucumber + Selenium WebDriver.
3.	Результат выполнения - исходный код проекта в форме архива или ссылки на облачное хранилище/систему управления версиями. 

**Бизнес-требование к стартовой форме**:
1.	При изменении положения слайдера должны соответствующим образом изменяться сумма и срок кредита, а также кредитные показатели под слайдерами (поле Total Repayment под слайдерами должно расти при увеличении суммы или срока). 
2.	При выборе суммы от 8000 может появиться пометка This amount is available to repeat borrowers only. Данные значения или выше выбирать для тестирования не нужно. 
3.	Все поля на форме обязательны для заполнения.
4.	В полях Full Name, Middle Initial и Last Name допустимы только пробелы и латинские символы. Минимум на каждое поле должно приходиться по одному символу. Максимум тестировать не нужно.
5.	В поле Mobile содержится маска мобильного телефона. Телефон должен начинаться с 09-. Допустимы только цифровые символы.
6.	При правильном заполнении и отправки формы пользователь переходит в раздел Personal Information.
## Pre-conditions:
1. You must have the docker
2. Run the docker
## Steps:
1. **Clone this repository**: git clone https://github.com/John-Golt1/Mayflower_test_exercise.git
2. **If you haven't selenoid** in your computer, **run the command**: docker pull selenoid/chrome:latest 
3. **In directory Mayflower_test_exercise** run the command: **docker-compose-up**

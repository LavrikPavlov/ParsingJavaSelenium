## ParsingJavaSelenium
### Информация о проекте
Программа разработана в __IntelliJ__ и работает только в данной IDE.<br>

Версии
-  Java Oracle JDK 17
-  IntelliJ IDEA Community Edition 2023.1.4
-  Все остальные библиотеке в [pom.xml](https://github.com/LavrikPavlov/ParsingJavaSelenium/blob/master/pom.xml)


### Библиотеки

Используються такие библиотеки как:

-  Selenium
-  Jsoup

### Принцип работы

Идет по страницам и парсит инфу с нее. Берет инфу:

- Бред
- Наименование товара
- Цена
- Цена со скидкой

### Пример вывода
The background color is `#ffffff` for light mode and `#000000` for dark mode.
```
    Страница: 2
    Наименование: Спрей для волос
    Бренд: Ollin
    Старая цена: 779 руб.
    Новая цена: 545 ₽ руб.
```

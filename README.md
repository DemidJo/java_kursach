# java_kursach 
<p align="center">
      <img src="https://www.logomaker.com/api/main/images/1j+ojVVCOMkX9Wyrexe4hGf026LZ8lEaxlrbizxmfGwQoQJlkiYljvtu8fUtb0NZoBRejhUJdcU1gSF4WYAD3UQ6oXbQZs4AVn8=" width="30%">
</p>

## Описание

MedInvent - это веб-сервис, использующийся для инвентаризации медицинских предметов.
## Использованные технологии

Java, Maven, Spring Framework, MySQL

## Декомпозиция проекта
1. Личный кабинет
   * Страница главврача
   * Страница врача
   * Страница администратора
2. Системные роли
   * Сохранение ролей в базе данных
   * Возможность изменения роли, удаление роли пользователя администратором
3. Хранение данных об инвентаризованных предметах 
   * Хранение в базе данных названия, автор, описания, колличество, статус, дата, проверяющий
   * Хранение в базе данных пользователей id, имя, пароль
   * Хранение в базе данных роли id, имя 
   * Хранение в базе данных пользователь/роль user_id, roles_id
   
## Запуск
Создайте нового пользователя и пустую БД:
```
'CREATE DATABASE IF NOT EXISTS applection;'
"CREATE USER 'medivent'@'localhost' IDENTIFIED BY 'Cegth';"
"GRANT ALL ON medivent.* TO 'medivent'@'localhost';"
```
```
mvn compile
mvn spring-boot:run
```
Запуск приложение осуществляется в приложение IntelliJ IDEA Ultra
 1) Выбрать проект 
 2) Осуществляем запуск приложения 
 3) В браузере пишем localhost:8080

 ## Скриншоты


<table>
    <tr>
        <td>
              <div align="center"><img src= "https://user-images.githubusercontent.com/122823330/212753739-bd52cbc3-28d9-4454-bb9f-4e24f2c1e3ec.png" width="40%"></div>
        </td>
          </tr>
      <tr>
        <td>
            <div align="center"><img src="https://user-images.githubusercontent.com/122823330/212753922-20f60a15-b5bd-4e77-8ab1-b92d45e78a45.png" width="40%"></div>
        </td>
      </tr>
      <tr>
          <td>
            <div align="center"><img src="https://user-images.githubusercontent.com/122823330/212754142-0d2746d7-7ed6-419b-800b-999076ded60e.png" width="40%"></div>
        </td>
    </tr>
  <tr>
          <td>
            <div align="center"><img src="https://user-images.githubusercontent.com/122823330/212754733-3c2f1de4-ca66-4dfa-8011-7f156f97662c.png" width="40%"></div>
        </td>
    </tr>
<tr>
          <td>
            <div align="center"><img src="https://user-images.githubusercontent.com/122823330/212754875-ac7e6962-bf28-4c6e-a21b-7d4ea47679de.png" width="40%"></div>
        </td>
    </tr>
<tr>
          <td>
            <div align="center"><img src="https://user-images.githubusercontent.com/122823330/212755006-ed7c5789-1329-46d8-af6c-05ff5f2d89c6.png" width="40%"></div>
        </td>
    </tr>
 
 
</table>

  * Ссылка на вики https://github.com/DemidJo/java_kursach/wiki/MedInvent

## Автор
Студент группы ИКПИ-01 Нефёдов Демид Ильич

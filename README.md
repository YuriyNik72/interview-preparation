Урок № 1

1. Создать builder для класса Person со следующими полями: String firstName, String lastName, String middleName, String country, String address, String phone, int age, String gender.
2. Описать ошибки в коде (см. задание в методичке) и предложить варианты оптимизации.
3. Написать пример кода, который реализует принцип полиморфизма, на примере фигур — круг, квадрат, треугольник.

Урок № 2
1. Реализовать основные методы связанного списка.
2. Реализовать основные методы ArrayList.

Урок № 3
1. Реализовать программу, в которой два потока поочередно пишут ping и pong.
2. Реализовать потокобезопасный счетчик с помощью интерфейса Lock.

Урок № 4

Задача про кинотеатр.
У фильма, который идет в кинотеатре, есть название, длительность (пусть будет 60, 90 или 120 минут), цена билета (в разное время и дни может быть разной), время начала сеанса (один фильм может быть показан несколько раз в разное время и с разной ценой билета). Есть информация о купленных билетах (номер билета, на какой сеанс).
Задания:
Составить грамотную нормализованную схему хранения этих данных в БД. Внести в нее 4–5 фильмов, расписание на один день и несколько проданных билетов.
Сделать запросы, считающие и выводящие в понятном виде:

-ошибки в расписании (фильмы накладываются друг на друга), отсортированные по возрастанию времени. Выводить надо колонки «фильм 1», «время начала», «длительность», «фильм 2», «время начала», «длительность»;

-перерывы 30 минут и более между фильмами — выводить по уменьшению длительности перерыва. Колонки «фильм 1», «время начала», «длительность», «время начала второго фильма», «длительность перерыва»;

Урок № 5

1. Создать базу данных Student с полями id, name, mark.
2. Создать сущность Student и добавить в нее аннотации. Поле id должно заполняться автоматически.
3. Создать конфигурационный файл hibernate.cfg.xml, в котором указать свойства для подключения к БД и список классов с аннотациями Entity.
4. Создать класс со статическим методом, который возвращает объект SessionFactory.
5. Создать DAO-слой с операциями добавления, удаления, изменения сущности, выборки записи по ID и всех записей.
6. Добавить 1000 записей в таблицу Student.
7. Проверить работоспособность приложения, выполнить методы по удалению, изменению, добавлению записей, а также выборки одной и всех записей.

Урок № 6

1. Установить и настройте Apache Tomcat.
2. Написать сервлет, который выводит надпись Hello World.
3. Сконфигурировать его так, чтобы при обращении localhost:8080/hello в окне браузера появлялась надпись HelloWorld.

Урок № 7

1. Создать сущность Student с полями id, name, age.
2. Сконфигурировать Spring JPA контекст.
3. Создать репозиторий для вставки, удаления, изменения и просмотра студентов.
4. Создать контроллер с методами, которые вызывают методы репозитория.
5. Создать JSP-страницу, на которой в таблице отобразить список студентов с кнопками для добавления, обновления и удаления записей.
6. Привязать к каждой кнопке действие, которое будет передаваться на контроллер.

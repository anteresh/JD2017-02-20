package by.it.psmishenko.jd03_2.crud;

interface CN {
    //Корректно держать настройки соединения вне кода (!)
    //Обычно это файлы конфигурации сервера или фреймворка
    //конфигурация в этом случае - обычно bean с инициализацией из XML
    //ТАК ЧТО ЭТО ЛИШЬ ПРИМЕР!

    String URL_DB = "jdbc:mysql://127.0.0.1:2016/it_academy"+
                                        "?useUnicode=true&characterEncoding=UTF-8";
    String USER_DB = "root";
    String PASSWORD_DB = "";
}

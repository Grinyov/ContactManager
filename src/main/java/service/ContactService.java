package service;

import domain.Contact;

import java.util.List;

/*
Пояснение к используемым бинам.
messageSource 	Бин для обеспечения интернациолизации приложения.
Ниже мы создадим файлы messages_en.properties и messages_ru.properties
с локализованными сообщениями на русском и английском.
propertyConfigurer 	Для загрузки файла с настройками БД jdbc.properties.
dataSource 	Датасорс, используется для подключения к БД. Мы предоставляем
класс jdbc-драйвера, имя пользователя, пароль, другие настройки.
sessionFactory 	Это бин конфигурации Хибернейта. В файле hibernate.cfg.xml
будут содержаться маппинги на классы сущностей.
transactionManager 	Бин настройки менеджера транзакций.
 Мы используем менеджер транзакций для управления транзакциями приложения.
 */

/**
 * Created by Grinyov Vitaliy on 07.09.15.
 *
 * интерфейс взаимодействия пользователя с системой
 */
public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}

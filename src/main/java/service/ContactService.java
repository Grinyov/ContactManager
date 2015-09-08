package service;

import domain.Contact;

import java.util.List;

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

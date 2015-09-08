package dao;

import domain.Contact;

import java.util.List;

/**
 * Created by Grinyov Vitaliy on 07.09.15.
 *
 *
 * Тнтерфейс для доступа к данным
 */
public interface ContactDAO {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}

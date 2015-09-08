package dao;

import domain.Contact;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Grinyov Vitaliy on 07.09.15.
 *
 * Аннотация @Repository показывает, что класс функционирует как репозиторий и
 * требует наличия прозрачной трансляции исключений. Преимуществом трансляции
 * исключений является то, что слой сервиса будет иметь дело с общей иерархией
 * исключений от Спринга (DataAccessException) вне зависимости от используемых
 * технологий доступа к данным в DAO слое.
 */

@Repository
public class ContactDAOImpl implements ContactDAO {

    @Autowired  // Аннотация позволяет автоматически установить значение поля SessionFactory.
    private SessionFactory sessionFactory;

    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    public List<Contact> listContact() {

        return sessionFactory.getCurrentSession().createQuery("from Contact")
                .list();
    }

    public void removeContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(
                Contact.class, id);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }

    }
}

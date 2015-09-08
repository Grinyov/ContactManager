package service;

import dao.ContactDAO;
import domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Grinyov Vitaliy on 07.09.15.
 */

@Service  // используем данную аннотацию, чтобы объявить, что этот класс представляет сервис –
          // компонент сервис-слоя. Сервис является подтипом класса @Component.
          // Использование данной аннотации позволит искать бины-сервисы автоматически
          // (смотрите далее в root-context.xml).
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO contactDAO;

    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Transactional
    public List<Contact> listContact() {

        return contactDAO.listContact();
    }

    @Transactional
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }
}

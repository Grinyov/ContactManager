package domain;
/*
Доменный слой.
Именно здесь лежат POJO-классы, описывающие объекты-сущности системы.
В нашем случае это класс Contact.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Grinyov Vitaliy on 07.09.15.
 */

    @Entity                     // Класс представляет объект, который нужно долговременно хранить.
    @Table(name = "CONTACTS")   // Свойства класса будем хранить в таблице CONTACTS

    public class Contact {

        @Id                     // Это поле уникальное для объектов, то есть по нему будем искать объекты.
        @Column(name = "ID")
        @GeneratedValue         // Значение этого поля будет назначаться не нами, а генерироваться автоматически.
        private Integer id;

        @Column(name = "FIRSTNAME")  // Это свойство будет храниться в столбце firstname.
        private String firstname;

        @Column(name = "LASTNAME")
        private String lastname;

        @Column(name = "EMAIL")
        private String email;

        @Column(name = "TELEPHONE")
        private String telephone;

        // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

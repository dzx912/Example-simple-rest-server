package org.example.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Anton Lenok
 * @since 27.10.16.
 * Сущность, которая одновременно проецируется в JSON данные
 * и таблицу в БД
 */
@Entity
@Table(name = "users")
public class User {

    // Первичный ключ БД
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String phone;

    public User() {
    }

    public User(String name, String pame) {
        this.name = name;
        this.phone = pame;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

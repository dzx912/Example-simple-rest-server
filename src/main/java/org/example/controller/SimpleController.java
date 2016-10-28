package org.example.controller;

import org.example.data.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Anton Lenok
 * @since 28.10.16.
 * Контроллер в архитектуре MVC
 * Необходим для создания REST методов (GET, POST и т.д.) в сервере
 */
@Controller
public class SimpleController {

    // Подключаем репозиторий для работы с БД
    @Autowired
    private UserRepository userRepository;

    // Просейший GET метод
    // Доступ по адресу:
    // http://localhost:8080/
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    // Метод, который конвертирует Java класс в JSON данные
    // http://localhost:8080/user
    @RequestMapping("/user")
    @ResponseBody
    User user() {
        return new User("Anton", "12345678");
    }

    // Метод, который получает JSON данные и сохраняет их в БД
    // http://localhost:8080/custom-user
    @RequestMapping("/custom-user")
    @ResponseBody
    User userFrom(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Метод, который обращается к БД и выводит все записи о пользователей
    // в JSON массиве
    @RequestMapping("/users-all")
    @ResponseBody
    List<User> userAll() {
        return userRepository.findAll();
    }
}

package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Anton Lenok
 * @since 27.10.16.
 * Главный класс приложения, который является точкой входа
 */

// Обозначем точку входа для сервера
@SpringBootApplication

// Указываем Spring Boot, чтобы он взял на себя всю черновую работу
@EnableAutoConfiguration
public class MainApp {

    public static void main(String[] args) {
        // Запускаем серер
        SpringApplication.run(MainApp.class, args);
    }
}

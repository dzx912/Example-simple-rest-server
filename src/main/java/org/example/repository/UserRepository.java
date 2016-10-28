package org.example.repository;

import org.example.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Anton Lenok
 * @since 27.10.16.
 * Repository необходим для внесения, изменения, чтения и удаления данных в БД
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

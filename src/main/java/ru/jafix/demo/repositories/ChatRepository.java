package ru.jafix.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.jafix.demo.entities.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
}

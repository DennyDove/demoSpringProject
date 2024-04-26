package ru.jafix.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.jafix.demo.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}

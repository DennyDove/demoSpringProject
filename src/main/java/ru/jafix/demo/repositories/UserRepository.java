package ru.jafix.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.jafix.demo.entities.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByAge(Integer age);

    @Query(value = "select u from User u where u.age = :age and SUBSTRING(u.name, 1, 1) = :liter")
    List<User> findByAgeAndNameFirstChar(@Param("age") Integer age, @Param("liter") String liter);

    @Query(value = "select * from users where age = ?1 and SUBSTRING(name, 1, 1) = ?2", nativeQuery = true)
    List<User> findByAgeAndNameFirstCharNative(Integer age, String liter);
}

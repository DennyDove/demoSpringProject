package ru.jafix.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "chats")
@Setter
@Getter
@NoArgsConstructor
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long id;
    protected Timestamp createTime;

    @ManyToMany(fetch = FetchType.EAGER)
    protected Set<User> users;
}

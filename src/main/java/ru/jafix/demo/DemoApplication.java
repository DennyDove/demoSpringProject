package ru.jafix.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.jafix.demo.entities.Chat;
import ru.jafix.demo.entities.Role;
import ru.jafix.demo.entities.User;
import ru.jafix.demo.repositories.ChatRepository;
import ru.jafix.demo.repositories.RoleRepository;
import ru.jafix.demo.repositories.UserRepository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository userRepository,
								  RoleRepository roleRepository,
								  ChatRepository chatRepository) {
		return args -> {
			log.info("COMMAND LINE STARTED");

			// Add some changes for brief test
			// This change has been performed from a remote repository
			/*List<User> users = userRepository.findAll();
			log.info(users.toString());

			Chat chat1 = new Chat();
			Chat chat2 = new Chat();
			chat1.setCreateTime(Timestamp.from(Instant.now()));
			chat2.setCreateTime(Timestamp.from(Instant.now()));

			chat1.setUsers(new HashSet<>());
			chat2.setUsers(new HashSet<>());

			chat1.getUsers().add(users.get(0));
			chat1.getUsers().add(users.get(1));
			chat1.getUsers().add(users.get(2));

			chat2.getUsers().add(users.get(1));
			chat2.getUsers().add(users.get(2));
			chat2.getUsers().add(users.get(3));

			chatRepository.save(chat1);
			chatRepository.save(chat2);*/

			List<Chat> chats = chatRepository.findAll();
			log.info(chats.toString());
 		};
	}
}

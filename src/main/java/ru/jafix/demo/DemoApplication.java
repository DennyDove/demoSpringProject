package ru.jafix.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.jafix.demo.entities.User;
import ru.jafix.demo.repositories.UserRepository;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository userRepository) {
		return args -> {
			log.info("COMMAND LINE STARTED");

			User user1 = new User("Jakob Kluev", 24);
//			User user2 = new User("Andrew", 16);
//			User user3 = new User("Maria", 18);
//			User user4 = new User("Elena", 30);
//			List<User> usersList = List.of(user2, user3, user4);

			//userRepository.save(user1);
			//List<User> users = userRepository.findAll();
			//log.info(users.toString());

			//userRepository.saveAll(usersList);
			//users = userRepository.findAll();
			//log.info(users.toString());

			user1.setId(52L);

			userRepository.deleteById(54L);

        };
	}
}

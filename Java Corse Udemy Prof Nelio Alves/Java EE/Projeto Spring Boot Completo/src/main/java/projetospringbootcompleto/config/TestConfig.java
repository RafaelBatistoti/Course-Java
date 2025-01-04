package projetospringbootcompleto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import projetospringbootcompleto.entities.User;
import projetospringbootcompleto.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String...args) throws Exception {
		
		User user_1 = new User(null,"Mariano", "mariano@gmail.com", "(41)99699-0348", "Brasil");
		User user_2 = new User(null,"Macareno", "macareno@gmail.com", "(41)99856-1204", "Motorola");
		
		userRepository.saveAll(Arrays.asList(user_1,user_2));
		
	}

}

package projetospringbootcompleto.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import projetospringbootcompleto.entities.Order;
import projetospringbootcompleto.entities.User;
import projetospringbootcompleto.repositories.OrderRepository;
import projetospringbootcompleto.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User user_1 = new User(null, "Mariano", "mariano@gmail.com", "(41)99699-0348", "Brasil");
		User user_2 = new User(null, "Macareno", "macareno@gmail.com", "(41)99856-1204", "Motorola");

		Order order_1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user_1);
		Order order_2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user_2);
		Order order_3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user_1);

		userRepository.saveAll(Arrays.asList(user_1, user_2));
		orderRepository.saveAll(Arrays.asList(order_1, order_2, order_3));

	}

}

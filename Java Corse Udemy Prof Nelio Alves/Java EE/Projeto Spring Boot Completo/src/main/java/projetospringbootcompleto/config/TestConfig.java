package projetospringbootcompleto.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import projetospringbootcompleto.entities.Category;
import projetospringbootcompleto.entities.Order;
import projetospringbootcompleto.entities.OrderItem;
import projetospringbootcompleto.entities.Product;
import projetospringbootcompleto.entities.User;
import projetospringbootcompleto.enums.OrderStatus;
import projetospringbootcompleto.repositories.CategoryRepository;
import projetospringbootcompleto.repositories.OrderItemRepository;
import projetospringbootcompleto.repositories.OrderRepository;
import projetospringbootcompleto.repositories.ProductRepository;
import projetospringbootcompleto.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public void run(String... args) throws Exception {

		Category category_1 = new Category(null, "Electronics");
		Category category_2 = new Category(null, "Books");
		Category category_3 = new Category(null, "Computers");

		Product product_1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product product_2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product product_3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product product_4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product product_5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

		categoryRepository.saveAll(Arrays.asList(category_1, category_2, category_3));
		productRepository.saveAll(Arrays.asList(product_1, product_2, product_3, product_4, product_5));

		product_1.getCategories().add(category_2);
		product_2.getCategories().add(category_1);
		product_2.getCategories().add(category_3);
		product_3.getCategories().add(category_3);
		product_4.getCategories().add(category_3);
		product_5.getCategories().add(category_2);

		productRepository.saveAll(Arrays.asList(product_1, product_2, product_3, product_4, product_5));

		User user_1 = new User(null, "Mariano", "mariano@gmail.com", "(41)99699-0348", "Brasil");
		User user_2 = new User(null, "Macareno", "macareno@gmail.com", "(41)99856-1204", "Motorola");

		Order order_1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user_1);
		Order order_2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user_2);
		Order order_3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, user_1);

		userRepository.saveAll(Arrays.asList(user_1, user_2));
		orderRepository.saveAll(Arrays.asList(order_1, order_2, order_3));
		
		OrderItem orderItem_1 = new OrderItem(order_1, product_1, 2, product_1.getPrice());
		OrderItem orderItem_2 = new OrderItem(order_1, product_3, 1, product_3.getPrice());
		OrderItem orderItem_3 = new OrderItem(order_2, product_3, 2, product_3.getPrice());
		OrderItem orderItem_4 = new OrderItem(order_3, product_5, 2, product_5.getPrice());
		
		orderItemRepository.saveAll(Arrays.asList(orderItem_1, orderItem_2, orderItem_3, orderItem_4));
	}

}

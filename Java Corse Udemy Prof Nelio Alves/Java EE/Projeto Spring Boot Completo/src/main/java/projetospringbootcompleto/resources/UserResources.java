package projetospringbootcompleto.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetospringbootcompleto.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L,"Rafael", "rafael@gmail.com", "(41)99699-0348", "Nokia");
		return ResponseEntity.ok().body(user);
	}

}

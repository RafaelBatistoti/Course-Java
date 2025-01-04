package projetospringbootcompleto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetospringbootcompleto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

package projetospringbootcompleto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetospringbootcompleto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}

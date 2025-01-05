package projetospringbootcompleto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetospringbootcompleto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}

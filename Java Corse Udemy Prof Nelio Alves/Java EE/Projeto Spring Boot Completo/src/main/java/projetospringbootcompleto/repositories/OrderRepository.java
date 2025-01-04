package projetospringbootcompleto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetospringbootcompleto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}

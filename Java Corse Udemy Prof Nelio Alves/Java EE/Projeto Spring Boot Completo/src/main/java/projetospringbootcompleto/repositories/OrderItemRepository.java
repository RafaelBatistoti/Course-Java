package projetospringbootcompleto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetospringbootcompleto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}

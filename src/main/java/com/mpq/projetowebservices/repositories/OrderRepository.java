package com.mpq.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpq.projetowebservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

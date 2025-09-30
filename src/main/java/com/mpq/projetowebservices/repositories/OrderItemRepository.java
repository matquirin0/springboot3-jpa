package com.mpq.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpq.projetowebservices.entities.OrderItem;
import com.mpq.projetowebservices.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

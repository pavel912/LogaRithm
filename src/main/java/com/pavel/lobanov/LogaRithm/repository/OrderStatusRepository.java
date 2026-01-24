package com.pavel.lobanov.LogaRithm.repository;

import com.pavel.lobanov.LogaRithm.domain.OrderStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends CrudRepository<OrderStatus, Long> {
}

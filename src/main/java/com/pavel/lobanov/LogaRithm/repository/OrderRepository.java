package com.pavel.lobanov.LogaRithm.repository;

import com.pavel.lobanov.LogaRithm.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}

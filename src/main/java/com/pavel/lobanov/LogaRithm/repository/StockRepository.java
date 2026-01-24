package com.pavel.lobanov.LogaRithm.repository;

import com.pavel.lobanov.LogaRithm.domain.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<Stock, Long> {
}

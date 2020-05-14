package com.codeflix.stock.dbservice.repository;

import com.codeflix.stock.dbservice.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuotesRepository extends JpaRepository<Quote, Integer> {
    List<Quote>findByUserName(String username);
}


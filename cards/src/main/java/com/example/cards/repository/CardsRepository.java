package com.example.cards.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cards.entity.Cards;

public interface CardsRepository extends JpaRepository<Cards,Long>{
    
}

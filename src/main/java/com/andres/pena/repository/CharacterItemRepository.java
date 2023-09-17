package com.andres.pena.repository;

import com.andres.pena.model.bd.CharacterItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterItemRepository extends JpaRepository<CharacterItem, Long> {
}


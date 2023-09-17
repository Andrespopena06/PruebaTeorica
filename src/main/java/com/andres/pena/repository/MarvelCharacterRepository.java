package com.andres.pena.repository;

import com.andres.pena.model.bd.MarvelCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarvelCharacterRepository extends JpaRepository<MarvelCharacter, Long> {
}

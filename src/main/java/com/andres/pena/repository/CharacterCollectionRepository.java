package com.andres.pena.repository;

import com.andres.pena.model.bd.CharacterCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterCollectionRepository extends JpaRepository<CharacterCollection, Long> {
}

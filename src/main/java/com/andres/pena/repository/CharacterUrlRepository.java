package com.andres.pena.repository;

import com.andres.pena.model.bd.CharacterUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterUrlRepository extends JpaRepository<CharacterUrl, Long> {
}

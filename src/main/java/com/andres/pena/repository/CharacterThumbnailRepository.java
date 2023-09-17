package com.andres.pena.repository;

import com.andres.pena.model.bd.CharacterThumbnail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterThumbnailRepository extends JpaRepository<CharacterThumbnail, Long> {
}

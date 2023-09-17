package com.andres.pena.service;

import com.andres.pena.model.bd.MarvelCharacter;
import java.util.List;
import java.util.Optional;

public interface MarvelCharacterService {
    List<MarvelCharacter> getAllCharacters();
    Optional<MarvelCharacter> getCharacterById(Long id);
    MarvelCharacter createCharacter(MarvelCharacter character);
    MarvelCharacter updateCharacter(Long id, MarvelCharacter updatedCharacter);
    void deleteCharacter(Long id);
	List<MarvelCharacter> saveCharacters(List<MarvelCharacter> characters);
}

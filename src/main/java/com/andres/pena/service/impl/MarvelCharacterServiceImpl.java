package com.andres.pena.service.impl;

import com.andres.pena.model.bd.MarvelCharacter;
import com.andres.pena.repository.MarvelCharacterRepository;
import com.andres.pena.service.MarvelCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarvelCharacterServiceImpl implements MarvelCharacterService {
    private final MarvelCharacterRepository characterRepository;

    @Autowired
    public MarvelCharacterServiceImpl(MarvelCharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public List<MarvelCharacter> getAllCharacters() {
        return characterRepository.findAll();
    }

    @Override
    public Optional<MarvelCharacter> getCharacterById(Long id) {
        return characterRepository.findById(id);
    }

    @Override
    public MarvelCharacter createCharacter(MarvelCharacter character) {
        return characterRepository.save(character);
    }

    @Override
    public MarvelCharacter updateCharacter(Long id, MarvelCharacter updatedCharacter) {
        if (characterRepository.existsById(id)) {
            updatedCharacter.setId(id);
            return characterRepository.save(updatedCharacter);
        }
        return null;
    }

    @Override
    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }
    
    @Override
    public List<MarvelCharacter> saveCharacters(List<MarvelCharacter> characters) {
        return characterRepository.saveAll(characters);
    }

}

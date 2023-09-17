package com.andres.pena.controller;

import com.andres.pena.model.bd.MarvelCharacter;
import com.andres.pena.service.MarvelCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/marvel/characters")
public class MarvelApiController {
    private final MarvelCharacterService characterService;

    @Autowired
    public MarvelApiController(MarvelCharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public ResponseEntity<List<MarvelCharacter>> getAllCharacters() {
        List<MarvelCharacter> characters = characterService.getAllCharacters();
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarvelCharacter> getCharacterById(@PathVariable Long id) {
        Optional<MarvelCharacter> character = characterService.getCharacterById(id);
        if (character.isPresent()) {
            return new ResponseEntity<>(character.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found
        }
    }

    @PostMapping
    public ResponseEntity<MarvelCharacter> createCharacter(@RequestBody MarvelCharacter character) {
        MarvelCharacter createdCharacter = characterService.createCharacter(character);
        return new ResponseEntity<>(createdCharacter, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MarvelCharacter> updateCharacter(@PathVariable Long id, @RequestBody MarvelCharacter updatedCharacter) {
        MarvelCharacter character = characterService.updateCharacter(id, updatedCharacter);
        if (character != null) {
            return new ResponseEntity<>(character, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

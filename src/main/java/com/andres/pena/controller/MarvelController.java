package com.andres.pena.controller;

import com.andres.pena.converters.MarvelApiResponseConverter;
import com.andres.pena.model.Responses.MarvelApiResponse;
import com.andres.pena.service.MarvelApiService;
import com.andres.pena.service.MarvelCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marvel")
public class MarvelController {
    private final MarvelApiService marvelApiService;
    private final MarvelCharacterService characterService;
    private final MarvelApiResponseConverter converter;

    @Autowired
    public MarvelController(MarvelApiService marvelApiService, MarvelCharacterService characterService, MarvelApiResponseConverter converter) {
        this.marvelApiService = marvelApiService;
        this.characterService = characterService;
        this.converter = converter;
    }

    @GetMapping("/fetchCharacters")
    public MarvelApiResponse fetchMarvelCharacters() {
        return marvelApiService.fetchMarvelCharacters();
    }

    @PostMapping("/fetchAndSaveCharacters")
    public String fetchAndSaveMarvelCharacters() {
        MarvelApiResponse response = marvelApiService.fetchMarvelCharacters();
        
        if (response != null) {
            characterService.saveCharacters(converter.convertToMarvelCharacters(response));
            return "Datos de personajes de Marvel guardados en la base de datos.";
        } else {
            return "No se pudieron obtener los datos de personajes de Marvel.";
        }
    }
}

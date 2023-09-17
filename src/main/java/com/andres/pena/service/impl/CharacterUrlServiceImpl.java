package com.andres.pena.service.impl;

import com.andres.pena.model.bd.CharacterUrl;
import com.andres.pena.repository.CharacterUrlRepository;
import com.andres.pena.service.CharacterUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterUrlServiceImpl implements CharacterUrlService {
    private final CharacterUrlRepository characterUrlRepository;

    @Autowired
    public CharacterUrlServiceImpl(CharacterUrlRepository characterUrlRepository) {
        this.characterUrlRepository = characterUrlRepository;
    }

    @Override
    public CharacterUrl createCharacterUrl(CharacterUrl characterUrl) {
        return characterUrlRepository.save(characterUrl);
    }
}

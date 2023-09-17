package com.andres.pena.converters;

import com.andres.pena.model.bd.MarvelCharacter;
import com.andres.pena.model.bd.CharacterUrl;
import com.andres.pena.model.bd.CharacterThumbnail;
import com.andres.pena.model.bd.CharacterCollection;
import com.andres.pena.model.bd.CharacterItem;
import com.andres.pena.model.Responses.MarvelApiResponse;
import com.andres.pena.model.Responses.MarvelCharacterResponse;
import com.andres.pena.model.Responses.MarvelItemResponse;
import com.andres.pena.model.Responses.MarvelUrlResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MarvelApiResponseConverter {

    public List<MarvelCharacter> convertToMarvelCharacters(MarvelApiResponse response) {
        List<MarvelCharacter> characters = new ArrayList<>();

        if (response != null && response.getData() != null && response.getData().getResults() != null) {
            for (MarvelCharacterResponse result : response.getData().getResults()) {
                MarvelCharacter character = new MarvelCharacter();
                character.setName(result.getName());
                character.setDescription(result.getDescription());
                character.setModified(result.getModified().toString());
                character.setResourceURI(result.getResourceURI());

                // Mapeo de URLs
                List<CharacterUrl> characterUrls = new ArrayList<>();
                for (MarvelUrlResponse urlResponse : result.getUrls()) {
                    CharacterUrl characterUrl = new CharacterUrl();
                    characterUrl.setType(urlResponse.getType());
                    characterUrl.setUrl(urlResponse.getUrl());
                    characterUrls.add(characterUrl);
                }
                character.setUrls(characterUrls);
                
                // Mapeo de Thumbnail
                CharacterThumbnail thumbnail = new CharacterThumbnail();
                thumbnail.setPath(result.getThumbnail().getPath());
                thumbnail.setExtension(result.getThumbnail().getExtension());
                character.setThumbnail(thumbnail);
                
             // Mapeo de Comics
                CharacterCollection comics = new CharacterCollection();
                comics.setAvailable(result.getComics().getAvailable());
                comics.setReturned(result.getComics().getReturned());
                comics.setCollectionURI(result.getComics().getCollectionURI());

                List<CharacterItem> comicsItems = new ArrayList<>();
                for (MarvelItemResponse itemResponse : result.getComics().getItems()) {
                	CharacterItem item = new CharacterItem();
                    item.setResourceURI(itemResponse.getResourceURI());
                    item.setName(itemResponse.getName());
                    comicsItems.add(item);
                }
                comics.setItems(comicsItems);
                character.setComics(comics);

                // Mapeo de Stories
                CharacterCollection stories = new CharacterCollection();
                stories.setAvailable(result.getStories().getAvailable());
                stories.setReturned(result.getStories().getReturned());
                stories.setCollectionURI(result.getStories().getCollectionURI());

                List<CharacterItem> storiesItems = new ArrayList<>();
                for (MarvelItemResponse itemResponse : result.getStories().getItems()) {
                	CharacterItem item = new CharacterItem();
                    item.setResourceURI(itemResponse.getResourceURI());
                    item.setName(itemResponse.getName());
                    storiesItems.add(item);
                }
                stories.setItems(storiesItems);
                character.setStories(stories);

                // Mapeo de Events
                CharacterCollection events = new CharacterCollection();
                events.setAvailable(result.getEvents().getAvailable());
                events.setReturned(result.getEvents().getReturned());
                events.setCollectionURI(result.getEvents().getCollectionURI());

                List<CharacterItem> eventsItems = new ArrayList<>();
                for (MarvelItemResponse itemResponse : result.getEvents().getItems()) {
                	CharacterItem item = new CharacterItem();
                    item.setResourceURI(itemResponse.getResourceURI());
                    item.setName(itemResponse.getName());
                    eventsItems.add(item);
                }
                events.setItems(eventsItems);
                character.setEvents(events);

                // Mapeo de Series
                CharacterCollection series = new CharacterCollection();
                series.setAvailable(result.getSeries().getAvailable());
                series.setReturned(result.getSeries().getReturned());
                series.setCollectionURI(result.getSeries().getCollectionURI());

                List<CharacterItem> seriesItems = new ArrayList<>();
                for (MarvelItemResponse itemResponse : result.getSeries().getItems()) {
                	CharacterItem item = new CharacterItem();
                    item.setResourceURI(itemResponse.getResourceURI());
                    item.setName(itemResponse.getName());
                    seriesItems.add(item);
                }
                series.setItems(seriesItems);
                character.setSeries(series);


                characters.add(character);
            }
        }

        return characters;
    }
}

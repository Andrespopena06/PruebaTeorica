package com.andres.pena.model.bd;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "marvel_characters")
public class MarvelCharacter {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    private String modified;
    
    @Column(nullable = false)
    private String resourceURI;
    
    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CharacterUrl> urls;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "thumbnail_id", referencedColumnName = "id")
    private CharacterThumbnail thumbnail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "comics_id", referencedColumnName = "id")
    private CharacterCollection comics;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stories_id", referencedColumnName = "id")
    private CharacterCollection stories;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "events_id", referencedColumnName = "id")
    private CharacterCollection events;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "series_id", referencedColumnName = "id")
    private CharacterCollection series;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public List<CharacterUrl> getUrls() {
		return urls;
	}

	public void setUrls(List<CharacterUrl> urls) {
		this.urls = urls;
	}

	public CharacterThumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(CharacterThumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

	public CharacterCollection getComics() {
		return comics;
	}

	public void setComics(CharacterCollection comics) {
		this.comics = comics;
	}

	public CharacterCollection getStories() {
		return stories;
	}

	public void setStories(CharacterCollection stories) {
		this.stories = stories;
	}

	public CharacterCollection getEvents() {
		return events;
	}

	public void setEvents(CharacterCollection events) {
		this.events = events;
	}

	public CharacterCollection getSeries() {
		return series;
	}

	public void setSeries(CharacterCollection series) {
		this.series = series;
	}

	public MarvelCharacter(Long id, String name, String description, String modified, String resourceURI,
			List<CharacterUrl> urls, CharacterThumbnail thumbnail, CharacterCollection comics,
			CharacterCollection stories, CharacterCollection events, CharacterCollection series) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.modified = modified;
		this.resourceURI = resourceURI;
		this.urls = urls;
		this.thumbnail = thumbnail;
		this.comics = comics;
		this.stories = stories;
		this.events = events;
		this.series = series;
	}

	public MarvelCharacter() {
		super();
	}
}

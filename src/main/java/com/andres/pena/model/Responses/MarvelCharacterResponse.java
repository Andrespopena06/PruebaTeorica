package com.andres.pena.model.Responses;

import java.util.Date;
import java.util.List;

public class MarvelCharacterResponse {
	private int id;
	
	private String name;
	
	private String description;
	
	private Date modified;
	
	private String resourceURI;
	
	private List<MarvelUrlResponse> urls;
	
	private MarvelThumbnailResponse thumbnail;
	
	private MarvelComicsResponse comics;
	
	private MarvelStoriesResponse stories;
	
	private MarvelEventsResponse events;
	
	private MarvelSeriesResponse series;
	
	public MarvelCharacterResponse() {
		super();
	}

	public MarvelCharacterResponse(int id, String name, String description, Date modified, String resourceURI,
			List<MarvelUrlResponse> urls, MarvelThumbnailResponse thumbnail, MarvelComicsResponse comics,
			MarvelStoriesResponse stories, MarvelEventsResponse events, MarvelSeriesResponse series) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public List<MarvelUrlResponse> getUrls() {
		return urls;
	}

	public void setUrls(List<MarvelUrlResponse> urls) {
		this.urls = urls;
	}

	public MarvelThumbnailResponse getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(MarvelThumbnailResponse thumbnail) {
		this.thumbnail = thumbnail;
	}

	public MarvelComicsResponse getComics() {
		return comics;
	}

	public void setComics(MarvelComicsResponse comics) {
		this.comics = comics;
	}

	public MarvelStoriesResponse getStories() {
		return stories;
	}

	public void setStories(MarvelStoriesResponse stories) {
		this.stories = stories;
	}

	public MarvelEventsResponse getEvents() {
		return events;
	}

	public void setEvents(MarvelEventsResponse events) {
		this.events = events;
	}

	public MarvelSeriesResponse getSeries() {
		return series;
	}

	public void setSeries(MarvelSeriesResponse series) {
		this.series = series;
	}
}

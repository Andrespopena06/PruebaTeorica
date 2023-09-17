package com.andres.pena.model.Responses;

import java.util.List;

public class MarvelEventsResponse {
	
	private int available;
	
    private int returned;
    
    private String collectionURI;
    
    private List<MarvelItemResponse> items;

	public MarvelEventsResponse() {
		super();
	}

	public MarvelEventsResponse(int available, int returned, String collectionURI, List<MarvelItemResponse> items) {
		super();
		this.available = available;
		this.returned = returned;
		this.collectionURI = collectionURI;
		this.items = items;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public int getReturned() {
		return returned;
	}

	public void setReturned(int returned) {
		this.returned = returned;
	}

	public String getCollectionURI() {
		return collectionURI;
	}

	public void setCollectionURI(String collectionURI) {
		this.collectionURI = collectionURI;
	}

	public List<MarvelItemResponse> getItems() {
		return items;
	}

	public void setItems(List<MarvelItemResponse> items) {
		this.items = items;
	}
}

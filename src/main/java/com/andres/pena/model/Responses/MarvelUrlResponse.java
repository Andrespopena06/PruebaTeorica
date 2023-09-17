package com.andres.pena.model.Responses;

public class MarvelUrlResponse {
	
	private String type;
	
    private String url;

	public MarvelUrlResponse() {
		super();
	}

	public MarvelUrlResponse(String type, String url) {
		super();
		this.type = type;
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

package com.andres.pena.model.Responses;

public class MarvelThumbnailResponse {
	
	private String path;
	
    private String extension;

	public MarvelThumbnailResponse() {
		super();
	}

	public MarvelThumbnailResponse(String path, String extension) {
		super();
		this.path = path;
		this.extension = extension;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
}

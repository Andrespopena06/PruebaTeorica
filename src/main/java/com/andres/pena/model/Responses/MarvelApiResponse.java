package com.andres.pena.model.Responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarvelApiResponse {
	
	private int code;
	
    private String status;
    
    private String copyright;
    
    private String attributionText;
    
    private String attributionHTML;
    
    private MarvelDataResponse data;
    
    private String etag;

	public MarvelApiResponse() {
		super();
	}

	public MarvelApiResponse(int code, String status, String copyright, String attributionText, String attributionHTML,
			MarvelDataResponse data, String etag) {
		super();
		this.code = code;
		this.status = status;
		this.copyright = copyright;
		this.attributionText = attributionText;
		this.attributionHTML = attributionHTML;
		this.data = data;
		this.etag = etag;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getAttributionText() {
		return attributionText;
	}

	public void setAttributionText(String attributionText) {
		this.attributionText = attributionText;
	}

	public String getAttributionHTML() {
		return attributionHTML;
	}

	public void setAttributionHTML(String attributionHTML) {
		this.attributionHTML = attributionHTML;
	}

	public MarvelDataResponse getData() {
		return data;
	}

	public void setData(MarvelDataResponse data) {
		this.data = data;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}
}

package com.andres.pena.model.Responses;

import java.util.List;

public class MarvelDataResponse {
	private int offset;
	
    private int limit;
    
    private int total;
    
    private int count;
    
    private List<MarvelCharacterResponse> results;

	public MarvelDataResponse() {
		super();
	}

	public MarvelDataResponse(int offset, int limit, int total, int count, List<MarvelCharacterResponse> results) {
		super();
		this.offset = offset;
		this.limit = limit;
		this.total = total;
		this.count = count;
		this.results = results;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<MarvelCharacterResponse> getResults() {
		return results;
	}

	public void setResults(List<MarvelCharacterResponse> results) {
		this.results = results;
	}
    
}

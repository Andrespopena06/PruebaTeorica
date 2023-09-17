package com.andres.pena.model.bd;

import javax.persistence.*;

@Entity
@Table(name = "character_urls")
public class CharacterUrl {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String type;

	@Column(nullable = false)
	private String url;

	@ManyToOne
	@JoinColumn(name = "character_id")
	private MarvelCharacter character;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public MarvelCharacter getCharacter() {
		return character;
	}

	public void setCharacter(MarvelCharacter character) {
		this.character = character;
	}

	public CharacterUrl(Long id, String type, String url, MarvelCharacter character) {
		super();
		this.id = id;
		this.type = type;
		this.url = url;
		this.character = character;
	}

	public CharacterUrl() {
		super();
	}
}

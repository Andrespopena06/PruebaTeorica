package com.andres.pena.model.bd;

import javax.persistence.*;

@Entity
@Table(name = "character_thumbnails")
public class CharacterThumbnail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String path;
    
    @Column(nullable = false)
    private String extension;

    @OneToOne(mappedBy = "thumbnail")
    private MarvelCharacter character;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public MarvelCharacter getCharacter() {
		return character;
	}

	public void setCharacter(MarvelCharacter character) {
		this.character = character;
	}

	public CharacterThumbnail(Long id, String path, String extension, MarvelCharacter character) {
		super();
		this.id = id;
		this.path = path;
		this.extension = extension;
		this.character = character;
	}

	public CharacterThumbnail() {
		super();
	}
}

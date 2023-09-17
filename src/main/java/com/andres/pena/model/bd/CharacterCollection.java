package com.andres.pena.model.bd;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "character_collections")
public class CharacterCollection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int available;
    private int returned;
    
    @Column(nullable = false)
    private String collectionURI;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CharacterItem> items;

    @OneToOne(mappedBy = "comics")
    private MarvelCharacter character;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<CharacterItem> getItems() {
		return items;
	}

	public void setItems(List<CharacterItem> items) {
		this.items = items;
	}

	public MarvelCharacter getCharacter() {
		return character;
	}

	public void setCharacter(MarvelCharacter character) {
		this.character = character;
	}

	public CharacterCollection(Long id, int available, int returned, String collectionURI, List<CharacterItem> items,
			MarvelCharacter character) {
		super();
		this.id = id;
		this.available = available;
		this.returned = returned;
		this.collectionURI = collectionURI;
		this.items = items;
		this.character = character;
	}

	public CharacterCollection() {
		super();
	}
}

package com.andres.pena.model.bd;

import javax.persistence.*;

@Entity
@Table(name = "character_items")
public class CharacterItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String resourceURI;
    
    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "collection_id")
    private CharacterCollection collection;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CharacterCollection getCollection() {
		return collection;
	}

	public void setCollection(CharacterCollection collection) {
		this.collection = collection;
	}

	public CharacterItem(Long id, String resourceURI, String name, CharacterCollection collection) {
		super();
		this.id = id;
		this.resourceURI = resourceURI;
		this.name = name;
		this.collection = collection;
	}

	public CharacterItem() {
		super();
	}
}

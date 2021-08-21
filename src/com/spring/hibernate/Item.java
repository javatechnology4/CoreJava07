package com.spring.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Item {
	private Long id;
	private String name;
	private String description;
	private Set<Category> categories = new HashSet<>();
	private Set<Bid> bids = new HashSet<>();

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	public void addCategory(Category category) {
		if(category==null)
			throw new IllegalArgumentException("Null Category");
		category.getItems().add(this);
		categories.add(category);
	}

	public Set<Bid> getBids() {
		return bids;
	}

	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

}

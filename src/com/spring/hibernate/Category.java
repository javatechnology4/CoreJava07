package com.spring.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Category {
	private Long id;
	private String name;
	private Category parentCategory;
	private Set<Category> childCategories=new HashSet<>();
	private Set<Item> items=new HashSet<>();
	
	public Category() {
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

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public Set<Category> getChildCategories() {
		return childCategories;
	}

	public void setChildCategories(Set<Category> childCategories) {
		this.childCategories = childCategories;
	}
	public void addChildCategory(Category childCategory) {
		if(childCategory==null)
			throw new IllegalArgumentException("Null child category!");
		if(childCategory.getParentCategory()!=null)
			childCategory.getParentCategory().getChildCategories().remove(childCategory);
		childCategory.setParentCategory(this);
		childCategories.add(childCategory);
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
	/*public static void main(String[] args) {
		Category aParent=new Category();
		Category aChild=new Category();
		aChild.setParentCategory(aParent);
		aParent.getChildCategories().add(aChild);
	}*/
	

}

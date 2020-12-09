package com.tts.TTSStore.model;

import javax.persistence.Id;

public class Product {

	//id that auto increments
	@Id
	private Long id;
	
	//int quantity
	private Integer quantity;
	
	//price
	private Integer price;
	
	//description
	private String description;
	
	//name
	private String name;
	
	//brand
	private String brand;
	
	//category
	private String category;
	
	//image(url)
	private String image;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	//creating getters and setters to hopefully solve issues in controllers
	
}

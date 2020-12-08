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
}

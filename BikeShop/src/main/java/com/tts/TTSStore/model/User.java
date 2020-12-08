package com.tts.TTSStore.model;

import java.util.Collection;
import java.util.HashMap;

import javax.persistence.ElementCollection;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import org.springframework.security.core.GrantedAuthority;

//Extend the UserDetails class from Spring Security.
public class User extends UserDetails{ //testing github
	//Auto-generated id
	@Id
	private Long id;
	
	//Strings for username and password (they can't be null)
	@NotEmpty(message = "Please provide your username")
	private String username;
	
	@NotEmpty(message = "Please enter your password")
	private String password;
	
	//A Map that uses Product and Integer pairs called "cart" that is implemented by a HashMap.
	//Use the `@ElementCollection` tag: It basically makes the map into a table with a Foreign Key to a Product and the quantity as a number without making a new model. (very similar to @OneToMany)
	@ElementCollection
	HashMap<String, Integer> cart = new HashMap<String, Integer>();

	// UserDetails requires these, they are technically getters (is-ers?) overridden by Lombok.
	// @Transient Makes it so these aren't persisted in the database, as they are hard coded.
	@Transient
	private boolean accountNonExpired = true;
	  
	@Transient
	private boolean accountNonLocked = true;
	  
	@Transient
	private boolean credentialsNonExpired = true;
	  
	@Transient
	private boolean enabled = true;
	  
	@Transient
	private Collection<GrantedAuthority> authorities = null;
}

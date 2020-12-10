package com.tts.TTSStore.model;

import java.util.Collection;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Extend the UserDetails class from Spring Security.

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements UserDetails{

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
	private Map<Product, Integer> cart;

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

	//creating getters and settters to try to resolve errors in other classes
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<Product, Integer> getCart() {
		return cart;
	}

	public void setCart(Map<Product, Integer> cart) {
		this.cart = cart;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
}

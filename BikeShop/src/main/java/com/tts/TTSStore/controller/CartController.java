package com.tts.TTSStore.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.TTSStore.model.Product;
import com.tts.TTSStore.model.User;
import com.tts.TTSStore.services.ProductService;
import com.tts.TTSStore.services.UserService;

@Controller
@ControllerAdvice
public class CartController {
  @Autowired
  ProductService productService;

  @Autowired
  UserService userService;

  @ModelAttribute("loggedInUser")
  public User loggedInUser() {
      return userService.getLoggedInUser();
  }

  @ModelAttribute("cart")
  public Map<Product, Integer> cart() {
      User user = loggedInUser();
      if(user == null) 
    	  return null;
      
      Map<Product, Integer> userCart = new HashMap<Product, Integer>(user.getCart());
      return userCart;
  }
  
  /**
   * Puts an empty list in the model that thymeleaf can use to sum up the cart total.
   */
  @ModelAttribute("list")
  public List<Double> list() {
      return new ArrayList<>();
  }

  @GetMapping("/cart")
  public String showCart() {
      return "cart";
  }

  @PostMapping("/cart")
  public String addToCart(@RequestParam long id) {
	  System.out.println(id);
	  Product p = productService.findById(id);
	  Map<Product, Integer> cart = cart();
	  System.out.println("Posting to cart" + cart);
	  setQuantity(p, cart.getOrDefault(p, 0) + 1);
	  return "redirect:/cart";
  }

  @PostMapping("/cart/update")
  public String updateQuantities(@RequestParam long[] id, @RequestParam int[] quantity) {
	  for (int i = 0; i < id.length; i++) {
			Product p = productService.findById(id[i]);
			setQuantity(p, quantity[i]);
		}
		return "redirect:/cart";
	}

  @PostMapping("/cart/delete")
  public String removeFromCart(@RequestParam long id) {
	  Product p = productService.findById(id);
	  setQuantity(p, 0);
	  return "redirect:/cart";
	}

  private void setQuantity(Product p, int quantity) {
      if(quantity > 0)
    	  cart().put(p, quantity);
      else
          cart().remove(p);

      userService.updateCart(cart());
    }
}
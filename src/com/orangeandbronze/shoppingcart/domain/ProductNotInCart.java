package com.orangeandbronze.shoppingcart.domain;

public class ProductNotInCart extends RuntimeException {
	public ProductNotInCart(String message) {
		super(message);
	}	
}
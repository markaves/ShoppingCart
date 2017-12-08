package com.orangeandbronze.shoppingcart.domain;

import java.util.*;

public class Cart {

	public int getCartId() {
		// TODO Implement this method.
	}

	/** Gets all the products in the cart with non-zero quantities. **/
	public Collection<Product> getProducts() {
		// TODO Implement this method.
	}

	/**
	 * Adds a product item to the cart. If the product is not yet in the card,
	 * this method adds the product with quantity 1. If the product is already
	 * in the cart, this method will increment the product quantity by 1.
	 */
	public void add(Product product) {
		// TODO Implement this method.
	}

	/**
	 * Adds product items to the cart. If the product is not yet in the card,
	 * this method adds the product with the quantity given. If the product is
	 * already in the cart, this method will increment the current product
	 * quantity by the quantity given. If the quantity given is negative, throws
	 * IllegalArguementException.
	 */
	public void add(Product product, int qty) {
		// TODO Implement this method.
	}

	/**
	 * Returns quantity of the product in the cart or zero if the product is not
	 * in the cart.
	 **/
	public int getQuantity(Product product) {
		// TODO Implement this method.
	}

	/**
	 * Removes product from the cart. Equivalent to setting quantity to zero.
	 **/
	public void delete(Product product) {
		// TODO Implement this method.
	}

	/**
	 * Sets the quantity of the product in the cart. 
	 * - If the product is already in the cart, the old quantity is discarded. 
	 * - If the quantity is zero, the product is deleted from the cart. 
	 * - If the product is not yet in the cart, the product is added with the quantity. 
	 * - If quantity is negative, throws IllegalArguementException.
	 */
	public void setQuantity(Product product, int qty) {
		// TODO Implement this method.
	}
}

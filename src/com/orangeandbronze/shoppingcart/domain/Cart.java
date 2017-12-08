	package com.orangeandbronze.shoppingcart.domain;

import java.util.*;




public class Cart {
	private final int cartID;
	private final Map<Product, Integer> product = new HashMap<>();
	
	
	
	public Cart(int cartID) {
		this.cartID=cartID;
		
	}

	public int getCartId() {
		// TODO Implement this method.
		return this.cartID;
	}

	/** Gets all the products in the cart with non-zero quantities. **/
	//public Collection<Product> getProducts() {
		// TODO Implement this method.
	//}

	/**
	 * Adds a product item to the cart. If the product is not yet in the card,
	 * this method adds the product with quantity 1. If the product is already
	 * in the cart, this method will increment the product quantity by 1.
	 */
	public void add(Product product) {
		// TODO Implement this method.
		if (this.product.get(product)!=null) {
			this.product.put(product, this.product.get(product)+1);
		}else {
			this.product.put(product, 1);
		}
	
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
		if (this.product.get(product)!=null) {
			this.product.put(product, this.product.get(product)+qty);
		}else {
			this.product.put(product, qty);
		}
	}

	/**
	 * Returns quantity of the product in the cart or zero if the product is not
	 * in the cart.
	 **/
	public int getQuantity(Product product) {
		// TODO Implement this method.
		int qty=0;
		if (this.product.get(product)==null) {
			qty=0;
		}else {
			qty=this.product.get(product);
		}
		
		
			return qty ;
		
	}

	/**
	 * Removes product from the cart. Equivalent to setting quantity to zero.
	 **/
	public void delete(Product product) {
		// TODO Implement this method.
		this.product.put(product, 0);
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
		this.product.put(product, qty);
	}
	
	@Override
	public String toString() {
	return "Cart# " + this.cartID +" " + Collections.singletonList(product);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cartID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (cartID != other.cartID)
			return false;
		return true;
	}

	
	
}

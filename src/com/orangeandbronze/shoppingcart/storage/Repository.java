package com.orangeandbronze.shoppingcart.storage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.orangeandbronze.shoppingcart.domain.Cart;
import com.orangeandbronze.shoppingcart.domain.Product;

/** Stores Cart data in files. **/
public class Repository {
    
	
	/**
	 * Saves the contents of the cart in a file named "Cart" plus the cart ID.
	 * For example, if the Cart ID is 4, the filename is "Cart4".
	 **/
	public void saveCart(Cart cart) {
   		// TODO Implement this method.

		String filename = "Cart"+cart.getCartId();
		try (PrintWriter pwriter = new PrintWriter(new FileWriter(filename))) {
			
		   pwriter.println(cart.toString());
		} catch (IOException e) {
			throw new RuntimeException("problem writing to file " + filename, e);
		}
		
	}

	/**
	 * Retrieves a Cart object given the ID. Looks for the data in a file named
	 * "Cart" plus the Cart ID. For example, if the Cart ID is 4, the filename
	 * is "Cart4".
	 */
	public Cart findCartById(int id) {
		// TODO Implement this method.
		String filename = "Cart"+id;
		Cart cart = new Cart(id);
		
	
		try (BufferedReader breader = new BufferedReader(new FileReader(filename))) {
		while (breader.ready()) {
		String line = breader.readLine();
		
		String[] productKeyPair1 = line.split("[{]");
		String[] productKeyPair2 = productKeyPair1[1].split("[}]");
		String[] productList = productKeyPair2[0].split(", ");
		for (String x : productList) {
		
			String[] keyValue = x.split("=");
			cart.setQuantity(Product.valueOf(keyValue[0]), Integer.parseInt(keyValue[1]));
		}
		
		

		}
		} catch (IOException e) {
		throw new RuntimeException("problem reading from file " + filename, e);
		}
		
		return cart;
	}
}

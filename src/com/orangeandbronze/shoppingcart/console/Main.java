package com.orangeandbronze.shoppingcart.console;

import static com.orangeandbronze.shoppingcart.domain.Product.*;

import com.orangeandbronze.shoppingcart.domain.*;
import com.orangeandbronze.shoppingcart.storage.*;

public class Main {

	public static void main(String[] args) {
		Cart cart1 = new Cart(1);
		cart1.add(HAT);
		cart1.add(BAG, 3);
		cart1.add(BAG);
		cart1.add(HAT);
		cart1.setQuantity(SHOES, 4);
		cart1.setQuantity(SHOES, 1);
		System.out.println(cart1); // Cart #1 {HAT=2, BAG=4, SHOES=1}
		System.out.println(cart1.getQuantity(TOY)); // 0
		Repository r = new Repository();
		r.saveCart(cart1);
		
		Cart cart2 = new Cart(2);
		cart2.add(PHONE, 2);
		cart2.add(BOOK, 5);
		cart2.add(SHIRT);
		cart2.add(HAT);
		System.out.println(cart2); // Cart #2 {PHONE=2, SHIRT=1, HAT=1, BOOK=5}
		r.saveCart(cart2);
		
		Cart cart1Retrieved = r.findCartById(1);
		System.out.println(cart1Retrieved); // Cart #1 {HAT=2, BAG=4, SHOES=1}		
		System.out.println(cart1.equals(cart1Retrieved)); // true
		
		Cart cart2Retrieved = r.findCartById(2);
		System.out.println(cart2Retrieved); // Cart #2 {PHONE=2, SHIRT=1, HAT=1, BOOK=5}
		System.out.println(cart2.equals(cart2Retrieved)); // true
	}

}

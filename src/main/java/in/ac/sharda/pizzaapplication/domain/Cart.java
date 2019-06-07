package in.ac.sharda.pizzaapplication.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> products
			= new ArrayList<>();
	private int i;
	
	public Cart(int i) {
		super();
		this.products = products;
		this.i = i;
	}

	public void addProduct(Product product){
		this.products.add(product);
	}
}

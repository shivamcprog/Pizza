package in.ac.sharda.pizzaapplication.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {


	@GetMapping("/Cart/list")
	public List<Cart> Cart(){
		List<Cart> Carts = new ArrayList<>();
		for(int i = 1; i < 20; i++){
			Carts.add(new Cart(i));
		}
		return Carts;
	}
}




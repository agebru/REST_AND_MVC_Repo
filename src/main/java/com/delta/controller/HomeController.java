package com.delta.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.delta.model.Product;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("welcome", "Welcome to Spring MVC Tutorial");
		return "home";
	}
	
	
	@RequestMapping(value="/all-products",method=RequestMethod.GET)
	public String getAllProducts(Model model) {
		
		Product product1 = new Product(101,"Laptop",600.0);
		Product product2 = new Product(104,"TV",200.0);
		Product product3 = new Product(106,"laundry",450.0);
		List<Product> allProducts=new ArrayList<>(Arrays.asList(product1,product2,product3));
	
		model.addAttribute("products", allProducts);
		return "products-form";
	}

}

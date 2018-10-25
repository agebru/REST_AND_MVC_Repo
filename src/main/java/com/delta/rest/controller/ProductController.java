package com.delta.rest.controller;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.delta.model.Product;

@RestController
public class ProductController {
	
	private static List<Product> products=new ArrayList<>();
	private static DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm");
	
	 static {
		 Product product1 = new Product(101,"Laptop",600.0);
		 LocalDateTime byingdate1=LocalDateTime.now();
		 product1.setBuyingDate(byingdate1);
		
		 
		 
		 
			Product product2 = new Product(104,"TV",200.0);
			LocalDateTime byingdate2=LocalDateTime.of(2017, Month.APRIL, 24, 06, 45, 00, 00);
			product2.setBuyingDate(byingdate2);
			
			
			Product product3 = new Product(106,"laundry",450.0);
			LocalDateTime byingdate3=LocalDateTime.of(2016, Month.MAY, 06, 10, 35, 00, 00);
			product2.setBuyingDate(byingdate3);
			
			 products=new ArrayList<>(Arrays.asList(product1,product2,product3));
		 
	 }
	
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public ResponseEntity<List<Product>> allProducts(){
		List<Product> productList=new ArrayList<>();
		for(Product p:products) {			
			if(p!=null ) {
				
				if(p.getBuyingDate()!=null) {
					String formattedDate = p.getBuyingDate().format(formatter);
					p.setFormatedBuyingDate(formattedDate);
					//p.setBuyingDate(buyingDate);
					productList.add(p);
				}
				
				if(!productList.contains(p)) {
					productList.add(p);
				}
				
				
			}
			
		}
		
		
		return new ResponseEntity<>(productList,HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="/products/{productId}",method=RequestMethod.GET)
	public Optional <Product> oneProducts(@PathVariable("productId") int productId){
		
		return products.stream().filter(pr->pr.getProductId()==productId).findFirst();
		
	}

}

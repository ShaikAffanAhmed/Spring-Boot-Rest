package com.app.affan.service;

import org.springframework.stereotype.Service;

import com.app.affan.entity.Product;
import com.app.affan.exception.ProductNotFoundException;

@Service
public class ProductService {

	public Product getOneProductById(Integer id)
	{
		if(id == 150)
		{
			return new Product(id,"DUMMY");
		}
		else
			throw new ProductNotFoundException("PRODUT '"+id+"' NOT Exist" );
	}
}

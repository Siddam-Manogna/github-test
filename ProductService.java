package com.product.service;



import com.product.dao.ProductDao;
import com.product.model.Product;

public class ProductService {
	public static void main(String[] args) {

		Product product=new Product(1,"Coffee",20,1,12,"Bru");

		ProductDao dao=new ProductDao();
		System.out.println(dao.createProduct(product));
		//System.out.println(dao.deletedata());
		//dao.displaydata();
		
		
}
}

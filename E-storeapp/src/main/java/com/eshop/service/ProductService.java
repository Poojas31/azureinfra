package com.eshop.service;

/**
* ProductService interface to declare the methods
*
* @author  Navinkumar
* @email   navinkumar.boddu@in.fujitsu.com
*/

import java.util.List;

import com.eshop.model.Product;

public interface ProductService {

	public Product findProductById(int id);

	public List<Product> getProductList();

	public void save(Product product);

	public void edit(Product product);

	public void delete(Product product);

}
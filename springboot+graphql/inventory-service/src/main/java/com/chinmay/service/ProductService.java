package com.chinmay.service;

import com.chinmay.entity.Product;
import com.chinmay.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getProducts(){
         return repository.findAll();
    }

    public List<Product> getProductsByCategory(String category){
        return repository.findByCategory(category);
    }

    // sales team want to update stock of a product in inventory system
    public  Product updateStock(int id, int stock){

        Product existingProduct = repository.findById(id).orElseThrow(() -> new RuntimeException("product not found with id " + id));

        existingProduct.setStock(stock);

        return repository.save(existingProduct);
    }

    // warehouse : receive a new shipment. check current stock available and add new stock to it
    public  Product receiveNewShipment(int id, int quantity){

        Product existingProduct = repository.findById(id).orElseThrow(() -> new RuntimeException("product not found with id " + id));

        existingProduct.setStock(existingProduct.getStock() + quantity);

        return repository.save(existingProduct);
    }
}
// retrive method to fetch all product from inventory

// method to fetch a single or group of records of product by condition
// define your custom method to convert it as a query
// findBy is a filter Category is a field on which you want to filter. Spring Data JPA will convert that to a query
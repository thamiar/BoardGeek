package com.boardgeek.dao;

import com.boardgeek.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.setProductName("Smallworld");
        product1.setProductCategory("Board game");
        product1.setProductDescription("Board game for fun");
        product1.setProductPrice(95);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fantasy Flight Games");
        product1.setProductId("P123");


        product2.setProductName("Imperial Assult");
        product2.setProductCategory("Board game");
        product2.setProductDescription("Different board game");
        product2.setProductPrice(120);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitInStock(1);
        product2.setProductManufacturer("Fantasy Flight Games");
        product2.setProductId("P567");

        product3.setProductName("Warhammer Fantasy Role Play Manual");
        product3.setProductCategory("Role Playing Game");
        product3.setProductDescription("Main manual");
        product3.setProductPrice(35);
        product3.setProductCondition("new");
        product3.setProductStatus("Active");
        product3.setUnitInStock(11);
        product3.setProductManufacturer("Wizards of the Coast");
        product3.setProductId("P9");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        return productList;
    }


    public Product getProductById(String productId) throws IOException{

        for(Product product : productList){
            if(product.getProductId().equals(productId)){ return product;}
        }

        throw new IOException("No product found.");
    }
}

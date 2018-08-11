package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InMemoryProductRepository implements ProductRepository {
    private List<Product> listOfProduct = new ArrayList<Product>();

    public InMemoryProductRepository(){

        Product iphone = new Product("P1234", "iphone 5s", new BigDecimal(500));
        iphone.setDescription("Apple iPhone 5s, smartphone z 4- calowym ekranem");
        iphone.setCategory("Smartphone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsIntock(1000);

        Product laptopDell = new Product("P1235","Dell Inspirion", new BigDecimal(700));
        laptopDell.setDescription("Dell Inspirion, 14-calowy laptop (czarny)");
        laptopDell.setManufacturer("Dell");
        laptopDell.setUnitsIntock(1000);

        listOfProduct.add(iphone);
        listOfProduct.add(laptopDell);

    }

    public List<Product> getAllProduct(){
        return listOfProduct;
    }
}
